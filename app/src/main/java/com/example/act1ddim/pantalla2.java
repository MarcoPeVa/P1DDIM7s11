package com.example.act1ddim;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class pantalla2 extends AppCompatActivity {
TextView lblA2Nmobre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
        lblA2Nmobre = findViewById(R.id.A2Saludo);

    Bundle parametro = getIntent().getExtras();
    lblA2Nmobre.setText("Bienvenid@: "+parametro.getString("nombre"));
    }
}