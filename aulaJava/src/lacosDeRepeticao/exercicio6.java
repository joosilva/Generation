package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		//Sexto enunciado:
		Scanner leia = new Scanner(System.in);
		
		int numero, numero2 = 0, x = 0;
		float media;
		
		do {
			
			System.out.println("Digite um número:");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				numero2 += numero;
				x ++;
			}
			
		} while (numero != 0);
		
		media = numero2 / x;
		
		System.out.println("A média de todos os números múltiplos de 3 é " + media + ".");

	}

}
