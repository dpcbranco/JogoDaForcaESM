package jogodaforca.esm.studio.com.jogodaforcaesm.Palavra;

import android.content.Context;
import android.view.View;
import android.widget.Button;


/**
 * Created by Shikado on 29/04/2017.
 */

public class Letras extends Button {

    private String letra;

    public Letras(final Context context) {
        super(context);
        setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                setActivated(false);
                letra = getText().toString();
                context.getClass().getMethod()
            }
        });
    }


}
