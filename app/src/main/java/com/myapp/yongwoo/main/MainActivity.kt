package com.myapp.yongwoo.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.myapp.yongwoo.R
import com.myapp.yongwoo.room.entity.TodoItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var adapter: MainTodoAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = MainTodoAdapter(this)
        main_rcv_item.adapter = adapter
        main_rcv_item.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)

        main_fab_add.setOnClickListener{
            val newItem = TodoItem(0,System.currentTimeMillis().toString(), "df", "df")
            adapter?.addItem(newItem)
        }
    }
}
