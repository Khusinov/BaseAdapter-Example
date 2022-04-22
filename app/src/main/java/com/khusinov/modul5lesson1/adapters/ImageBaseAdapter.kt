package com.khusinov.modul5lesson1.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.khusinov.modul5lesson1.R
import com.khusinov.modul5lesson1.model.ImageData
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item.view.*

class ImageBaseAdapter(var list: List<ImageData>) : BaseAdapter() {
    private  val TAG = "ImageBaseAdapter"
    override fun getCount(): Int = list.size

    override fun getItem(p0: Int): ImageData = list[p0]

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {

        var itemView = p1 ?: LayoutInflater.from(p2?.context).inflate(R.layout.item, p2, false)

        Picasso.get().load(list[p0].imageUrl).into(itemView.image_view)
        itemView.text_view.text = list[p0].name.toString()
        Log.d(TAG, "getView:${list[p0].name.toString()} ")

        return itemView

    }
}