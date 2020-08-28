package com.example.hw1_guessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_number_guess.*

class MainActivity : AppCompatActivity() {

    var aleatorio = (0..1000).random()
    var contador = 0


    fun enviar (v: View) {
        contador++
        Log.i("aleatorio", "El numeo aleatorio es "+ aleatorio.toString())
        val num = number.text.toString().toInt()
        if (num > 1000 || num < 0) {
            Toast.makeText(applicationContext,"El numero insertado debe estar entre 0 y 1000",Toast.LENGTH_LONG).show()
        }else {
            if (num < aleatorio) {
                Toast.makeText(applicationContext,"El numero aleatorio es mayor",Toast.LENGTH_LONG).show()
            }else if(num == aleatorio) {
                Toast.makeText(applicationContext,"Has ganado",Toast.LENGTH_LONG).show()
                Toast.makeText(applicationContext,"Numero de intentos: "+contador,Toast.LENGTH_LONG).show()
                Toast.makeText(applicationContext,"¡JUEGA NUEVAMENTE!",Toast.LENGTH_LONG).show()
                aleatorio = (0..1000).random()
                contador = 0
            }else {
                 Toast.makeText(applicationContext,"El numero aleatorio es menor",Toast.LENGTH_LONG).show()
            }
        }

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_guess)
    }
}