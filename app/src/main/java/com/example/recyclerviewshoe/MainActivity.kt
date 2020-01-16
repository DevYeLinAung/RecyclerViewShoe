package com.example.recyclerviewshoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewshoe.adapter.shoeAdapter
import com.example.recyclerviewshoe.model.Shoe

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.shoe_recycler)
        val shoeArray = ArrayList<Shoe>()
        shoeArray.add(Shoe("001", R.drawable.shoe1, "Nike Swperfly", "$799"))
        shoeArray.add(Shoe("002", R.drawable.shoe2, "Air Vapermax", "$1280"))
        shoeArray.add(Shoe("003", R.drawable.shoe3, "Air Jordan", "$2400"))
        shoeArray.add(Shoe("004", R.drawable.shoe4, "LeBron XVI", "$31099"))
        shoeArray.add(Shoe("005", R.drawable.shoe5, "Jordan Why Not", "$2699"))
        shoeArray.add(Shoe("006", R.drawable.shoe6, "Nike Swperfly", "$1280"))
        val shoeAdapter = shoeAdapter(shoeArray)
//        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = shoeAdapter

    }
}
