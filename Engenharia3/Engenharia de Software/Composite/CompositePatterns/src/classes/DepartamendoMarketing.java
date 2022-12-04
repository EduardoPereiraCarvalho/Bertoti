package classes;

public class DepartamentoMarketing implements Departamento{
	private Integer id;
	private String nome;
	
	public void escrevaNomeDoDepartamento() {
		System.out.println(getClass().getSimpleName());
	}

	public DepartamentoMarketing(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
}