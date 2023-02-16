package operadoresLogicos;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		
		//Enunciado 8:
		double custoTotal, custoFabrica, imposto = 0.45, distribuidor = 0.28;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Defina o valor de custo de fábrica para o carro:");
		custoFabrica = leia.nextDouble();
		
		custoTotal = custoFabrica + custoFabrica*imposto + custoFabrica*distribuidor;
		System.out.println("\nO valor do carro para o consumidor é " + custoTotal + ".");	
		
	}

}
