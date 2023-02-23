package pilhasEFilas;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {

		// Segundo enunciado:
		Scanner leia = new Scanner(System.in);

		Stack<String> livros = new Stack<String>();
		
		int opcao;
		
		String livro;

		System.out.println("\tDigite a opção desejada:"
				+ "\n1 - Adicionar livro à pilha\n2 - Listar livros da pilha\n3 - Retirar livro da pilha\n4 - Sair");
		opcao = leia.nextInt();
		
		while (opcao < 1 || opcao > 4) {
			
			System.out.println("\nOpção inválida!\n\tDigite a opção desejada:"
					+ "\n1 - Adicionar livro à pilha\n2 - Listar livros da pilha\n3 - Retirar livro da pilha\n4 - Sair");
			opcao = leia.nextInt();
			
		}

		while (opcao > 0 && opcao < 4) {

			switch (opcao) {

			case 1:

				System.out.println("\nDigite o nome do cliente:");
				livro = leia.nextLine();
				livros.push(livro);

				break;

			case 2:

				if (livros.isEmpty()) {

					System.out.println("\nNão há livros na pilha!!");

				} else {

					System.out.println(livros);

				}

				break;

			case 3:

				if (livros.isEmpty()) {

					System.out.println("\nNão há livros na pilha!!");

				} else {

					System.out.println(livros.pop());
					livros.pop();

				}

				break;
				
					
				}
			
			System.out.println("\tDigite a opção desejada:"
					+ "\n1 - Adicionar livro à pilha\n2 - Listar livros da pilha\n3 - Retirar livro da pilha\n4 - Sair");
			opcao = leia.nextInt();
			
			while (opcao < 1 || opcao > 4) {
				
				System.out.println("\nOpção inválida!\n\tDigite a opção desejada:"
						+ "\n1 - Adicionar livro à pilha\n2 - Listar livros da pilha\n3 - Retirar livro da pilha\n4 - Sair");
				opcao = leia.nextInt();

			}
			
			switch (opcao) {
			
			case 4:

				System.out.println("Obrigado! Volte sempre!");

				break;
			
			}

		}

	}

}
