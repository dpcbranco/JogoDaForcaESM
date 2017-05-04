package jogodaforca.esm.studio.com.jogodaforcaesm.jogador;



import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by Shikado on 26/04/2017.
 */

class Forca {

    List<ImageView> corpo = new ArrayList<ImageView>();

    public Forca(List<ImageView> corpo) {
        this.corpo = corpo;
    }

    //parte = erros
    public void exibirParte(int parte){
        corpo.get(parte).setVisibility(View.VISIBLE);
    }

}
