package com.pucsp.esm.jogodaforcaesm.exceptions;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import com.pucsp.esm.jogodaforcaesm.R;

/**
 * Created by Nerds on 07/05/2017.
 */

public class IpException extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_ip_exception);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width*.8), (int) (height*.3));
    }
}
