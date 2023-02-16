package lacosDeRepeticao;

import java.util.Scanner;

public class exercicioExtra3 {

	public static void main(String[] args) {
		
		//Terceiro enunciado:
		int idade = 0, menorDe21 = 0, maiorDe50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Digite uma idade:");
			idade = leia.nextInt();
			
			if (idade < 0 && idade > 110) {
				System.out.println("IDADE INVÁLIDADE!");
			} else if (idade > 50) {
				maiorDe50 ++;
			} else if (idade < 21) {
				menorDe21 ++;
			}
		}
		
		System.out.println(menorDe21 + " pessoas têm 20 anos ou menos e " + maiorDe50 + " pessoas têm mais de 50 anos.");

	}

}
