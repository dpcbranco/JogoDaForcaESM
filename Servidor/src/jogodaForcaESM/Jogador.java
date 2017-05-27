package jogodaForcaESM;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import janelas.Temporizador;

public class Jogador extends Thread {
	Socket cliente;
	String nome;
	String ip;
	DataInputStream entrada;
	
	//usado para tratar entrada e sa�da da sala
	Temporizador temporizador;
	
	public Jogador(Socket cliente, String nome, Temporizador temporizador){
		this.cliente = cliente;
		this.nome = nome;;
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
	public void run(){
		try{
			while (cliente.isConnected()){
				System.out.println(entrada.readUTF());
			}
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
}

