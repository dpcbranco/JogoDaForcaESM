package janelas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import servidor.Servidor;

public class TelaInicial extends Application {
	
	//variáveis de instância para uso nos eventos
	Parent tela;
	Scene cena; 
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//implementa fechamento do programa ao clicar no botão fechar
		primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
	           @Override
	           public void handle(WindowEvent e) {
	               Platform.exit();
	               System.exit(0);
	            }
	        });
		
		 tela = FXMLLoader.load(getClass().getResource("fxml_tela_inicial.fxml"));
		 cena = new Scene (tela);
		 
		 primaryStage.setTitle("Jogo da Forca ESM");
		 primaryStage.setScene(cena);
		 primaryStage.show();
		 
		 
	}


}
