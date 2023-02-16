package operadoresLogicos;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade,a,m,d;
		
		System.out.println("Qual sua idade de dias?");
		idade = leia.nextInt();
		a = idade/365;
		m = (idade%365)/30;
		d = m%30;
		
		System.out.println("Sua idade é " + a + " anos e " + m + " meses e " + d + " dias.");

	}

}