package POO;

public class mainClass {

	public static void main(String[] args) {

		Funcionario funcionario1 = new Funcionario (1, "Gertrudes da Graça", 45, 943215678, "São Paulo");
		Funcionario funcionario2 = new Funcionario (2, "Jerônimo Josias", 37, 956784321, "Campinas");
		
		funcionario1.vizualizar();
		funcionario2.vizualizar();
		
	}

}