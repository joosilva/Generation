package lacosCondicionais;

import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
	
	//Segundo enunciado:
	int a;
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("Defina um valor pertencente aos inteiros:");
	a = leia.nextInt();
    
	if (a%2 == 0) {
		if (a>=0) {
			System.out.println("\nQue legal! O número que você escolheu (" + a + ") é par e positivo!");
		} else {
			System.out.println("\nQue legal! O número que você escolheu (" + a + ") é par e negativo!");
		}
	}else {
		if (a>=0) {
			System.out.println("\nQue legal! O número que você escolheu (" + a + ") é ímpar e positivo!");
		} else {
			System.out.println("\nQue legal! O número que você escolheu (" + a + ") é ímpar e negativo!");
		}
	}
	
  }	
}
