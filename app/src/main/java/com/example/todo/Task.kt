package com.example.todo

import kotlinx.serialization.Serializable

@Serializable
class Task(var title: String = "", var description: String = ""){
    var status : Boolean
        get()= status
        set(value){
            status = true
        }

    fun addDesctiption(){
        description = readLine().toString()
    }
    fun rename(){
        title = readLine().toString()
    }
    fun isDone(){
        status = true
    }
}