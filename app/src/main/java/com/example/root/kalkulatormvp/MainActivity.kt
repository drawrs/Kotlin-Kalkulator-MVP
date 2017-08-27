package com.example.root.kalkulatormvp

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.root.kalkulatormvp.presenter.PresenterHitung
import com.example.root.kalkulatormvp.presenter.PresenterView
import kotlinx.android.synthetic.main.activity_main.*
/**
 * Created by Rizal Hilman on 8/27/17.
 * rizal.drawrs@gmail.com
 * fb.me/rizal.ofdraw
 */
class MainActivity : AppCompatActivity(), PresenterView {

    // deklarasi
    var presenter : PresenterHitung? = null

    override fun onStart() {
        super.onStart()
        presenter = PresenterHitung(this)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = edtnilaix.text
        var y = edtnilaiy.text

        btnKali.setOnClickListener {
            if(x.isNotEmpty() && y.isNotEmpty()){
                presenter?.HitungKali(x.toString().toInt(),y.toString().toInt())
            }
        }
        btnPlus.setOnClickListener {
            if(x.isNotEmpty() && y.isNotEmpty()){
                presenter?.HitungTambah(x.toString().toInt(),y.toString().toInt())
            }
        }
        btnBagi.setOnClickListener {
            if(x.isNotEmpty() && y.isNotEmpty()){
                presenter?.HitungBagi(x.toString().toInt(),y.toString().toInt())
            }
        }
        btnKurang.setOnClickListener {
            if(x.isNotEmpty() && y.isNotEmpty()){
                presenter?.HitungKurang(x.toString().toInt(),y.toString().toInt())
            }
        }

    }
    override fun HasilHitung(nilai: Double) {
        Log.d("Masuk hasik", ""+nilai)
        //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        txtHasil.text = nilai.toString()
    }

}
