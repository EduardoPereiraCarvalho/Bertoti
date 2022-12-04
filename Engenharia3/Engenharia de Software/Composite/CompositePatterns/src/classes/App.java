package classes;

public class App {

	public static void main(String[] args) {
		
		Departamento DepartamentoComercial = new DepartamentoComercial(1, "Departamento Comercial");
		Departamento departamentoDeFinanca = new DepartamentoMarketing(2, "Departamento Marketing");
		HeadDepartamento headDepartamento = new HeadDepartamento(3, "Departamento Comercial");
		
		headDepartamento.addDepartamento(DepartamentoComercial);
		headDepartamento.addDepartamento(DepartamentoMarketing);
		headDepartamento.escrevaNomeDoDepartamento();
	}

}