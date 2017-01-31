package com.example.alex.awesomefonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //IRSE A LA VISION DE PROYECTO Y CREAR UNA CARPETA ASSETS EN APP/SRC/MAIN/ y arrastro el archivo ttf

        Typeface typeface = Typeface.createFromAsset(getAssets(),"fontawesome-webfont.ttf");//Para coger la imagen

        TextView textView = (TextView) findViewById(R.id.miCajaTexto);
        textView.setTypeface(typeface);

        //LO IDEAL SERIA CREAR UN XML DONDE DEFINA PREVIAMENTE LOS ICONOS QUE QUIERES, SI NO SERIA COGER EL NOMBRE QUE LO COMPONEN LETRAS AL AZAR
        //PARA ELLO ME VOY A VALUES Y CREO RESOURCE DE ICONOS(XML). LOS CODIGOS NECESARIOS ESTAN EN EL CHEATSEET DE FONTAWESOME (http://fontawesome.io/cheatsheet/)
        //EL ESTILO ES COMO EN LOS STRINGS XML
    }
}
