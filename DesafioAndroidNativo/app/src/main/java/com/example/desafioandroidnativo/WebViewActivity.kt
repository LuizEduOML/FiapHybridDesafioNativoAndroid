package com.example.desafioandroidnativo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_web_view.*

class WebViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        idWebView.webViewClient = WebViewClient()
        idWebView.settings.javaScriptEnabled = true

        idWebView.loadUrl(intent.getStringExtra("url"))

    }
}
