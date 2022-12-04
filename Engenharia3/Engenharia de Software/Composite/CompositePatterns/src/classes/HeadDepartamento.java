package classes;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartamento implements Departamento {
	private Integer id;
	private String nome;
	
	private List<Departamento> childDepartamentos;
	
	public HeadDepartamento(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
		this.childDepartamentos = new ArrayList<>();
	}
	
	public void escrevaNomeDoDepartamento() {
		childDepartamentos.forEach(Departamento::escrevaNomeDoDepartamento);
	}
	
	public void addDepartamento(Departamento departamento) {
		childDepartamentos.add(departamento);
	}
	
	public void removeDepartamento(Departamento departamento) {
		childDepartamentos.remove(departamento);
	}
	
}