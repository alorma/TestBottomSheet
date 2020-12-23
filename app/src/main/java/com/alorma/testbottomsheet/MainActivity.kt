package com.alorma.testbottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.recycler)

        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = Adapter()
    }


    class Adapter : RecyclerView.Adapter<Adapter.Holder>() {

        class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            fun bind(text: String) {
                itemView.findViewById<TextView>(android.R.id.text1).text = text
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
            return Holder(
                LayoutInflater.from(parent.context).inflate(
                    android.R.layout.simple_list_item_1,
                    parent,
                    false
                ),
            )
        }

        override fun onBindViewHolder(holder: Holder, position: Int) {
            holder.bind("Item $position")
        }

        override fun getItemCount(): Int = 1000

    }
}