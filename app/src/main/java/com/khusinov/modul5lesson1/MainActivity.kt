package com.khusinov.modul5lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ArrayAdapter
import com.khusinov.modul5lesson1.adapters.ImageBaseAdapter
import com.khusinov.modul5lesson1.model.ImageData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item.*
import kotlinx.android.synthetic.main.item.view.*

class MainActivity : AppCompatActivity() {

    var list = ArrayList<ImageData>()
    lateinit var imageBaseAdapter: ImageBaseAdapter
    val stringList = ArrayList<ImageData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        loadStringList()

        imageBaseAdapter = ImageBaseAdapter(stringList)
        list_view.adapter = imageBaseAdapter

    }

    private fun loadStringList() {
        for (i in 1..100) {
            stringList.add(ImageData("https://storage.kun.uz/source/thumbnails/_medium/8/GiP97o64KueIiMcX3j2NZv8dglnFOvmm_medium.jpg" , "Mehribonlik uyi 1 "))
          }
    }
}