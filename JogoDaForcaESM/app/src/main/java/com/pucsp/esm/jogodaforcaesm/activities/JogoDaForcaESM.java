package com.pucsp.esm.jogodaforcaesm.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.pucsp.esm.jogodaforcaesm.R;
import com.pucsp.esm.jogodaforcaesm.jogador.Conexao;
import com.pucsp.esm.jogodaforcaesm.jogador.Jogador;
import com.pucsp.esm.jogodaforcaesm.palavras.Letras;
import com.pucsp.esm.jogodaforcaesm.palavras.Usada;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


public class JogoDaForcaESM extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    private Jogador jogador = new Jogador();
    private List<Letras> letras = new ArrayList<>();
    private Socket cliente;
    private DataOutputStream jogada;
    private Usada letra_usada;
    //Conexão deve ser realizada em Thread separada - ASyncTask
    private Conexao conectar = new Conexao();
    private String ip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_da_forca);

        //capturar entrada usuario - Tela Principal
        jogador.setNome(getIntent().getStringExtra("NICKNAME"));
        ip = getIntent().getStringExtra("IP");
        conectar.execute(ip);
        try {
            cliente = conectar.get();
            jogada = new DataOutputStream(cliente.getOutputStream());
            jogada.writeUTF(jogador.getNome());
            letra_usada = new Usada (jogada);
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        criarBotoes();
        construirForca();
    }


    private void criarBotoes(){
        Letras nova_letra;

        nova_letra = new Letras(this, "A");
        nova_letra.setId(R.id.A);
        nova_letra.findViewById(R.id.A);
        letras.add(0, nova_letra);


        nova_letra = new Letras(this, "B");
        nova_letra.setId(R.id.B);
        nova_letra.findViewById(R.id.B);
        letras.add(1, nova_letra);


        nova_letra = new Letras(this, "C");
        nova_letra.setId(R.id.C);
        nova_letra.findViewById(R.id.C);
        letras.add(2, nova_letra);


        nova_letra = new Letras(this, "D");
        nova_letra.setId(R.id.D);
        nova_letra.findViewById(R.id.D);
        letras.add(3, nova_letra);


        nova_letra = new Letras(this, "E");
        nova_letra.setId(R.id.E);
        nova_letra.findViewById(R.id.E);
        letras.add(4, nova_letra);


        nova_letra = new Letras(this, "F");
        nova_letra.setId(R.id.F);
        nova_letra.findViewById(R.id.F);
        letras.add(5, nova_letra);


        nova_letra = new Letras(this, "G");
        nova_letra.setId(R.id.G);
        nova_letra.findViewById(R.id.G);
        letras.add(6, nova_letra);

        nova_letra = new Letras(this, "H");
        nova_letra.setId(R.id.H);
        nova_letra.findViewById(R.id.H);
        letras.add(7, nova_letra);


        nova_letra = new Letras(this, "I");
        nova_letra.setId(R.id.I);
        nova_letra.findViewById(R.id.I);
        letras.add(8, nova_letra);


        nova_letra = new Letras(this, "J");
        nova_letra.setId(R.id.J);
        nova_letra.findViewById(R.id.J);
        letras.add(9, nova_letra);


        nova_letra = new Letras(this, "K");
        nova_letra.setId(R.id.K);
        nova_letra.findViewById(R.id.K);
        letras.add(10, nova_letra);

        nova_letra = new Letras(this, "L");
        nova_letra.setId(R.id.L);
        nova_letra.findViewById(R.id.L);
        letras.add(11, nova_letra);

        nova_letra = new Letras(this, "M");
        nova_letra.setId(R.id.M);
        nova_letra.findViewById(R.id.M);
        letras.add(12, nova_letra);

        nova_letra = new Letras(this, "N");
        nova_letra.setId(R.id.N);
        nova_letra.findViewById(R.id.N);
        letras.add(13, nova_letra);

        nova_letra = new Letras(this, "O");
        nova_letra.setId(R.id.O);
        nova_letra.findViewById(R.id.O);
        letras.add(14, nova_letra);


        nova_letra = new Letras(this, "P");
        nova_letra.setId(R.id.P);
        nova_letra.findViewById(R.id.P);
        letras.add(15, nova_letra);

        nova_letra = new Letras(this, "Q");
        nova_letra.setId(R.id.Q);
        nova_letra.findViewById(R.id.Q);
        letras.add(16, nova_letra);

        nova_letra = new Letras(this, "R");
        nova_letra.setId(R.id.R);
        nova_letra.findViewById(R.id.R);
        letras.add(16, nova_letra);

        nova_letra = new Letras(this, "S");
        nova_letra.setId(R.id.S);
        nova_letra.findViewById(R.id.S);
        letras.add(17, nova_letra);

        nova_letra = new Letras(this, "T");
        nova_letra.setId(R.id.T);
        nova_letra.findViewById(R.id.T);
        letras.add(18, nova_letra);

        nova_letra = new Letras(this, "U");
        nova_letra.setId(R.id.U);
        nova_letra.findViewById(R.id.U);
        letras.add(19, nova_letra);

        nova_letra = new Letras(this, "V");
        nova_letra.setId(R.id.V);
        nova_letra.findViewById(R.id.V);
        letras.add(20, nova_letra);

        nova_letra = new Letras(this, "W");
        nova_letra.setId(R.id.W);
        nova_letra.findViewById(R.id.W);
        letras.add(21, nova_letra);

        nova_letra = new Letras(this, "X");
        nova_letra.setId(R.id.X);
        nova_letra.findViewById(R.id.X);
        letras.add(22, nova_letra);

        nova_letra = new Letras(this, "Y");
        nova_letra.setId(R.id.Y);
        nova_letra.findViewById(R.id.Y);
        letras.add(23, nova_letra);

        nova_letra = new Letras(this, "Z");
        nova_letra.setId(R.id.Z);
        nova_letra.findViewById(R.id.Z);
        letras.add(24, nova_letra);

       }

    //Forca precisa ser construída aqui para obter contexto da activity

    public void construirForca() {
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

    public void disableButton (View v) {

        int i = 0;

        v.setClickable(false);
        v.setEnabled(false);

        System.out.println(v.getId());
        System.out.println(letras.get(0).getId());

        while (letras.get(i).getId() != v.getId()){
            i++;
        }

        letra_usada.execute(letras.get(i).getLetra());

        //Para cada nova letra, uma nova tarefa deve ser criada
        letra_usada = new Usada (jogada);
    }


}

