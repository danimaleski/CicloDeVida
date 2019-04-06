package com.teste.dani.ciclodevida;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CicloActivity extends AppCompatActivity {
    EditText usuario;
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo);

        usuario = findViewById(R.id.user);
        senha = findViewById(R.id.pass);

        Button confirmar = findViewById(R.id.confirmar);

        confirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (usuario.getText().toString().equals("udesc") && senha.getText().toString().equals("123")) {
                    Intent i = new Intent(CicloActivity.this, MainActivity.class);
                    i.putExtra("Nome", usuario.getText().toString());
                    startActivity(i); //função que serve para ir para outra tela, voce diz qual "main" voce deseja ir
                } else {
                    Toast.makeText(CicloActivity.this, "Erro", Toast.LENGTH_SHORT).show();
                }


            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "gooo", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "retoma", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "de novo de novo", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "parô", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "paraaaaaa", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "destruido", Toast.LENGTH_SHORT).show();
    }
}


       
