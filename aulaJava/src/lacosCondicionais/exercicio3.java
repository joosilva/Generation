package lacosCondicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Terceiro enunciado:
		String nome;
		int doador;
		double idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual seu nome?");
		nome = leia.nextLine();
		System.out.println("Qual sua idade?");
		idade = leia.nextDouble();
		System.out.println("Você já doou sangue enteriormente?\n1 - SIM\n2 - NÃO");
		doador = leia.nextInt();
		
		if (idade>=18 && idade<=59) {
			System.out.println("Parabéns, " + nome + "! Você está APTO para doar sangue!");
		} else if (idade>=60 && idade<=69 && doador==1) {
			System.out.println("Parabéns, " + nome + "! Você está APTO para doar sangue!");
		} else {
			System.out.println("Poxa, " + nome + ", infelizmente você NÃO ESTÁ APTO para doar sangue!");
		}
	}
}	