package vetoresEMatrizes;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {
	
	public static void main (String[] args) {
		
		//Quarto enunciado:
		Scanner leia = new Scanner (System.in);
		
		int bimestres = 0, alunes = 0;
		
		System.out.println("Qual a quantidade de alunes?");
		alunes = leia.nextInt();
		
		System.out.println("Qual a quantidade de bimestres?");
		bimestres = leia.nextInt();
		
		double notas [][] = new double [alunes][bimestres];
		
		for (int linha = 0; linha < alunes; linha++) {
			
			for (int coluna = 0; coluna < bimestres; coluna++) {
				
				System.out.println("Digite a nota do " + (linha + 1) + "º alune para o " + (coluna + 1) + "º bimestre:");
				notas [linha][coluna] = leia.nextDouble();
				
			}
			
		}
		
		ArrayList <Double> mediaAlunes = new ArrayList <Double> ();
		
		double somaNotas = 0;
		
		for (int linha = 0; linha < alunes; linha++) {
			
			for (int coluna = 0; coluna < bimestres; coluna++) {
				
				somaNotas += notas[linha][coluna];
				
			}
			
			somaNotas /= bimestres;
			
			mediaAlunes.add (somaNotas);
			
			somaNotas = 0;
			
		}
		
		System.out.println("A média dos alunes foi de " + mediaAlunes + ".");
		
	}

}
