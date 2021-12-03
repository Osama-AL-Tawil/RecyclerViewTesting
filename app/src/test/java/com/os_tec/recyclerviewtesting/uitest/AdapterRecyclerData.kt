package com.os_tec.recyclerviewtesting.uitest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList

class AdapterRecyclerData{
//    private var context: Context? = null
//    private var data: List<String>? = null
//
//    fun adapterRecyclerData(context: Context?, data: ArrayList<Int>) {
//        this.context = context
//        val items = ArrayList<Int>()
//        this.data = items
//    }
//
//    override fun getCount(): Int {
//        return data!!.size
//    }
//
//    override fun getItem(position: Int): Any? {
//        return data!![position]
//    }
//
//    override fun getItemId(position: Int): Long {
//        return 0
//    }
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
//        var convertView = convertView
//        if (convertView == null) {
//            val inflater =
//                context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            convertView = inflater.inflate(R.layout.mylist, parent, false) as View?
//        }
//        val t1 = convertView!!.findViewById<View>(R.id.textView) as TextView
//        val b1 = convertView.findViewById<View>(R.id.button) as Button
//        t1.text = data!![position]
//        b1.setOnClickListener { Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show() }
//        val context = convertView.context
//        convertView.setOnClickListener {
//            Toast.makeText(context, data!![position], Toast.LENGTH_LONG).show()
//        }
//        return convertView
//    }
}