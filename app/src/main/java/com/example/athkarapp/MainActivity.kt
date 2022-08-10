package com.example.athkarapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.athkarapp.adapter.AthkarAdapter
import com.example.athkarapp.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Data source
        val athkarList = Datasource().loadAthkar()

        // adapter
        val adapter = AthkarAdapter(athkarList, this)

        // recyclerView
        val recyclerView : RecyclerView = findViewById(R.id.rv_athkar)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }
}