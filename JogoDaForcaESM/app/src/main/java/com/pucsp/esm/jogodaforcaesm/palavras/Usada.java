package com.pucsp.esm.jogodaforcaesm.palavras;

import android.os.AsyncTask;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Nerds on 20/05/2017.
 */

public class Usada extends AsyncTask <String, DataInputStream, Void> {

    DataOutputStream jogada;

   public Usada (DataOutputStream jogada){
        this.jogada = jogada;
    }

    @Override
    protected Void doInBackground(String... letra) {
        try {
            jogada.writeUTF(letra[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
