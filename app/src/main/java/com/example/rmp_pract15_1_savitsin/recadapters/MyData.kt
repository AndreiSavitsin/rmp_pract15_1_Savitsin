package com.example.rmp_pract15_1_savitsin.recadapters

import com.example.rmp_pract15_1_savitsin.R

data class feel(val image:Int, val name_feel:String)
class MyFeel{val list = arrayListOf(feel(R.drawable.calm, ""),
    feel(R.drawable.relax, "Расслабленным"),
    feel(R.drawable.concentrated, "Сосредоточенным"),
    feel(R.drawable.anxious, "Взволнованным")
)
}
