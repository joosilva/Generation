package operadoresLogicos;

import java.util.Scanner;

public class exercicio4{

	public static void main(String[] args) {
		
		//Quarto enunciado:
		int a,b,c,r,s;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Atribua um valor para A:");
		a = leia.nextInt();
		System.out.println("Atribua um valor para B:");
		b = leia.nextInt();
		System.out.println("Atribua um valor para C:");
		c = leia.nextInt();
		
		r = (int)Math.pow(a+b, 2);
		s = (int)Math.pow(b+c, 2);
		d = (r+s)/2;
				
		System.out.println("O resultado é " + d + ".");

	}

}