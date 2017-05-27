package janelas;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import servidor.Servidor;

public class ControladorSala implements Initializable {

	@FXML private Button iniciar_jogo;
	@FXML private Label sala;
	@FXML private Label ip;
	Servidor server = null;
	Temporizador t;
	
	//Implementado para parametrizar controlador para servidor em sua cria��o
	ControladorSala c = this;
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		//implemmenta��o da abertura do servidor
		Thread iniciarServer = new Thread (new Runnable(){

			@Override
			public void run() {
				try {
					server = new Servidor(c);
					t = server.getTemporizador();					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		iniciarServer.start();
		
		iniciar_jogo.setDisable(true);
		
		Thread contarJogadores = new Thread (new Runnable(){

			@Override
			public void run() {
				while (server.getNJogador() < 3){
					//iniciar_jogo.setDisable(true);
				}
				
				iniciar_jogo.setDisable(false);
			}
			
		});
		
		contarJogadores.start();
		
		//mostrar IP para usu�rios
		ip.setText(IP());
	}
	
	//escreve entrada do jogador na sala
	public void entrarJogador (String nome, String ip){
		sala.setText(sala.getText() + "\n" + nome + ": " + "<" + ip + ">");		
	}
	
	//limpa entrada do jogador da sala
	public void sairJogador(String nome, String ip){
		String texto = sala.getText();
		String limpar = "\n" + nome + ": " + "<" + ip + ">";
		texto = texto.replace (limpar, "");
		sala.setText(texto);
	}
	
	//obter IP LAN do servidor
	 private String IP()
	    {
	        String IP_address = "";
	        int count = 0 ;
	        try{
	            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
	            while (interfaces.hasMoreElements())
	            {
	                NetworkInterface current = interfaces.nextElement();
	              //  System.out.println(current);
	                if (!current.isUp() || current.isLoopback() || current.isVirtual()) continue;
	                Enumeration<InetAddress> addresses = current.getInetAddresses();
	                while (addresses.hasMoreElements()){
	                    InetAddress current_addr = addresses.nextElement();
	                    if (current_addr.isLoopbackAddress()) continue;
	                    if (current_addr instanceof Inet4Address &&  count == 0)
	                    {
	                        IP_address = current_addr.getHostAddress() ; 
	                        //System.out.println(current_addr.getHostAddress());
	                         count++;
	                        break;
	                    }
	                }
	            }
	        }
	        catch(SocketException SE)
	        {
	            SE.printStackTrace();
	        } 
	        return  IP_address;
	    }
	
}
