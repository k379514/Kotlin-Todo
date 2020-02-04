package com.myapp.yongwoo.main

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.myapp.yongwoo.room.entity.TodoItem
import kotlinx.android.synthetic.main.item_todo.view.*

class MainTodoVeiwHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun onBind(item: TodoItem) {
        itemView.todo_cb.isChecked = item.checked
        itemView.todo_tv_name.text = item.name
    }
}