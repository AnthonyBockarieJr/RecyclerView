package edu.temple.recyclerview.model

data class DogPictures(var dogID : Int, var dogPicTitle : String, var dogImage: Int?){
    constructor() : this(
        dogID = 0,
        dogPicTitle = "",
        dogImage = null
    )
}
