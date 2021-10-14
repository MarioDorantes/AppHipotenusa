package com.example.apphipotenusa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.String
import kotlin.math.sqrt

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciar componentes//
        val txtCatetoUno = findViewById<EditText>(R.id.txtCatetoC)
        val txtCatetoDos = findViewById<EditText>(R.id.txtCatetoB)
        val botonLimpiar = findViewById<Button>(R.id.btnLimpiar)
        val botonCalcular = findViewById<Button>(R.id.btnCalcular)
        val verResultado = findViewById<TextView>(R.id.txtResultado)

        var cuadradoUno:Long? = null
        var cuadradoDos:Long? = null
        var sumaCuadrados:Long? = null
        var raizSuma:Double? = null

        botonCalcular.setOnClickListener(){
            if (txtCatetoUno.text.isNotEmpty() && txtCatetoDos.text.isNotEmpty()){

                cuadradoUno = txtCatetoUno.text.toString().toLong() * txtCatetoUno.text.toString().toLong()
                cuadradoDos = txtCatetoDos.text.toString().toLong() * txtCatetoDos.text.toString().toLong()
                sumaCuadrados = cuadradoUno.toString().toLong() + cuadradoDos.toString().toLong()
                raizSuma = sqrt(sumaCuadrados.toString().toDouble())
                verResultado.text = "El Resultado es:" + raizSuma.toString()


            }
            else{
                Toast.makeText(this, "Los campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }

        botonLimpiar.setOnClickListener(){
            txtCatetoUno.text.clear()
            txtCatetoDos.text.clear()
            verResultado.text = ""
        }

    }


}