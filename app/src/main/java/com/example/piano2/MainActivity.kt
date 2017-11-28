package com.example.piano2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.media.MediaPlayer
import android.widget.Button

class MainActivity : AppCompatActivity() {

    var mpDo: MediaPlayer?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // View要素を変数に代入する
        val doButton: Button = findViewById(R.id.doButton)

        mpDo = MediaPlayer.create(applicationContext, R.raw.pianodo)

        // ド
        doButton.setOnClickListener {
            mpDo?.start()
        }
    }
}
