package com.dany.drawprimitives

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Drawing(context: Context?) : View(context) {

    private lateinit var brush: Paint
    private lateinit var lineBrush: Paint

    override fun draw(canvas: Canvas?) {

        brush = Paint(Paint.ANTI_ALIAS_FLAG)
        lineBrush = Paint(Paint.ANTI_ALIAS_FLAG)
        lineBrush.strokeWidth = 16f

        brush.color = Color.parseColor("blue")
        lineBrush.color = Color.CYAN

        // Draw a circle:
        canvas?.drawCircle((measuredWidth/2).toFloat(), (measuredHeight/2).toFloat(), 60f, brush)

        // Draw a line:
        canvas?.drawLine(0F, 0F, measuredWidth/2.toFloat(), measuredHeight/2.toFloat(), lineBrush)

        canvas?.save()
        super.draw(canvas)
    }
}