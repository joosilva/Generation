package introducao;

import java.util.Scanner;

public class exercício2 {

	public static void main(String[] args) {
		
		//Segundo enunciado:
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a nota 1:");
		nota1 = leia.nextFloat();
		System.out.println("\nDigite a nota 2:");
		nota2 = leia.nextFloat();
		System.out.println("\nDigite a nota 3:");
		nota3 = leia.nextFloat();
		System.out.println("\nDigite a nota 4:");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("\nA média é %.1f.", media);
		
	}

}

