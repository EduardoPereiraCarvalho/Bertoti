package strategypattern;

public class Veiculo {
	private Direcao direcao;
	
	public Veiculo(Direcao direcao) {
		setTipoDirecao(direcao);
	}
	
	public void setTipoDirecao(Direcao direcao) {
		this.direcao = direcao;
	}
	
	public void dirigir() {
		this.direcao.dirigir();
	}
}