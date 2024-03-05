package com.example.guiadosfb21010;

public class Metodos {
    public static String suma(float valor1, float valor2){
        String sumastr;
        float sumafloat = valor1+valor2;
        sumastr = String.valueOf(sumafloat);
        return sumastr;
    }
    public static String resta(float valor1, float valor2){
        String restastr;
        float restafloat = valor1-valor2;
        restastr = String.valueOf(restafloat);
        return restastr;
    }
    public static String mult(float valor1, float valor2, float valor3){

        // Sobrecargue el método de multiplicación para tres parámetros y haga que se ejecute solo cuando el
        //parámetro 3 tenga un valor >0.

        String multstr = null;
        if(valor3 > 0){
            float multfloat = valor1*valor2*valor3;
            multstr = String.valueOf(multfloat);
        }else{
            float multfloat = valor1*valor2;
            multstr = String.valueOf(multfloat);
        }
        return multstr;
    }
}
