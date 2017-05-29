package jogodaForcaESM;

public class PalavraSecreta {
	
	String palavra;
	String [] letras;
	
	public PalavraSecreta(String palavra){
		this.palavra = palavra;
		letras = palavra.split("");
	}
	
	public int tamanho (){
		return letras.length;
	}
	
	public String getLetra (int i){
		return letras[i];
	}
}
