package com.pucsp.esm.jogodaforcaesm.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pucsp.esm.jogodaforcaesm.R;

public class TelaPrincipal extends AppCompatActivity {

    Button entrar;
    EditText campo_nickname;
    EditText campo_sala;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        entrar = (Button) findViewById(R.id.entrar);
        campo_sala = (EditText) findViewById(R.id.end_sala);
        campo_nickname  = (EditText) findViewById(R.id.nickname);

        //configurações para entrada de  IP
        campo_sala.setInputType(InputType.TYPE_CLASS_NUMBER|InputType.TYPE_NUMBER_FLAG_DECIMAL);
        campo_sala.setKeyListener(DigitsKeyListener.getInstance("0123456789."));


        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novo_jogo = new Intent(TelaPrincipal.this, JogoDaForcaESM.class);
                novo_jogo.putExtra("IP", campo_sala.getText().toString());
                novo_jogo.putExtra("NICKNAME", campo_nickname.getText().toString());
                System.out.println(campo_sala.getText().toString());
                startActivity(novo_jogo);
            }
        });

    }

}
