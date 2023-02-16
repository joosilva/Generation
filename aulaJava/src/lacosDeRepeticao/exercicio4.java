package lacosDeRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		// Quarto enunciado:
		int afirmacao = 1, idade, sexo, categoria, desenvolvedoresBackEnd = 0, mulheresFrontEnd = 0, homensMobileMaisDe40 = 0, mulheresFullStackMenos30 = 0;

		Scanner leia = new Scanner(System.in);

		while (afirmacao == 1) {

			System.out.println("\nDigite a idade do colaborador:");
			idade = leia.nextInt();
			System.out.println("\nDefina o gênero do colaborador:\n1 - Masculino\n2 - Feminino\n3 - Outros");
			sexo = leia.nextInt();
			System.out.println("\nDefina a categoria do colaborador:\n1 - Back-End\n2 - Front-End\n3 - Mobile\n4 - FullStack");
			categoria = leia.nextInt();

			if (categoria == 1) {
				desenvolvedoresBackEnd++;
			} else if (sexo == 2 && categoria == 2) {
				mulheresFrontEnd++;
			} else if (idade > 40 && sexo == 1) {
				homensMobileMaisDe40++;
			} else if (idade < 30 && sexo == 2 && categoria == 4) {
				mulheresFullStackMenos30++;
			}

			System.out.println("\nDeseja cadastrar um novo colaboradore? (1 - S / 2 - N)");
			afirmacao = leia.nextInt();

		}

		System.out.println("\nO número de pessoas desenvolvedoras Backend é " + desenvolvedoresBackEnd
				+ "\nO número de mulheres desenvolvedoras Frontend é " + mulheresFrontEnd
				+ "\nO número de homens desenvolvedores Mobile maiores de 40 anos é " + homensMobileMaisDe40
				+ "\nO número de mulheres desenvolvedoras FullStack menores de 30 anos é " + mulheresFullStackMenos30);

	}

}
