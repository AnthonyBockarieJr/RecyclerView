 package edu.temple.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.temple.recyclerview.model.DogPictures

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView(){
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = GridLayoutManager(this, 2)
        val dogGridAdapter = DogGridAdapter ()
        dogGridAdapter.listofDogPictures = generateData()
        findViewById<RecyclerView>(R.id.recyclerView).adapter = dogGridAdapter

    }

    private fun  generateData(): List<DogPictures> {
        val listOfDogPictures : MutableList<DogPictures> = mutableListOf<DogPictures>()

        var dogPicture = DogPictures(1, "Autumn Dog", R.drawable.autumndog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(2, "Autumn Dog", R.drawable.bunnydog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(3, "Autumn Dog", R.drawable.confuseddog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(4, "Autumn Dog", R.drawable.diversepups)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(5, "Autumn Dog", R.drawable.dogwithrose)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(6, "Autumn Dog", R.drawable.heterochromiadog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(7, "Autumn Dog", R.drawable.leafdog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(8, "Autumn Dog", R.drawable.sleepydogs)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(9, "Autumn Dog", R.drawable.snowdog)
        listOfDogPictures.add(dogPicture)

        dogPicture = DogPictures(10, "Autumn Dog", R.drawable.underweardog)
        listOfDogPictures.add(dogPicture)

        return listOfDogPictures
    }
}