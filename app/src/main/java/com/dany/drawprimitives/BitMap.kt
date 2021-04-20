package com.dany.drawprimitives

import android.content.Context
import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.view.View

class BitMap(context: Context?) : View(context) {

    override fun draw(canvas: Canvas?) {

        //Shows the image

        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.profile_picture)

        canvas?.drawBitmap(bitmap, (measuredWidth/2).toFloat() - (bitmap.width/2), measuredHeight/2.toFloat() - (bitmap.height/2), null)

        canvas?.save()
        super.draw(canvas)
    }
}