package com.os_tec.recyclerviewtesting

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.Matchers
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class RecyclerViewTest {
    @get:Rule
    val activityRule=ActivityScenarioRule(MainActivity::class.java)
    val lastItemPosition=19
    val LAST_ITEM="20"


    @Test
    fun isRecyclerVisible_onAppLaunch(){
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }

    @Test
    fun lastItem_NotDisplayed() {
        Espresso.onView(ViewMatchers.withText(LAST_ITEM)).check(ViewAssertions.doesNotExist())
    }

    @Test
    fun lastItem_IsDisplayed() {
        Espresso.onView(ViewMatchers.withText(LAST_ITEM))
            .check(ViewAssertions.matches(Matchers.not(ViewAssertions.doesNotExist())))
    }


    @Test
    fun list_Scrolls() {

        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(lastItemPosition))
            .check(ViewAssertions.matches(ViewMatchers.hasDescendant(ViewMatchers.withText(LAST_ITEM))))
            .check(ViewAssertions.matches(ViewMatchers.isCompletelyDisplayed()))
    }

    @Test
    fun row_Click()
    {
        Espresso.onView(ViewMatchers.withId(R.id.recyclerView))
            .perform(
                RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                    lastItemPosition,
                    ViewActions.click()
                )
            )
    }

}