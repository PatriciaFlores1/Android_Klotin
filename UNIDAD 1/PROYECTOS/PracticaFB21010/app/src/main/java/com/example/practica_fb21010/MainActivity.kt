package com.example.practica_fb21010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// Tareas opcionales:
// ● Agrega un botón más e implementa la funcionalidad de división.
// ● Agrega soporte para números con punto flotante en tu aplicación


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaración de componentes a utilizar
        val lblResult :  TextView = findViewById(R.id.lbl_1)
        val btnSum :  Button = findViewById(R.id.btn_1)
        val btnDiff :  Button = findViewById(R.id.btn_2)
        val btnDivis :  Button = findViewById(R.id.btn_4)
        val btnProduct :  Button = findViewById(R.id.btn_3)
        val editText1 :  EditText = findViewById(R.id.txt_1)
        val editText2 :  EditText = findViewById(R.id.txt_2)
        val editText3 :  EditText = findViewById(R.id.txt_3)

        //Definición de eventos de click de los botones
        btnSum.setOnClickListener {
            lblResult.text = "Se hizo click en el boton de suma"
        }

        btnDiff.setOnClickListener {
            lblResult.text = "Se hizo click en el boton de resta"
        }

        btnProduct.setOnClickListener {
            lblResult.text = "Se hizo click en el boton de Multiplicación"
        }

        btnDivis.setOnClickListener {
            lblResult.text = "Se hizo click en el boton de División"
        }

        //Definimos la función a cada botón
        //Función suma
        btnSum.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
            val num3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
            val operacion = (num1 + num2 + num3)
            lblResult.text = "Resultado: ${operacion}"
        }

        //Función resta
        btnDiff.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
            val num3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
            val diff = when {
                num1 != null ->{
                    num1 - (num2 ?: 0.0) - (num3 ?: 0.0)
                }
                num2 != null ->{
                    num2 - (num3 ?: 0.0)
                }
                else -> {
                    num3 ?: 0.0
                }
            }
            lblResult.text = "Resultado: ${diff}"
        }

        //Multiplicación
        btnProduct.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
            val num3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
            if (num1 == 0.0 && num2 == 0.0 && num3 == 0.0){
                lblResult.text = getString(R.string.lbl_2, 0.0)
            }else{
                val operacion = ((num1 ?: 1.0) * (num2 ?: 1.0) * (num3 ?: 1.0))
                lblResult.text = "Resultado: ${operacion}"
            }
        }

        //División
        btnDivis.setOnClickListener {
            val num1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
            val num3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
            if(num1 == 0.0 || num2 == 0.0 || num3 == 0.0 ){
                lblResult.text = "No se puede realizar la división"
            }else{
                val diviResultado = num1 / num2 / num3
                lblResult.text = "Resultado: ${diviResultado}"
            }
        }
    }
}


//otra opción seria
// package com.example.practica_fb21010
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.TextView
//
//class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        // Declaración de componentes a utilizar
//        val lblResult :  TextView = findViewById(R.id.lbl_1)
//        val btnSum :  Button = findViewById(R.id.btn_1)
//        val btnDiff :  Button = findViewById(R.id.btn_2)
//        val btnDivis :  Button = findViewById(R.id.btn_4)
//        val btnProduct :  Button = findViewById(R.id.btn_3)
//        // Agrega soporte para números con punto flotante en tu aplicación.
//        val editText1 :  EditText = findViewById(R.id.txt_1)
//        val editText2 :  EditText = findViewById(R.id.txt_2)
//        val editText3 :  EditText = findViewById(R.id.txt_3)
//
//        //Definición de eventos de click de los botones
//        btnSum.setOnClickListener {
//            try {
//                calcularOperacion(editText1, editText2, editText3) { num1, num2, num3 ->
//                    lblResult.text = "Resultado: ${num1 + num2 + num3}"
//                }
//            } catch (e: Exception) {
//                e.printStackTrace()
//                // Manejo de errores
//                lblResult.text = "Error: ${e.message}"
//            }
//        }
//
//        btnDiff.setOnClickListener {
//            calcularOperacion(editText1, editText2, editText3) { num1, num2, num3 ->
//                val diff = num1 - num2 - num3
//                lblResult.text = "Resultado: ${diff}"
//            }
//        }
//
//        btnProduct.setOnClickListener {
//            calcularOperacion(editText1, editText2, editText3) { num1, num2, num3 ->
//                val product = num1 * num2 * num3
//                lblResult.text = "Resultado: ${product}"
//            }
//        }
//
//        btnDivis.setOnClickListener {
//            calcularOperacion(editText1, editText2, editText3) { num1, num2, num3 ->
//                if (num2 != 0.0 && num3 != 0.0) {
//                    val diviResultado = num1 / num2 / num3
//                    lblResult.text = "Resultado: ${diviResultado}"
//                } else {
//                    lblResult.text = "No se puede realizar la división por 0"
//                }
//            }
//        }
//    }
//
//    private inline fun calcularOperacion(editText1: EditText, editText2: EditText, editText3: EditText, operation: (Double, Double, Double) -> Unit) {
//        val num1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
//        val num2 = editText2.text.toString().toDoubleOrNull() ?: 0.0
//        val num3 = editText3.text.toString().toDoubleOrNull() ?: 0.0
//        operation(num1, num2, num3)
//    }
//}