package com.pucsp.esm.jogodaforcaesm.jogador;

/**
 * Created by Nerds on 07/05/2017.
 */

import android.widget.ImageView;

import java.util.List;



public class Jogador {
    private String nome;
    private boolean morto = false;
    private int erros = 0;
    private Forca forca;

    public boolean estaVivo (){
        return  morto;
    }

    public void perderVida(){
        forca.exibirParte(erros);
        erros++;
        if (erros == 5){
            morto = true;
        }
    }

    public void obterCorpo(List<ImageView> corpo){
        forca = new Forca (corpo);
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }
}
