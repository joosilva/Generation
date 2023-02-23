package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		// Primeiro enunciado:
		Scanner leia = new Scanner(System.in);

		ArrayList<String> cores = new ArrayList<String>();

		for (int i = 1; i <= 5; i++) {

			System.out.println("Digite a " + i + "ª cor:");
			String cor = leia.nextLine();
			cores.add(cor);

		}
		
		System.out.println("\nCores escolhidas:");

		for (int i = 0; i < cores.size(); i++) {

			System.out.println(cores.get(i));

		}

		cores.sort(null);
		
		System.out.println("\nCores em ordem alfabética:");

		for (int i = 0; i < cores.size(); i++) {

			System.out.println(cores.get(i));

		}

	}

}
