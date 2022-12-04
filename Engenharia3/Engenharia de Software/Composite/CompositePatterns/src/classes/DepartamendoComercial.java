package classes;

public class DepartamentoComercial implements Departamento {
	private Integer id;
	private String nomeString;
	
	public void escrevaNomeDoDepartamento() {
		System.out.println(getClass().getSimpleName());
	}

	public DepartamentoComercial(Integer id, String nomeString) {
		this.id = id;
		this.nomeString = nomeString;
	}
	
}