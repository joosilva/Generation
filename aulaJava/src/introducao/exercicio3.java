package introducao;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		//Terceiro enunciado:
		float salarioBruto, horasExtras, adicionalNoturno = 500, descontos = 200, salarioLiquido;
				
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\nQual seu salário bruto? (Em R$)");
		salarioBruto = leia.nextFloat();
		System.out.println("\nQuantas horas extra você fez esse mês?");
		horasExtras = leia.nextFloat();
				
		salarioLiquido = salarioBruto + horasExtras * 5 + adicionalNoturno - descontos;
		System.out.printf("\nSeu salário líquido será R$%.2f esse mês.", salarioLiquido);
				
	}

}
