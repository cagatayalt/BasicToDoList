package com.example.basictodolist

data class Todo(
    val title: String,
    var isChecked : Boolean = false
)

// Here,     val isChecked : Boolean = false means it is defined false by default.
