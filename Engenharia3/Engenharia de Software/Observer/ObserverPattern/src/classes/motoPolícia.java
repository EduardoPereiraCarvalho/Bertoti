package classes;

import java.util.Observable;
import java.util.Observer;

public class MotoPolicia implements Observer, Moto{
	
	private String acao;
	public void frente() {
		acao = "frente";
		System.out.println("Viatura segue em frente");
	}
	public void direita() {
		acao = "direita";
		System.out.println("Viatura segue para a direita");
	}
	public void esquerda() {
		acao = "esquerda";
		System.out.println("Viatura segue para a esquerda");
	}
	public void para() {
		acao = "para";
		System.out.println("Viatura para");
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		MotoRoubado motoObservado = (MotoRoubado)arg0;
		String acao = String.valueOf(arg1);
		
		if(acao.equals("frente")) {
			this.frente();
		}
		else if(acao.equals("direita")){
			this.direita();
		}
		else if(acao.equals("esquerda")){
			this.esquerda();
		}
		else if(acao.equals("para")){
			this.para();
		}
	
		
	}

}