package classes;

import java.util.Observable;
import java.util.Observer;

public class MotoRoubado extends Observable implements Moto {
	private String acao = "";
	
	public void frente() {
		acao = "frente";
		System.out.println("Moto roubado segue em frente");
		this.mudaEstado();
	}
	public void direita() {
		acao = "direita";
		System.out.println("Moto roubado segue para a direita");
		this.mudaEstado();
	}
	public void esquerda() {
		acao = "esquerda";
		System.out.println("Moto roubado segue para a esquerda");
		this.mudaEstado();
	}
	public void para() {
		acao = "para";
		System.out.println("Moto roubado para");
		this.mudaEstado();
	}
	
	public void mudaEstado() {
		setChanged();
		notifyObservers(acao);
	}