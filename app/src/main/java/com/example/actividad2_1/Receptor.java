package com.example.actividad2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Receptor extends AppCompatActivity {

    TextView txtNombreFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);
        recibirDatos();

    }
    public void recibirDatos(){
        txtNombreFoto =findViewById(R.id.txtNombreFoto);
        Bundle extras = getIntent().getExtras();
        txtNombreFoto.setText(extras.getString("d1"));

    }
}