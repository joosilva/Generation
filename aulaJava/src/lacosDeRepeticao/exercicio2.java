package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		//Segundo enunciado:
		Scanner leia = new Scanner(System.in);
		
		int x = 1, pares = 0, impares, numero;
				
		for (;x <=10;x++) {
			System.out.println("\nDigite o " + x + "º número do tipo inteiro:");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				pares ++;
			}
			
		} impares = 10 - pares;
		
		System.out.println("O total de números pares é " + pares + " e o total de números ímpares é " + impares + ".");

	}

}
