package jogodaforca.esm.studio.com.jogodaforcaesm.jogador;

import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by Shikado on 26/04/2017.
 */

public class Jogador {
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

    public void obterForca(ArrayList<ImageView> corpo){
        forca = new Forca (corpo);
    }
}
