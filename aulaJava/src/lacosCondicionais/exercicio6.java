package lacosCondicionais;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int cod;
		float salario, novoSalario;
		
		System.out.println("Digite o nome do colaborador:");
		nome = leia.nextLine();
		System.out.println("\nDefina o cargo do colaborador:\n1 - Gerente;\n2 - Vendedor;\n3 - Supervisor;\n4 - Motorista;\n5 - Estoquista;\n6 - Técnico de TI.");
		cod = leia.nextInt();
		System.out.println("\nDefina o salário atual do colaborador (em reais):");
		salario = leia.nextFloat();
		
		switch (cod) {
		case 1:
			novoSalario = salario + salario * 10 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 10%.");
		break;
		case 2:
			novoSalario = salario + salario * 7 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 7%.");
		break;
		case 3:
			novoSalario = salario + salario * 9 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 9%.");
		break;
		case 4:
			novoSalario = salario + salario * 6 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 6%.");
		break;
		case 5:
			novoSalario = salario + salario * 5 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 5%.");
		break;
		case 6:
			novoSalario = salario + salario * 8 / 100;
			System.out.println("O novo salário do colaborador " + nome + " é de R$" + novoSalario + " com reajuste de 8%.");
		break;
			
		}
		
	}

}
