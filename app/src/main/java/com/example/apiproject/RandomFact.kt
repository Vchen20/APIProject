package com.example.apiproject

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.*

@Parcelize
data class RandomFact(
    val fact : String
) : Parcelable
