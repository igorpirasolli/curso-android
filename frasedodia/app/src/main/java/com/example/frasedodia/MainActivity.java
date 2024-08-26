package com.example.frasedodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //atributo
    String [] frases = {
            "frase 01",
            "frase 02",
            "frase 03",
            "frase 04"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void gerarFrase(View view) {
        TextView texto = findViewById(R.id.textResultado);
        int numeroAleatorio = new Random().nextInt(3);
        String frase = frases[numeroAleatorio];
        texto.setText(frase);
    }

    public void exibirFrase(View view){
        TextView texto = findViewById(R.id.textResultado);
        String textoResultado = "";
        for (String frases: frases) {
            textoResultado = textoResultado + frases + "\n";
        }
        texto.setText(textoResultado);
    }
}