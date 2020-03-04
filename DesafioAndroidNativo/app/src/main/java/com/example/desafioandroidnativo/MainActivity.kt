package com.example.desafioandroidnativo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_web_view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgVwMercadoLivre.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.mercadolivre.com.br/")
            startActivity(intent)
        }

        imgVwBuscape.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.buscape.com.br/")
            startActivity(intent)
        }

        imgVwEBay.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.ebay.com/")
            startActivity(intent)
        }

        imgVwWebMotors.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.webmotors.com.br/")
            startActivity(intent)
        }

        imgVwMagalu.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.magazineluiza.com.br/")
            startActivity(intent)
        }

        imgVwNetShoes.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.netshoes.com.br/")
            startActivity(intent)
        }

        imgVwAmericanas.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.americanas.com.br/")
            startActivity(intent)
        }

        imgVwSubmarino.setOnClickListener { view: View? ->
            startActivity(intent)
            var intent = Intent(this, WebViewActivity::class.java)
            intent.putExtra("url","https://www.submarino.com.br/")
            startActivity(intent)
        }

        btAbout.setOnClickListener { view: View ->
            startActivity(intent)
            var intent = Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}
