package com.example.curlinggame

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import java.util.*

class Cible (var rayonC : Float, val  view: CurlingView) {
    val random = Random()
    val ciblePaint = Paint()
    val rand1 = random.nextFloat() * view.width
    val rand2 = random.nextFloat() * view.height
    var r4 = RectF( rand1 - rayonC,rand2-rayonC, rand1 + rayonC, rand2 + rayonC)

    fun rand(from: Int, to: Int): Int {
        return random.nextInt(to - from) + from
    }
    fun draw(canvas: Canvas) {
        val NB_R = rand(0, 2)
        var NB_C = 0
        while (NB_C < 10) {
            NB_C++
            if (NB_R == 0) {
                ciblePaint.color = Color.YELLOW
                canvas.drawRect(r4, ciblePaint)
                canvas.drawText("5", rand1 , rand2, ciblePaint)
            }
            else if (NB_R == 1) {
                ciblePaint.color = Color.RED
                canvas.drawRect(r4, ciblePaint)
                canvas.drawText("10", rand1, rand2, ciblePaint)
            }
            else if (NB_R == 2) {
                ciblePaint.color = Color.BLUE
                canvas.drawOval(r4, ciblePaint)
                canvas.drawText("10", rand1, rand2, ciblePaint)
            }
        }
    }

    fun setRect() {
        r4.set(rand1 - rayonC,rand2-rayonC, rand1 + rayonC, rand2 + rayonC)
    }
}