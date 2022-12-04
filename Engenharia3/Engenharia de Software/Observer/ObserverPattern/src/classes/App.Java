package classes;

public class App {

	public static void main(String[] args) {
		
		// Observador
		motoPolicia MotoPolicia = new MotoPolicia();
		
		//Observado
		motoRoubado MotoRoubado = new MotoRoubado();
		
		motoRoubado.addObserver(motoPolicia);
		
		motoRoubado.frente();
		motoRoubado.direita();
		motoRoubado.esquerda();
		motoRoubado.para();
	}

}