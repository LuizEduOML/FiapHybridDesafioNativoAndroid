package com.example.desafioandroidnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web_view_mercado_livre.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgVwMercadoLivre.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewMercadoLivre::class.java)
            startActivity(intent)
        }

        imgVwNetShoes.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewNetShoes::class.java)
            startActivity(intent)
        }
    }
}
