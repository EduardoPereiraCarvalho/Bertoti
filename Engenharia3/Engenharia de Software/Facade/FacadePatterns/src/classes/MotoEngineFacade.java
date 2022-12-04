package classes;

public class MotoEngineFacade {
	private static final Integer DEFAULT_COOLING_TEMP = 90;
	private static final Integer MAX_ALLOWED_TEMP = 50;
	private InjetorDeCombustivel injetor = new InjetorDeCombustivel();
	private Partida partida = new Partida();
	private ControleDeRefrigeracao controleRefrigeracao = new ControleDeRefrigeracao();
	public void startEngine() {
		injetor.on();
		injetor.injecao();
		partida.iniciarPartida();
		controleRefrigeracao.setTemperaturaLimite(DEFAULT_COOLING_TEMP);
		controleRefrigeracao.iniciar();
		conversor.on();
	}
	
	public void stopEngine() {
		injetor.off();
		conversor.off();
		controleRefrigeracao.resfriar(MAX_ALLOWED_TEMP);
		controleRefrigeracao.parar();
	}
}