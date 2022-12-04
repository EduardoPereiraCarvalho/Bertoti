package classes;

public class ControleDeRefrigeracao {
    private static final Integer DEFAULT_RADIATOR_SPEED = 10;
    
    private Integer limiteTemperatura;
    private Radiador radiador = new Radiador();
    private SensorTemperatura sensor = new SensorTemperatura();
    
    public void setTemperaturaLimite(Integer limiteTemperatura) {
    	System.out.println("Definindo limite de temperatura");
    	this.limiteTemperatura = limiteTemperatura;
    }
    
    public void iniciar() {
    	System.out.println("Controlador de Temperatura pronto!");
    	radiador.setVelocidade(DEFAULT_RADIATOR_SPEED);
    }
    
    public void resfriar(Integer temperaturaMaxPermitida) {
    	System.out.println("Resfriamento programado com temperatura máxima permitida " + temperaturaMaxPermitida);
    	sensor.getTemperatura();
    	radiador.on();
    }
    
    public void parar() {
    	System.out.println("Parando controlador de temperatura...");
    	radiador.off();
    }