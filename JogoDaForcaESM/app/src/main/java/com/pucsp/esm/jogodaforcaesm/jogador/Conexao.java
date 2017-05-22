package com.pucsp.esm.jogodaforcaesm.jogador;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.Socket;

/**
 * Created by Nerds on 20/05/2017.
 */

public class Conexao extends AsyncTask <String, Void, Socket> {

    Socket client = null;

    @Override
    protected Socket doInBackground(String... params) {

        try {
            client = new Socket(params[0], 12345);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return client;
    }

}

