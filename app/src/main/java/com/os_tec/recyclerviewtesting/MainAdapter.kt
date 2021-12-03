package com.os_tec.recyclerviewtesting

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.os_tec.recyclerviewtesting.databinding.RcMainBinding

class MainAdapter(val activity: Activity, val data: ArrayList<Int>) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = RcMainBinding.bind(itemView)
        val textView = binding.tvNum
//        val btn = binding.btn
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(activity).inflate(R.layout.rc_main, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = data[position].toString()

    }

    override fun getItemCount(): Int {
        return data.size
    }
}