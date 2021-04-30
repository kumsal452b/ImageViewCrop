package com.kumsal.imageviewcrop

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.DisplayMetrics
import android.util.TypedValue
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var imageView:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)

        var bitmap=BitmapFactory.decodeResource(resources, R.drawable.test2)
        var scaling=Scalling()
//        val displayMetrics = DisplayMetrics()
//        windowManager.defaultDisplay.getMetrics(displayMetrics)
//        val height = displayMetrics.heightPixels
//        val width = displayMetrics.widthPixels
        val dip = 500f
        val r: Resources = Resources.getSystem()
        val px = TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                r.displayMetrics
        )
        imageView.setImageBitmap(scaling.scaleToFitHeight(bitmap,px.toInt()))

//        imageView.setImageBitmap(bitmap)
    }
}