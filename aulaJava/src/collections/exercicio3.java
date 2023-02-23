package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Terceiro enunciado:
		Set <Integer> numeros = new HashSet <Integer> ();
		
		Scanner leia = new Scanner (System.in);

		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite o " + i + "º número inteiro:");
			int dado = leia.nextInt();
			numeros.add(dado);
			
		}
		
		Iterator <Integer> iNumeros = numeros.iterator ();
		
		System.out.println("\nOs números que você escolheu são:");
		
		while (iNumeros.hasNext()) {
			
			System.out.println(iNumeros.next());
			
		}
		
	}

}
