package servidor;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import janelas.Temporizador;
import jogodaForcaESM.JogoDaForcaESM;

public class Jogador extends Thread {
	Socket cliente;
	String nome;
	String ip;
	DataInputStream entrada;
	JogoDaForcaESM jogo;

	//usado para tratar entrada e sa�da da sala
	Temporizador temporizador;

	public Jogador(Socket cliente, String nome, Temporizador temporizador){
		this.cliente = cliente;
		this.nome = nome;
		ip =  cliente.getInetAddress().getHostAddress();
		try {
			entrada = new DataInputStream(cliente.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.temporizador = temporizador;
		temporizador.entrarJogador(nome, ip);
	}

	@Override  
	public synchronized void run(){
		try{
			jogo.setLetra(entrada.readUTF());
			this.interrupt();

		}catch (EOFException e){
			System.out.println("Jogador " + ip + " foi descontectado");
			temporizador.sairJogador(nome, ip);
			encerrarCliente();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void encerrarCliente() {
		try{
			cliente.close();
		}catch (IOException e){

		}
	}

	public String getNome (){
		return nome;
	}

	public void setJogo(JogoDaForcaESM jogo){
		this.jogo = jogo;
	}

}

