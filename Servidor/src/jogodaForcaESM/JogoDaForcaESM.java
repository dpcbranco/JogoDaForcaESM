package jogodaForcaESM;
import java.io.IOException;
import java.util.ArrayList;

import janelas.TelaInicial;
import javafx.application.Application;

import servidor.*;
public class JogoDaForcaESM {

	private ArrayList <Jogador> jogadores = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		Application.launch(TelaInicial.class, args);
		ArrayList <Jogador> jogadores = new ArrayList<>();
	}
	
	public void jogadorEntrou (Jogador j){
		jogadores.add(j);
	}

}
