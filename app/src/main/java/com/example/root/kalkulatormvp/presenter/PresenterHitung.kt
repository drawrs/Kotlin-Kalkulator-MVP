package com.example.root.kalkulatormvp.presenter

import android.util.Log

/**
 * Created by Rizal Hilman on 8/27/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class PresenterHitung {
    var presenterV : PresenterView? = null

    constructor(presenterV: PresenterView?) {
        this.presenterV = presenterV
        Log.d("Masuk Const", "Constructor")
    }

    fun HitungKali(x: Int, y: Int){
        var a = x
        var b = y
        var hasil : Double = a.toDouble() * b.toDouble()
        Log.d("Hitung deh hasilnya", ""+hasil)
        presenterV?.HasilHitung(hasil)
    }
    fun HitungBagi(x: Int, y: Int){
        var a = x
        var b = y
        var hasil : Double = a.toDouble() / b.toDouble()
        presenterV?.HasilHitung(hasil)
    }
    fun HitungKurang(x: Int, y: Int){
        var a = x
        var b = y
        var hasil : Double = a.toDouble() - b.toDouble()
        presenterV?.HasilHitung(hasil)
    }fun HitungTambah(x: Int, y: Int){
        var a = x
        var b = y
        var hasil : Double = a.toDouble() + b.toDouble()
        presenterV?.HasilHitung(hasil)
    }

}