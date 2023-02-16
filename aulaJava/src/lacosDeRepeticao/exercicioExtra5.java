package lacosDeRepeticao;

import java.util.Scanner;

public class exercicioExtra5 {

	public static void main(String[] args) {
		
		//Quinto enunciado:
		double numero, numeroSoma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("Digite um número:");
			numero = leia.nextDouble();
			numeroSoma += numero;
			
		} while (numero != 0);

		System.out.println("A soma dos números que você digitou é " + numeroSoma + ".");
		
	}

}
