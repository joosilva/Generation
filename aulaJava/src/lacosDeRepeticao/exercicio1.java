package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Primeiro enunciado:
		int x, num1, num2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escolha um número A:");
		num1 = leia.nextInt();
		System.out.println("Escolha um número B maior que A:");
		num2 = leia.nextInt();
		
		while (num1 > num2) {
			System.out.println("Escolha um número A:");
			num1 = leia.nextInt();
			System.out.println("Escolha um número B maior que A:");
			num2 = leia.nextInt();
		}
		
		x = num1;
		for (;x <= num2;x++) {
			if (x % 3 == 0 && x % 5 == 0) {
				System.out.println(x + " é um número múltiplo de 3 e 5.");
			}
		}

	}

}
