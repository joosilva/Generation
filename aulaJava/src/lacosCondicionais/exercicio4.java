package lacosCondicionais;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		//Quarto enunciado:
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá!\nEscolha uma das opções abaixo:\n1 - VERTEBRADO\n2 - INVERTEBRADO");
		a = leia.nextInt();
		
		if (a==1) {
			System.out.println("\nAgora escolha entre:\n1 - AVE\n2 - MAMÍFERO");
		    b = leia.nextInt();
		    if (b==1) {
		    	System.out.println("\nAgora escolha entre:\n1 - CARNÍVORO\n2 - ONÍVORO");
			    c = leia.nextInt();
			    if (c==1) {
			    	System.out.println("\nEste animal é uma ÁGUA!");
			    }else if (c==2) {
			    	System.out.println("\nEste animal é uma POMBA!");
			    } else {
			    	System.out.println("\nParece que você escolheu uma opção inexistente.");
			    }
		    } else if (b==2) {
		    	System.out.println("\nAgora escolha entre:\n1 - ONÍVORO\n2 - HERBÍVORO");
		    	c = leia.nextInt();
		    	if (c==1) {
			    	System.out.println("\nEste animal é um HOMEM!");
		    	} else if (c==2) {
			    	System.out.println("\nEste animal é uma VACA!");
		    	} else {
			    	System.out.println("\nParece que você escolheu uma opção inexistente.");
		    	}
		    } else {
		    	System.out.println("\nParece que você escolheu uma opção inexistente.");
		    }
		} else if (a==2) {
			System.out.println("\nAgora escolha entre:\n1 - INSETO\n2 - ANELÍDEO");
		    b = leia.nextInt();
		    if (b==1) {
		    	System.out.println("\nAgora escolha entre:\n1 - HEMATÓFAGO\n2 - HERBÍVORO");
			    c = leia.nextInt();
			    if (c==1) {
			    	System.out.println("\nEste animal é uma PULGA!");
			    } else if (c==2) {
			    	System.out.println("\nEste animal é uma LAGARTA!");
			    } else {
			    	System.out.println("\nParece que você escolheu uma opção inexistente.");
			    }
		    } else if (b==2) {
		    	System.out.println("\nAgora escolha entre:\n1 - HEMATÓFAGO\n2 - ONÍVORO");
			    c = leia.nextInt();
			    if (c==1) {
			    	System.out.println("\nEste animal é uma SANGUESSUGA!");
			    } else if (c==2) {
			    	System.out.println("\nEste animal é uma MINHOCA!");
			    } else {
			    	System.out.println("\nParece que você escolheu uma opção inexistente.");
			    }
		    } else {
		    	System.out.println("\nParece que você escolheu uma opção inexistente.");
		    }
		} else {
	    	System.out.println("\nParece que você escolheu uma opção inexistente.");
		}
		
		
	}

}
