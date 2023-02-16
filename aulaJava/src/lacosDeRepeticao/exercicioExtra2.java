package lacosDeRepeticao;

import java.util.Scanner;

public class exercicioExtra2 {

	public static void main(String[] args) {
		
		//Segundo enunciado:
		int x = 1, pares = 0, impares = 0;
		double num;
		
		Scanner leia = new Scanner(System.in);
		
		while (x <= 10) {
			System.out.println("Digite um número:");
			num = leia.nextDouble();
			
			if (num % 2 == 0) {
				pares++;
			} else {
				impares++;
			} x++;
		} System.out.println(pares + " números são pares e " + impares + " são ímpares.");

	}

}
