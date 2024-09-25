package com.example.cameraxlandmark.presentation

import android.graphics.Bitmap
import androidx.core.graphics.component1
import java.lang.IllegalArgumentException

fun Bitmap.centerCrop(desiredWidth: Int, desiredHeight: Int): Bitmap {
    val (xStart) = (width - desiredWidth) / 2
    val (yStart) = (height - desiredHeight) / 2
    if(xStart < 0 || yStart < 0 || desiredWidth > width || desiredHeight > height) {
        throw IllegalArgumentException("Invalid arguments for center croping")
    }

    return Bitmap.createBitmap(
        this,
        xStart,
        yStart,
        desiredWidth,
        desiredHeight
    )
}