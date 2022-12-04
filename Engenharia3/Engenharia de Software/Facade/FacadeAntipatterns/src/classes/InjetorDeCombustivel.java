package classes;

public class InjetorDeCombustivel {
	private BomdaDeCombustivel bombaCombustivel = new BomdaDeCombustivel();
	
	public void on() {
		System.out.println("Injetor de combustível pronto");
	}
	
	public void injecao() {
		bombaCombustivel.pump();
		System.out.println("Combustivel injetado");
	}
	
	public void off() {
		System.out.println("Parando injeção de bomba");
	}
}