package vetoresEMatrizes;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		// Terceiro enunciado:
		Scanner leia = new Scanner(System.in);

		int[][] numeros = new int[3][3];

		for (int linha = 0; linha < 3; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.println("Digite o número da " + (linha + 1) + "ª linha e " + (coluna + 1) + "ª linha:");
				numeros[linha][coluna] = leia.nextInt();

			}

		}

		ArrayList<Integer> diagonalPrincipal = new ArrayList<Integer>();
		ArrayList<Integer> diagonalSecundaria = new ArrayList<Integer>();
		int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

		for (int linha = 0, coluna = 0; linha < 3 && coluna < 3; linha++, coluna++) {

			diagonalPrincipal.add (numeros[linha][coluna]);
			somaDiagonalPrincipal += numeros[linha][coluna];

		}
		
		for (int linha = (numeros.length - 1), coluna = (numeros.length -1); linha >= 0 && coluna >= 0; linha--, coluna--) {
			
			diagonalSecundaria.add (numeros[linha][coluna]);
			somaDiagonalSecundaria += numeros[linha][coluna];
			
		}
		
		System.out.println("Os elementos da diagonal principal são " + diagonalPrincipal +
				" e os da diagonal secundária são " + diagonalSecundaria +
				"\nA soma dos elementos da diagonal principal é igual a " + somaDiagonalPrincipal +
				" e da diagonal secundária é igual a " + somaDiagonalSecundaria + ".");

	}

}
