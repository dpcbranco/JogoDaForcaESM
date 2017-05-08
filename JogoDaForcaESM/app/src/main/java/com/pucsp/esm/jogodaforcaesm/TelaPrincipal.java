package com.pucsp.esm.jogodaforcaesm;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pucsp.esm.jogodaforcaesm.exceptions.IpException;
import com.pucsp.esm.jogodaforcaesm.jogador.Jogador;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TelaPrincipal extends AppCompatActivity {

    private Socket comunicacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        Button entrar = (Button) findViewById(R.id.entrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                EditText campo_nickname  = (EditText) findViewById(R.id.nickname);
                EditText campo_sala = (EditText) findViewById(R.id.end_sala);
                try {
                    String endereco_str = campo_sala.getText().toString();
                    String nickname = campo_nickname.getText().toString();
                    if (endereco_str == null){
                        throw new Exception();
                    }
                }catch (Exception e){
                    startActivity(new Intent(TelaPrincipal.this, IpException.class));
                }


            }
        });

    }

}
