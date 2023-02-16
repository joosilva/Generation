package operadoresLogicos;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int duracao,h,m,s;
		
		System.out.println("Qual foi a duração do evento (em segundos)?");
	    duracao = leia.nextInt();
		h = duracao / 3600;
		m = (duracao % 3600) / 60;
		s = m % 60;
		
		System.out.println("O evento durou " + h + " horas e " + m + " minutos e " + s + " segundos.");

	}

}