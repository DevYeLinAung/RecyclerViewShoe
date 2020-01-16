package com.example.recyclerviewshoe.adapter

import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewshoe.R
import com.example.recyclerviewshoe.model.Shoe
import kotlinx.android.synthetic.main.shoe_item.view.*

class ShoeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var shoeNo = itemView.findViewById<TextView>(R.id.txt_no)
    var shoeImage = itemView.findViewById<ImageView>(R.id.shoe_image)
    var shoeName = itemView.findViewById<TextView>(R.id.shoe_name)
    var shoePrice = itemView.findViewById<TextView>(R.id.shoe_price)

}

class shoeAdapter(val shoeList: ArrayList<Shoe>) : RecyclerView.Adapter<ShoeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shoe_item, parent, false)
        return ShoeViewHolder(view)

    }

    override fun getItemCount(): Int {
        return shoeList.size

    }

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.shoeNo.text= shoeList[position].no
        holder.shoeImage.setImageResource(shoeList[position].image)
        holder.shoeName.text = shoeList[position].name
        holder.shoePrice.text = shoeList[position].price

    }

}