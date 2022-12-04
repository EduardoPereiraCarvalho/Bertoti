package strategypattern;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veiculo carro = new Veiculo(new Carro());
		Veiculo Jatinho = new Veiculo(new Jatinho());
        Veiculo Moto = new Veiculo(new Moto());
    
		
		
		carro.dirigir();
		jatinho.dirigir();
        moto.dirigir();
	}

}