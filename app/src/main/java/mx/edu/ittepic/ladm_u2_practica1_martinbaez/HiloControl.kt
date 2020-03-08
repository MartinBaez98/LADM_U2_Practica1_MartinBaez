package mx.edu.ittepic.ladm_u2_practica1_martinbaez

class HiloControl(p:MainActivity):Thread(){
    var puntero = p

    override fun run() {
        super.run()
        sleep(8000)
        while(true){
            sleep(15)
            puntero.runOnUiThread {
                puntero.lienzo!!.climaNevado()
            }
        }
    }
}