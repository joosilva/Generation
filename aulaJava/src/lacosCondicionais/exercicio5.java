package lacosCondicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		//Quinto enunciado:
		
		Scanner leia = new Scanner(System.in);
		
		String cod,qtd,pedido;
		
		System.out.println("\nLANCHONETE DO ENÉIAS\n\tMenu:\n1 - HotDog (R$10,00)\n2 - X-Salada (R$15,00)\n3 - X-Bacon (R$18,00)\n4 - Bauru (R$12,00)\n5 - Refrigerante (R$8,00)\n6 - Suco de Laranja (R$13,00)\n\nDESCREVA SEU PEDIDO COM O CÓDIGO E A QUANTIDADE (qtd-cód).");
		pedido = leia.nextLine();
		
		String[] infoPedido = pedido.split("-");
		qtd = infoPedido[0];
		cod = infoPedido[1];
		
		int qtdNum=(int)Double.parseDouble(qtd),codNum=(int)Double.parseDouble(cod);
		double p1=10.00,p2=15.00,p3=18.00,p4=12.00,p5=8.00,p6=13.00;
		p1 = p1*qtdNum;
		p2 = p2*qtdNum;
		p3 = p3*qtdNum;
		p4 = p4*qtdNum;
		p5 = p5*qtdNum;
		p6 = p6*qtdNum;		
		
		switch (codNum) {
		case 1:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p1);
		break;
		case 2:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p2);
		break;
		case 3:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p3);
		break;
		case 4:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p4);
		break;
		case 5:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p5);
		break;
		case 6:
			System.out.printf("O valor total do seu pedido é R$%.2f.",p6);
		break;
		}

	}

}
