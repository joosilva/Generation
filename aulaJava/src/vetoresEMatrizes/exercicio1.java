package vetoresEMatrizes;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		// Primeiro enunciado:
		Scanner leia = new Scanner(System.in);

		int[] numeros = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int dado, posicao = 0;

		System.out.println("Escolha um número:");
		dado = leia.nextInt();

		for (int i = 0; i < 10; i++) {

			if (dado == numeros[i]) {

				posicao = i + 1;

				System.out.println("O número " + dado + " está na " + posicao + "ª posição.");

			}

		}

		if (posicao == 0) {

			System.out.println("Número não encontrado!");

		}

	}

}
