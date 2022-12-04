package classes;

public class App {
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	private static final Integer MAX_ALLOWED_TEMP = 50;

	public static void main(String[] args) {
		
		InjetorDeCombustivel injetor = new InjetorDeCombustivel();
		
		Partida partida = new Partida();
		ControleDeRefrigeracao controleRefrigeracao = new ControleDeRefrigeracao();
	
		
		injetor.on();
		
		injetor.injecao();
		partida.iniciarPartida();
		controleRefrigeracao.setTemperaturaLimite(DEFAULT_COOLING_TEMP);
		controleRefrigeracao.iniciar();
		conversor.on();
		
		injetor.off();
		conversor.off();
		controleRefrigeracao.resfriar(MAX_ALLOWED_TEMP);
		controleRefrigeracao.parar();
		
	}

}