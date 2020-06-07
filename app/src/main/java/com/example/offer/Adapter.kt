package com.example.offer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.listofitem.view.*

class Adapter(val list:ArrayList<ItemList>): RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val ifl = LayoutInflater.from(parent.context).inflate(R.layout.listofitem, parent, false);
        return (ViewHolder(ifl));
    }

    override fun getItemCount(): Int {
        return (list.size);
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt1.text = (list[position].txt);
        holder.img1.setImageResource(list[position].img);
    }

}
class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    val img1:ImageView  = itemView.image3;
    val txt1:TextView = itemView.text3;
}
