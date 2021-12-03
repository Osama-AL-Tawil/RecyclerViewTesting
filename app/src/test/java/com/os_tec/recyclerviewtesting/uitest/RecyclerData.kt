package com.os_tec.recyclerviewtesting.uitest

import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class RecyclerData :AppCompatActivity(){
    var recyclerView: RecyclerView? = null
    var recyclerItem= ArrayList<Int>()
//    var adapter: adapter_ListData? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_list_data)
//        listView = findViewById(R.id.listView)
//        listItem = resources.getStringArray(R.array.array_technology)
//        adapter = adapter_ListData(applicationContext, listItem)
//        listView.setAdapter(adapter)
//    }
}