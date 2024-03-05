package com.example.tutoria02_27_02_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("cicloVida", "Ingreso al onCreate()") //referencia en .xml
    }

    override fun onStart() {
        super.onStart()
        Log.i("cicloVida", "Ingreso al onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i("cicloVida", "Ingreso al onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i("cicloVida", "Ingreso al onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i("cicloVida", "Ingreso al onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("cicloVida", "Ingreso al onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("cicloVida", "Ingreso al onDestroy()")
    }
}
