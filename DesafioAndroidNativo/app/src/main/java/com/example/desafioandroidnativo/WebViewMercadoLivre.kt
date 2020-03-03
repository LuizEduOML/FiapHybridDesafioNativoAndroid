package com.example.desafioandroidnativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view_mercado_livre.*

class WebViewMercadoLivre : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_mercado_livre)

        idWebViewMercadoLivre.loadUrl("https://www.mercadolivre.com.br")

    }
}
