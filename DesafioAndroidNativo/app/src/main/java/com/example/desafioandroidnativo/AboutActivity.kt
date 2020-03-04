package com.example.desafioandroidnativo

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        var sh = getSharedPreferences("valores", Context.MODE_PRIVATE)

        sh.edit().putString("vl", txtQtdAcessos.text.toString()).apply()
    }
}
