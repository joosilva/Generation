package lacosDeRepeticao;

import java.util.Scanner;

public class exercicioExtra6 {

	public static void main(String[] args) {
		
		//Sexto enunciado:
		int num, contador = 0, multiplosDe3 = 0;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número inteiro:");
			num = leia.nextInt();
			if (num % 3 == 0) {
				multiplosDe3 += num;
				contador ++;
			}
			
		} while (num != 0);
		
		media = multiplosDe3 / contador;
		
		System.out.println("A média dos números múltiplos de 3 é " + media + ".");

	}

}
