package jogodaforca.esm.studio.com.jogodaforcaesm;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import jogodaforca.esm.studio.com.jogodaforcaesm.Palavra.Letras;
import jogodaforca.esm.studio.com.jogodaforcaesm.jogador.Jogador;

public class JogoDaForca extends AppCompatActivity {

     /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;
    //private List<Jogador> jogadores = new ArrayList<Jogador>();
    private Jogador player1 = new Jogador();
    private List<Letras> letras = new ArrayList<Letras>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_da_forca);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("JogoDaForca Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
        criarBotoes();
        construirForca();
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }

    private void criarBotoes(){
        String [] alfabeto = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        Letras nova_letra;

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.A);
        letras.add(0, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.B);
        letras.add(1, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.C);
        letras.add(2, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.D);
        letras.add(3, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.E);
        letras.add(4, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.F);
        letras.add(5, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.G);
        letras.add(6, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.H);
        letras.add(7, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.I);
        letras.add(8, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.J);
        letras.add(9, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.K);
        letras.add(10, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.L);
        letras.add(11, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.M);
        letras.add(12, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.N);
        letras.add(13, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.O);
        letras.add(14, nova_letra);


        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.P);
        letras.add(15, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Q);
        letras.add(16, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.S);
        letras.add(17, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.T);
        letras.add(18, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.U);
        letras.add(19, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.V);
        letras.add(20, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.W);
        letras.add(21, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.X);
        letras.add(22, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Y);
        letras.add(23, nova_letra);

        nova_letra = new Letras(this);
        nova_letra.findViewById(R.id.Z);
        letras.add(24, nova_letra);

    }

    //Forca precisa ser construída aqui para obter contexto da activity
    public void construirForca(){
        List<ImageView> corpo = new ArrayList<ImageView>();
        ImageView obterParte = new ImageView(this);

        obterParte.findViewById(R.id.cabeca);
        corpo.add(0, obterParte);

        obterParte.findViewById(R.id.corpo);
        corpo.add(1, obterParte);

        obterParte.findViewById(R.id.bracos);
        corpo.add(2, obterParte);

        obterParte.findViewById(R.id.perna_dir);
        corpo.add(3, obterParte);

        obterParte.findViewById(R.id.perna_esq);
        corpo.add(4, obterParte);

        player1.obterCorpo(corpo);
    }

    public void jogada (String letra){

    }


}

