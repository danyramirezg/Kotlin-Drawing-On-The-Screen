package com.dany.drawprimitives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val drawing = Drawing(this)

        setContentView(drawing)
        drawing.setOnClickListener{
            Toast.makeText(this, "Hi Dany!", Toast.LENGTH_SHORT).show()
        }

        val bitMap = BitMap(this)
        setContentView(bitMap)

    }
}