package com.example.guiadosfb21010;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnEjecutarMetodo1;
    Button btnEjecutarMetodo2;
    Button btnEjecutarMetodo3;
    TextView lblEtiqueta;
    EditText edtParametro1;
    EditText edtParametro2;
    EditText edtParametro3;
    String sumastr, restastr, multstr;
    View.OnClickListener onclick; // Mover la declaración aquí


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEjecutarMetodo1 = (Button) findViewById(R.id.button);
        btnEjecutarMetodo2 = (Button) findViewById(R.id.button2);
        btnEjecutarMetodo3 = (Button) findViewById(R.id.button3);
        lblEtiqueta = (TextView) findViewById(R.id.textView3);
        edtParametro1 = (EditText) findViewById(R.id.editTextText);
        edtParametro2 = (EditText) findViewById(R.id.editTextText2);
        edtParametro3 = (EditText) findViewById(R.id.editTextText3);

        // Mover la asignación aquí
        onclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    float numfloat1 = Float.valueOf(edtParametro1.getText().toString());
                    float numfloat2 = Float.valueOf(edtParametro2.getText().toString());
                    float numfloat3 = Float.valueOf(edtParametro3.getText().toString());

                    if (v.getId() == R.id.button) {
                        sumastr = Metodos.suma(numfloat1, numfloat2);
                        lblEtiqueta.setText(sumastr);
                    } else if (v.getId() == R.id.button2) {
                        restastr = Metodos.resta(numfloat1, numfloat2);
                        lblEtiqueta.setText(restastr);
                    } else if (v.getId() == R.id.button3) {
                        multstr = Metodos.mult(numfloat1, numfloat2, numfloat3); //agregamos el valor 3
                        lblEtiqueta.setText(multstr);
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    // Manejo de la excepción
                }
            }
        };

        btnEjecutarMetodo1.setOnClickListener(onclick);
        btnEjecutarMetodo2.setOnClickListener(onclick);
        btnEjecutarMetodo3.setOnClickListener(onclick);
    }
}
