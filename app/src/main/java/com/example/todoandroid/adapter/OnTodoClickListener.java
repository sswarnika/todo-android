package com.example.todoandroid.adapter;

import com.example.todoandroid.model.Task;

public interface OnTodoClickListener {
    void onTodoClick(Task task);
    void onTodoRadioButtonClick(Task task);
}
