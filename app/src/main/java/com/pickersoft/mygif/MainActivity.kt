package com.pickersoft.mygif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // run gif function.
        showGIF()
    }

    // add code to animate gif image.
    fun showGIF() {
        val imageView:ImageView = findViewById(R.id.imageView)
        Glide.with(this).load(R.drawable.android).into(imageView)
    }
}