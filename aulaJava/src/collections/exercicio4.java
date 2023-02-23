package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		//Segundo enunciado:
		ArrayList <Integer> numeros = new ArrayList <Integer> ();
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		Scanner leia = new Scanner (System.in);		
		
		System.out.println("Digite um número inteiro que deseja procurar:");
		int numeroDesejado = leia.nextInt();
		
		if (numeros.contains(numeroDesejado)) {
			
			System.out.println("\nO número " + numeroDesejado + " está na " + (numeros.indexOf(numeroDesejado) + 1) + "ª posição.");
			
		} else {
			
			System.out.println("Número não encontrado!");
			
		}
		
	}

}
