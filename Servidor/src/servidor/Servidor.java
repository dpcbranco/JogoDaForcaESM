package servidor;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import janelas.ControladorSala;
import janelas.Temporizador;
import javafx.application.Platform;
import jogodaForcaESM.Jogador;


public class Servidor {
	
	ServerSocket servidor;
	ArrayList <Jogador> jogadores = new ArrayList<>(); 
	Socket novo_jogador;
	String nome_jogador;
	Temporizador temporizador;
	
	public Servidor (ControladorSala c) throws IOException {
		try{
			servidor = new ServerSocket(12345);
		}catch (BindException e){
			Platform.exit();
		}
		
		System.out.println("Porta 12345 aberta!");
		
		temporizador = new Temporizador(c);
		
		while (true){
			
			novo_jogador = servidor.accept();	
			nome_jogador = new DataInputStream(novo_jogador.getInputStream()).readUTF();
			
			if (novo_jogador != null){
			
				System.out.println("Nova conex�o com o cliente " +   
						novo_jogador.getInetAddress().getHostAddress() + ": " + nome_jogador 
						);
		
				jogadores.add(new Jogador (novo_jogador, nome_jogador, temporizador));
				jogadores.get(jogadores.size()-1).start();
				
				
				novo_jogador = null;
			}
		}
		
	}
	
	
	public int getNJogador(){
		return jogadores.size();
	}
	
	public String getNome_jogador() {
		return nome_jogador;
	}
	
	public String getIp(){
		return novo_jogador.getInetAddress().getHostAddress();
	}


	public Temporizador getTemporizador() {
		return temporizador;
	}

}