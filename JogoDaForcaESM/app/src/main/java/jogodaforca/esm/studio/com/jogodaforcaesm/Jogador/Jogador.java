package jogodaforca.esm.studio.com.jogodaforcaesm.jogador;

/**
 * Created by Shikado on 26/04/2017.
 */

public class Jogador {
    private boolean morto = false;
    private int erros = 0;
    private Forca forca = new Forca();

    public boolean estaVivo (){
        return  morto;
    }

    public void perderVida(){
        erros++;
        if (erros == 5){
            morto = true;
        }
    }
}
