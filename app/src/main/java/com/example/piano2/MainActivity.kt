package com.example.piano2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var mpDo: MediaPlayer?= null
    var mpRe: MediaPlayer?= null
    var mpMi: MediaPlayer?= null
    var mpFa: MediaPlayer?= null
    var mpSo: MediaPlayer?= null
    var mpRa: MediaPlayer?= null
    var mpSi: MediaPlayer?= null
    var mpDoh: MediaPlayer?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View要素を変数に代入する
        val doButton: Button = findViewById(R.id.doButton)
        val reButton: Button = findViewById(R.id.reButton)
        val miButton: Button = findViewById(R.id.miButton)
        val faButton: Button = findViewById(R.id.faButton)
        val soButton: Button = findViewById(R.id.soButton)
        val raButton: Button = findViewById(R.id.raButton)
        val siButton: Button = findViewById(R.id.siButton)
        val dohButton: Button = findViewById(R.id.dohButton)

        mpDo = MediaPlayer.create(applicationContext, R.raw.piano_do)
        mpRe = MediaPlayer.create(applicationContext, R.raw.piano_re)
        mpMi = MediaPlayer.create(applicationContext, R.raw.piano_mi)
        mpFa = MediaPlayer.create(applicationContext, R.raw.piano_fa)
        mpSo = MediaPlayer.create(applicationContext, R.raw.piano_so)
        mpRa = MediaPlayer.create(applicationContext, R.raw.piano_ra)
        mpSi = MediaPlayer.create(applicationContext, R.raw.piano_si)
        mpDoh = MediaPlayer.create(applicationContext, R.raw.piano_doh)

        doButton.setOnClickListener {
            mpDo?.start()
        }

        reButton.setOnClickListener {
            mpRe?.start()
        }

        miButton.setOnClickListener {
            mpMi?.start()
        }

        faButton.setOnClickListener {
            mpFa?.start()
        }

        soButton.setOnClickListener {
            mpSo?.start()
        }

        raButton.setOnClickListener {
            mpRa?.start()
        }

        siButton.setOnClickListener {
            mpSi?.start()
        }

        dohButton.setOnClickListener {
            mpDoh?.start()
        }

    }
}
