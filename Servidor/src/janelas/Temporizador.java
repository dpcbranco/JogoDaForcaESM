package janelas;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Temporizador {
	
	Timeline temporizador;
	KeyFrame controlador;
	ControladorSala sala;
	ControladorJogo jogo;
	
	public Temporizador (ControladorSala sala){
		temporizador = new Timeline();
		temporizador.setCycleCount(1);
		this.sala = sala;
		
	}
	
	public Temporizador(ControladorJogo jogo){
		temporizador = new Timeline();
		temporizador.setCycleCount(1);
		this.jogo = jogo;
	}
	

	public void entrarJogador(String nome, String ip) {
		controlador = new KeyFrame (Duration.ONE, ev -> sala.entrarJogador(nome, ip));
		
		if (temporizador.getKeyFrames().size() == 0){
			temporizador.getKeyFrames().add(controlador);
		}
		
		else{
			temporizador.getKeyFrames().set(0, controlador);
		}
		temporizador.play();
	}


	public void sairJogador(String nome, String ip) {
		controlador = new KeyFrame (Duration.ONE, ev -> sala.sairJogador(nome, ip));
		
		if (temporizador.getKeyFrames().size() == 0){
			temporizador.getKeyFrames().add(controlador);
		}
		
		else{
			temporizador.getKeyFrames().set(0, controlador);
		}
		temporizador.play();
		
	}
	
	public void escreverLetra (String letra){
		controlador = new KeyFrame (Duration.ONE, ev -> jogo.testarLetra(letra));
		
		if (temporizador.getKeyFrames().size() == 0){
			temporizador.getKeyFrames().add(controlador);
		}
		
		else{
			temporizador.getKeyFrames().set(0, controlador);
		}
		System.out.println(letra);
		temporizador.play();
	}
}
