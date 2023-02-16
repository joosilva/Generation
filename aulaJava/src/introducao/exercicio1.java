package introducao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Primeiro enunciado:
		float salario, abono, novoSalario;
				
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Qual seu salário? (Em R$)");
		salario = leia.nextFloat();
		System.out.println("\nQual valor do seu abono? (Em R$)");
		abono = leia.nextFloat();
				
		novoSalario = salario + abono;
		System.out.printf("\nVocê receberá R$%.2f.", novoSalario);

	}

}
