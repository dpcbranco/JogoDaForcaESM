package com.pucsp.esm.jogodaforcaesm.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.pucsp.esm.jogodaforcaesm.R;
import com.pucsp.esm.jogodaforcaesm.jogador.Jogador;
import com.pucsp.esm.jogodaforcaesm.palavras.Letras;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


public class JogoDaForcaESM extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private Jogador jogador = new Jogador();
    private List<Letras> letras = new ArrayList<Letras>();
    private Socket cliente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_da_forca);
        criarBotoes();
        construirForca();
    }


    private void criarBotoes(){
        String [] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Letras nova_letra;

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.A);
        letras.add(0, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.B);
        letras.add(1, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.C);
        letras.add(2, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.D);
        letras.add(3, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.E);
        letras.add(4, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.F);
        letras.add(5, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.G);
        letras.add(6, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.H);
        letras.add(7, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.I);
        letras.add(8, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.J);
        letras.add(9, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.K);
        letras.add(10, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.L);
        letras.add(11, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.M);
        letras.add(12, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.N);
        letras.add(13, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.O);
        letras.add(14, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.P);
        letras.add(15, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Q);
        letras.add(16, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.S);
        letras.add(17, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.T);
        letras.add(18, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.U);
        letras.add(19, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.V);
        letras.add(20, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.W);
        letras.add(21, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.X);
        letras.add(22, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Y);
        letras.add(23, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Z);
        letras.add(24, nova_letra);

    }

    //Forca precisa ser construída aqui para obter contexto da activity
    public void construirForca(){
        List<ImageView> corpo = new ArrayList<ImageView>();
        ImageView obterParte = new ImageView(this);

        obterParte.findViewById(R.id.cabeca);
        corpo.add(0, obterParte);

        obterParte.findViewById(R.id.corpo);
        corpo.add(1, obterParte);

        obterParte.findViewById(R.id.bracos);
        corpo.add(2, obterParte);

        obterParte.findViewById(R.id.perna_dir);
        corpo.add(3, obterParte);

        obterParte.findViewById(R.id.perna_esq);
        corpo.add(4, obterParte);

    }

    public void jogada (String letra){

    }


}

