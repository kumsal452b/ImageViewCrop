package com.kumsal.imageviewcrop

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import java.io.File
import java.net.URI

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)
        var file=File(URI.create())
        var bitmap=BitmapFactory.decodeFile()


    }
}