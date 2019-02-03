/*
* Maria Isabel Ortiz Naranjo
* Clase: WebView
* Para poder ver los repositorios de mi perfil de GitHub
* */
package com.example.miona.appslab4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class web_view : AppCompatActivity() {

    // Se crea la variable de Web View

    var mywebview: WebView? = null

    // Metodo onCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)
        // Id
        mywebview = findViewById<WebView>(R.id.vista)
        mywebview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {

                //Url
                view?.loadUrl(url)
                return true
            }
        }
        mywebview!!.loadUrl(getIntent().getStringExtra("link"))
    }
}
