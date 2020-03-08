package mx.edu.ittepic.ladm_u2_practica1_martinbaez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.view.MotionEvent
import android.view.View

class Lienzo(p:MainActivity) : View(p) {
    /*Paisaje*/
    var puntero = p
    val path = Path()
    var suelo =FiguraGeometrica(0,480,480,300)
    var casa = FiguraGeometrica(140, 400, 180, 120)
    var ventana = FiguraGeometrica(180, 440, 20)
    var puerta = FiguraGeometrica(220, 450, 40, 70)
    var tronco = FiguraGeometrica(40,430,40, 80)
    var hojas1 = FiguraGeometrica(60,430,30)
    var hojas2 = FiguraGeometrica(60,400,30)

    /*Copos de nieve*/
    var circ1 = FiguraGeometrica(10,-500, 10)
    var circ2 = FiguraGeometrica(100,-300, 10)
    var circ3 = FiguraGeometrica(220,-440, 10)
    var circ5 = FiguraGeometrica(250,-320, 10)
    var circ6 = FiguraGeometrica(320,-370, 10)
    var circ7 = FiguraGeometrica(350,-480, 10)
    var circ8 = FiguraGeometrica(380,-390, 10)
    var circ9 = FiguraGeometrica(410,-320, 10)
    var circ10 = FiguraGeometrica(430,-330, 10)
    var circ11 = FiguraGeometrica(450,-420, 10)
    var circ12 = FiguraGeometrica(470,-470, 10)

    var circ21 = FiguraGeometrica(80,-350, 10)
    var circ22 = FiguraGeometrica(120,-350, 10)
    var circ23 = FiguraGeometrica(160,-410, 10)
    var circ25 = FiguraGeometrica(200,-290, 10)
    var circ26 = FiguraGeometrica(240,-320, 10)
    var circ27 = FiguraGeometrica(280,-430, 10)
    var circ28 = FiguraGeometrica(320,-340, 10)
    var circ29 = FiguraGeometrica(360,-280, 10)
    var circ20 = FiguraGeometrica(400,-380, 10)
    var circ33 = FiguraGeometrica(440,-470, 10)
    var circ34 = FiguraGeometrica(480,-420, 10)


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        var paint = Paint()
        var paintTriangulo = Paint()
        canvas!!.drawColor(Color.rgb(212,220,255))

        paint.color = Color.rgb(168,199,157)
        suelo.pintar(canvas, paint)

        paint.color = Color.rgb(198, 180, 100)
        casa.pintar(canvas, paint)

        paint.color = Color.rgb(212,220,255)
        ventana.pintar(canvas, paint)

        paint.color = Color.rgb(52,43,0)
        puerta.pintar(canvas, paint)

        paint.color = Color.rgb(37,33,13)
        tronco.pintar(canvas, paint)

        paint.color = Color.rgb(60,125,35)
        hojas1.pintar(canvas,paint)
        hojas2.pintar(canvas,paint)


        path.moveTo(220f, 360f)
        path.lineTo(130f, 400f)
        path.lineTo(330f, 400f)
        paintTriangulo.color = Color.rgb(232, 99, 146)
        canvas.drawPath(path, paintTriangulo)

        paint.color = Color.rgb(216,250,248)
        circ1.pintar(canvas,paint)
        circ2.pintar(canvas,paint)
        circ3.pintar(canvas,paint)
        circ5.pintar(canvas,paint)
        circ5.pintar(canvas,paint)
        circ6.pintar(canvas,paint)
        circ7.pintar(canvas,paint)
        circ8.pintar(canvas,paint)
        circ9.pintar(canvas,paint)
        circ10.pintar(canvas,paint)
        circ11.pintar(canvas,paint)
        circ12.pintar(canvas,paint)
        circ21.pintar(canvas,paint)
        circ22.pintar(canvas,paint)
        circ23.pintar(canvas,paint)
        circ25.pintar(canvas,paint)
        circ25.pintar(canvas,paint)
        circ26.pintar(canvas,paint)
        circ27.pintar(canvas,paint)
        circ28.pintar(canvas,paint)
        circ29.pintar(canvas,paint)
        circ20.pintar(canvas,paint)
        circ33.pintar(canvas,paint)
        circ34.pintar(canvas,paint)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
            }
            MotionEvent.ACTION_MOVE -> {
            }
            MotionEvent.ACTION_UP -> {
            }
        }
        invalidate()
        return true
    }

    fun climaNevado() {
        circ1.nevado(width, height)
        circ2.nevado(width, height)
        circ3.nevado(width, height)
        circ5.nevado(width, height)
        circ6.nevado(width, height)
        circ7.nevado(width, height)
        circ8.nevado(width, height)
        circ9.nevado(width, height)
        circ10.nevado(width, height)
        circ11.nevado(width, height)
        circ12.nevado(width, height)

        circ21.nevado(width,height)
        circ22.nevado(width,height)
        circ23.nevado(width,height)
        circ25.nevado(width,height)
        circ25.nevado(width,height)
        circ26.nevado(width,height)
        circ27.nevado(width,height)
        circ28.nevado(width,height)
        circ29.nevado(width,height)
        circ20.nevado(width,height)
        circ33.nevado(width,height)
        circ34.nevado(width,height)

        invalidate()
    }

}