package com.casadocodigo.appcriptomoedas.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.casadocodigo.appcriptomoedas.view.MainActivity
import com.casadocodigo.appcriptomoedas.R

class SplashActivity : AppCompatActivity(){

    lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)
    }
}