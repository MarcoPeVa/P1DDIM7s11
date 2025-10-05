package com.example.act1ddim;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
Button btnA1Siguiente; //esto es para referenciar y usar del layaut lo que se puso en strings.xml
EditText txtIA1Nomrbre,txtA1Password;

//definir la contraseña para el usuario
private final String PASSWORD_CORRECTA = "12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnA1Siguiente = findViewById(R.id.b_iniciar); //objeto para el boton
        txtIA1Nomrbre = findViewById(R.id.nombre);
        txtA1Password = findViewById(R.id.contraseña);

        btnA1Siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SigPantallaPrametro(v);
            }
        });
    }

    //metodo dentro de la pantalla
    public void SigPantallaPrametro(View v ) {
        // recive la contraseña que introduce el usuario
        String password = txtA1Password.getText().toString();

        if (password.equals(PASSWORD_CORRECTA)) {
        //definir el intent
        Intent intent = new Intent(this, pantalla2.class);
        intent.putExtra("nombre", txtIA1Nomrbre.getText().toString());
        startActivity(intent);

        }else{
            Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show();
        }
    }
}