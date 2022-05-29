package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.DataSource
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize Data
        val myDataset = DataSource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)

//        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // This setting is only needed to improve performance if you know that changes
        // in content do not change the layout size of the Recycler View.
        recyclerView.setHasFixedSize(true)
    }
}