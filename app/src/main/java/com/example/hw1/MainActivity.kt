package com.example.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.adapter.ItemAdapter
import com.data.DataSourse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countries = DataSourse(this).loadCities()
        val rv: RecyclerView = findViewById(R.id.recyclerView)
        rv.adapter = ItemAdapter(countries)
        rv.setHasFixedSize(true)

    }
}