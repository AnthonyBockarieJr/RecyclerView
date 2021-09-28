package edu.temple.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import edu.temple.recyclerview.model.DogPictures

class DogGridAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> () {
    var listofDogPictures = listOf<DogPictures>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return GridViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as GridViewHolder).bindView(listofDogPictures[position])
    }

    override fun getItemCount(): Int {
        return listofDogPictures.size
    }

}