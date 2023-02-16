package lacosDeRepeticao;

import java.util.Scanner;

public class exercicioExtra4 {

	public static void main(String[] args) {
		
		//Quarto enunciado:
		int contador = 0, idade, sexo, humor, calmes = 0, mulheresNervosas = 0, homensAgressivos = 0, outresCalmes = 0, maisDe40Nervoses = 0, menosDe18Calmes = 0;

		Scanner leia = new Scanner(System.in);

		while (contador < 150) {

			System.out.println("\nDigite a idade do colaborador:");
			idade = leia.nextInt();
			while (idade < 0 || idade > 110) {
				System.out.println("\nDigite a idade do colaborador:");
				idade = leia.nextInt();
			}
			System.out.println("\nDefina o gênero do colaborador:\n1 - Masculino\n2 - Feminino\n3 - Outros");
			sexo = leia.nextInt();
			System.out.println("\nComo você define seu humor::\n1 - Calme\n2 - Nervose\n3 - Agressive");
			humor = leia.nextInt();

			if (humor == 1) {
				calmes ++;
			} else if (sexo == 2 && humor == 2) {
				mulheresNervosas ++;
			} else if (sexo == 1 && humor == 3) {
				homensAgressivos ++;
			} else if (sexo == 3 && humor == 1) {
				outresCalmes ++;
			} else if (idade > 40 && humor == 2) {
				maisDe40Nervoses ++;
			} else if (idade < 18 && humor == 1) {
			    menosDe18Calmes ++;
		    }	
			
			contador ++;

		}

		System.out.println("\nO número de mulheres nervosas é " + mulheresNervosas
				+ "\nO número de homens agressivos é " + homensAgressivos
				+ "\nO número de outres calmes é " + outresCalmes
				+ "\nO número de pessoas com mais de 40 anos que são nervoses é " + maisDe40Nervoses
				+ "\nO número de pessoas com menos de 18 anos que são calmes é " + menosDe18Calmes);

	}

}
