package com.example.todo

import kotlin.io.*
import kotlinx.serialization.*
import kotlinx.serialization.json.JSON
import kotlinx.serialization.json.json
import java.io.BufferedReader
import java.io.File

@Serializable
@ImplicitReflectionSerializer
class ListOfTasks {
    var list = mutableListOf<Task>()

    fun addTask(){
        list.add(Task("test"))
    }

    fun deleteTask(){

    }

    fun saveList(){
        var serializer = JSON()
        var serializedResult: String = serializer.stringify(list)

        // write string to file locally
        File("test").writeText(serializedResult)

//        // parsing data back
//        var obj = json.parse(Data.serializer(), """{"a":42}""") // b is optional since it has default value
    }

    fun readListData():String {
        var serializer = JSON()
        var jsonRead = File("test").bufferedReader().toString()
        return serializer.parse<String>(jsonRead)
    }
}