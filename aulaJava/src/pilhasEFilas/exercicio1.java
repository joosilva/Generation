package pilhasEFilas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		// Primeiro enunciado:
		Scanner leia = new Scanner(System.in);

		Queue<String> clientes = new LinkedList<String>();

		System.out.println("\tDigite a opção desejada:"
				+ "\n1 - Adicionar cliente na fila\n2 - Listar clientes da fila\n3 - Chamar próximo cliente\n4 - sair");
		int opcao = leia.nextInt();

		while (opcao > 0 && opcao < 4) {

			switch (opcao) {

			case 1:

				System.out.println("\nDigite o nome do cliente:");
				String nomeCliente = leia.nextLine();
				clientes.add(nomeCliente);

				break;

			case 2:

				if (clientes.isEmpty()) {

					System.out.println("\nNão há clientes na fila!");

				} else {

					System.out.println(clientes);

				}

				break;

			case 3:

				if (clientes.isEmpty()) {

					System.out.println("\nNão há clientes na fila!");

				} else {

					System.out.println(clientes.peek());

				}

				break;

			}
			
			switch (opcao) {
			
			case 4:

				System.out.println("Obrigado! Volte sempre!");

				break;
			
			}

		}

	}

}
