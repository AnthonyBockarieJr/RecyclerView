package edu.temple.recyclerview

import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import edu.temple.recyclerview.model.DogPictures
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class GridViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    fun bindView(dogPic: DogPictures) {
        itemView.findViewById<TextView>(R.id.dogPicTitle).text = dogPic.dogPicTitle

        Glide.with(itemView.context).load(dogPic.dogImage).into(itemView.findViewById<ImageView>(R.id.dogImage))
    }
}