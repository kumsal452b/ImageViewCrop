package com.kumsal.imageviewcrop

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.ImageView
import java.io.File
import java.io.InputStream
import java.net.URI

class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)

        var bitmap=BitmapFactory.decodeResource(resources,R.drawable.test)
        var scaling=Scalling()
        val dip = 430f
        val r: Resources = Resources.getSystem()
        val px = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                r.displayMetrics
        )
        imageView.setImageBitmap(Bitmap.createBitmap(bitmap,0,0,
                px.toInt(),px.toInt()))

    }
}