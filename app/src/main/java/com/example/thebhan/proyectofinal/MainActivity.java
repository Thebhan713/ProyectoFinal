package com.example.thebhan.proyectofinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    Button inicio;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicio = (Button) findViewById(R.id.button);
        inicio.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String usuario = ((EditText)findViewById(R.id.editText)).getText().toString();
        String contraseña = ((EditText)findViewById(R.id.editText2)).getText().toString();

        if (usuario.equals ("admin")&& contraseña.equals("admin"))
        {

            this.intent = new Intent(this, Main2Activity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Usuario o Contraseña Equivocada", Toast.LENGTH_SHORT).show();
        }


    }
}
