package com.pucsp.esm.jogodaforcaesm.palavras;

/**
 * Created by Nerds on 20/05/2017.
 */

import android.content.Context;
import android.widget.Button;

public class Letras extends Button {

    public String getLetra() {
        return letra;
    }

    String letra;

    public Letras(final Context context, String letra) {
        super(context);
        this.letra = letra;
    }
}