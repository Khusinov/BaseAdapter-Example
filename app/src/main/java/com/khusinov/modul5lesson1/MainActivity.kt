package com.khusinov.modul5lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.khusinov.modul5lesson1.model.ImageData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.item.view.*

class MainActivity : AppCompatActivity() {

    var list = ArrayList<ImageData>()
    lateinit var arrayAdapter: ArrayAdapter<String>
    val stringList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loadStringList()
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, stringList)
        list_view.adapter = arrayAdapter


    }

    private fun loadStringList() {
        for (i in 1..100) {
            stringList.add("Item element ${i}")
        }
    }
}