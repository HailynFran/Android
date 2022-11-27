package com.example.actividad2_1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnIngresar;
    EditText txtNombre;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIngresar = findViewById(R.id.btnIngresar);
        txtNombre = findViewById(R.id.txtNombre);
    }

    public void ingresar(View v){
        String Nombre = txtNombre.getText().toString();

        Intent i = new Intent(MainActivity.this, Receptor.class);
        i.putExtra("d1",Nombre);
        startActivity(i);

    }



}
