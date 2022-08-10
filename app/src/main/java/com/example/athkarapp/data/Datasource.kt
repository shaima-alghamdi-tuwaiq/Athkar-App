package com.example.athkarapp.data

import com.example.athkarapp.R
import com.example.athkarapp.model.Athkar

class Datasource {

    // list of items
    fun loadAthkar() : List<Athkar>{
        return listOf(
            Athkar(R.string.athkar1, R.drawable.image1),
            Athkar(R.string.athkar2, R.drawable.image2),
            Athkar(R.string.athkar3, R.drawable.image3),
            Athkar(R.string.athkar4, R.drawable.image4),
            Athkar(R.string.athkar5, R.drawable.image5),
            Athkar(R.string.athkar6, R.drawable.image6)
        )
    }
}