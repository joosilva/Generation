package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Terceiro enunciado:
		int idade=0, menor21 = 0, maior50 = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (idade != -99) {
			System.out.println("Digite a idade: (Digite '-99' para sair)");
			idade = leia.nextInt();
			
			if (idade < 21) {
				menor21++;
			} else if (idade > 50) {
				maior50 ++;
			}
		}
		
		System.out.println("Total de pessoas com menos de 21 anos = " + menor21 + ".\nTotal de pessoas com mais de 50 anos = " + maior50 + ".");

	}

}
