package lacosCondicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Primeiro enunciado:
		int a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Defina um valor para de A:");
		a = leia.nextInt();
		System.out.println("\nDefina um valor para de B:");
		b = leia.nextInt();
		System.out.println("\nDefina um valor para de C:");
		c = leia.nextInt();
		soma = (a+b);
		
		if (soma>c) {
			System.out.println("\nA soma de A e B (" + soma + ") é maior que o valor de C (" + c +").");
		} else if (soma<c) {
			System.out.println("\nA soma de A e B (" + soma + ") é menor que o valor de C (" + c +").");
		} else if (soma==c) {
			System.out.println("\nA soma de A e B (" + soma + ") é igual ao valor de C (" + c +").");
		}
	}
}
