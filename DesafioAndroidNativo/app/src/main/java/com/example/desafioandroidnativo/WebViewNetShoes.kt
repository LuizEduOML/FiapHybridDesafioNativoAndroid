package com.example.desafioandroidnativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_web_view_net_shoes.*

class WebViewNetShoes : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_net_shoes)

        idWebViewNetShoes.loadUrl("https://www.netshoes.com.br")
    }
}
