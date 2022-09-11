package com.example.simpletodo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val listOfTasks = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Lets detect when the user clicks the add button.
//        findViewById<Button>(R.id.button).setOnClickListener {
//            // Code will be executed when user clicks on button.
//            Log.i("Andrew", "Clicked on a button")
//        }
        listOfTasks.add("Go for a walk")
        listOfTasks.add("Do the laundry")

        // Look up recyclerView in the layout
        val recyclerView = findViewById<View>(R.id.recyclerView)
        // Create adapter passing in the sample user data
        val adapter = TaskItemAdapter(listOfTasks)
        // Attach the adapter to the recyclerview to populate items
        recyclerView.adapter = adapter
        // Set layout manager to position the items
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}