package com.example.to_docompose.data.repositories

import com.example.to_docompose.data.ToDoDao
import com.example.to_docompose.data.models.ToDoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ToDoRepository @Inject constructor(
    private val toDoDao: ToDoDao
){
    val getAllTasks: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
}