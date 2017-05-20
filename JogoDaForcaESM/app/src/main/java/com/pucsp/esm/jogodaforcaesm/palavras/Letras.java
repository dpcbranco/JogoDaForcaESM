package com.pucsp.esm.jogodaforcaesm.palavras;

/**
 * Created by Nerds on 20/05/2017.
 */

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class Letras extends Button {

    private String letra;

    public Letras(final Context context) {
        super(context);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setActivated(false);
                letra = getText().toString();
            }
        });
    }


}
