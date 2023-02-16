package lacosCondicionais;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int codigoOperacao;
		double saldo = 1000, valor, saque, deposito;

		System.out.println("\tBANCO GEN\nBEM-VINDE À SUA CONTA\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
		codigoOperacao = leia.nextInt();

		while (codigoOperacao < 1 || codigoOperacao > 4) {
			System.out.println("\nOPÇÃO INVÁLDA\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
			codigoOperacao = leia.nextInt();
		}

		while (codigoOperacao >= 1 && codigoOperacao < 4) {

			switch (codigoOperacao) {
			case 1:
				System.out.println("\nSeu saldo é de R$" + saldo + ".");
				System.out.println("\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
				codigoOperacao = leia.nextInt();
				if (codigoOperacao < 1 || codigoOperacao > 4) {
					System.out.println("\nOPÇÃO INVÁLDA\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
					codigoOperacao = leia.nextInt();
				}
				break;
			case 2:
				System.out.println("\nSeu saldo é de R$" + saldo + ".\nQual valor deseja sacar (em reais)?");
				saque = leia.nextFloat();

				if (saque > saldo) {
					System.out.println("\nSALDO INSUFICIENTE\nQual valor deseja sacar (em reais)?");
					saque = leia.nextFloat();
				}
				saldo -= saque;
				System.out.println("\nSeu novo saldo é de R$" + saldo + ".");
				System.out.println("\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
				codigoOperacao = leia.nextInt();
				if (codigoOperacao < 1 || codigoOperacao > 4) {
					System.out.println("\nOPÇÃO INVÁLDA\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
					codigoOperacao = leia.nextInt();
				}
				break;
			case 3:
				System.out.println("\nQual valor deseja depositar (em reais)?");
				deposito = leia.nextFloat();
				saldo += deposito;
				System.out.println("\nSeu novo saldo é de R$" + saldo + ".");
				System.out.println("\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
				codigoOperacao = leia.nextInt();
				if (codigoOperacao < 1 || codigoOperacao > 4) {
					System.out.println("\nOPÇÃO INVÁLDA\nESCOLHA UMA OPÇÃO:\n1 - SALDO\n2 - SAQUE\n3 - DEPÓSITO\n4 - SAIR");
					codigoOperacao = leia.nextInt();
				}
				break;
			
			} 
			
			}

		switch (codigoOperacao) {
		case 4:
			System.out.println("\nObrigado! Volte sempre!");
			break;
		
		}

	}

}
