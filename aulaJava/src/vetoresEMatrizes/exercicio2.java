package vetoresEMatrizes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main (String[] args) {
		
		//Segundo enunciado:
		Scanner leia = new Scanner (System.in);
		
		String dados;
		
		System.out.println("Digite 10 números inteiros seprados por vírgula:");
		dados = leia.next();
		String [] dadosSeparados = dados.split(",");
		
		int [] numeros = new int [10];
		int somaNumeros = 0;
		
		ArrayList <Integer> numerosPares = new ArrayList <Integer>();
		ArrayList <Integer> indicesImpares = new ArrayList <Integer>();
		
		for (int i = 0; i < dadosSeparados.length; i++) {
			
			numeros [i] = Integer.parseInt(dadosSeparados[i]);
			
			if (numeros [i] % 2 == 0) {
				
				numerosPares.add (numeros [i]);
				
			}
			
			if (i % 2 != 0) {
				
				indicesImpares.add (numeros[i]);
				
			}
			
			somaNumeros += numeros [i];
			
		}
		
		double mediaNumeros = somaNumeros / numeros.length;
		
		System.out.println("Os números pares são: " + numerosPares + 
				", e os números guardados nos índices ímpares são: " + indicesImpares + 
				".\nA soma dos números que você colocou é igual a " + somaNumeros +
				" e a média deles é de " + mediaNumeros + ".");
		
	}

}
