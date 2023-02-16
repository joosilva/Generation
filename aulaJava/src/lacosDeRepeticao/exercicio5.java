package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		//Quinto enunciado:
		int numero, numero2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		numero = leia.nextInt();
		
		do {
			
			System.out.println("\nDigite mais um número:");
			numero2 = leia.nextInt();
			if(numero2 > 0) {
				numero += numero2;	
			}
			
		} while (numero != 0 && numero2 != 0);
		
		System.out.println("A soma dos números positivos é de " + numero + ".");	

	}

}
