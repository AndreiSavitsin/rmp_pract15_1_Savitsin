package com.example.rmp_pract15_1_savitsin.recadapters

import com.example.rmp_pract15_1_savitsin.R

data class state(val title:String, val text_state:String, val image_state: Int)
class MyState{
    val state_list = arrayListOf(state("Заголовок статьи", "Краткое описание", R.drawable.state1),
        state("Заголовок статьи", "Краткое описание", R.drawable.state2)
    )
}
