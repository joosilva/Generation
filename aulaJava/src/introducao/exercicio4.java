package introducao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		//Quarto enunciado:
		int num1, num2, num3, num4, dif;
				
		Scanner leia = new Scanner(System.in);

		System.out.println("\nDigite um número inteiro (positivo ou negativo)");
		num1 = leia.nextInt();
		System.out.println("\nDigite mais um número inteiro (positivo ou negativo)");
		num2 = leia.nextInt();
		System.out.println("\nDigite só mais um número inteiro (positivo ou negativo)");
		num3 = leia.nextInt();
		System.out.println("\nAgora o último número inteiro (positivo ou negativo)");
		num4 = leia.nextInt();
				
		dif = num1 * num2 - num3 * num4;
		System.out.println("\nA diferença dos produtos dos números que você escolheu é " + dif + ".");
				
	}

}