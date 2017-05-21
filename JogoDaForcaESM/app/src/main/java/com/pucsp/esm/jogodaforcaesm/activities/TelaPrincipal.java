package com.pucsp.esm.jogodaforcaesm.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pucsp.esm.jogodaforcaesm.R;

import java.net.Socket;

public class TelaPrincipal extends AppCompatActivity {

    private Socket comunicacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        final Button entrar = (Button) findViewById(R.id.entrar);
        final EditText campo_nickname  = (EditText) findViewById(R.id.nickname);
        final EditText campo_sala = (EditText) findViewById(R.id.end_sala);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String endereco_str = campo_sala.getText().toString();
                String nickname = campo_nickname.getText().toString();
                startActivity(new Intent(TelaPrincipal.this, JogoDaForcaESM.class));

            }
        });

    }

}
