package operadoresLogicos;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		//Primeiro enunciado:
		Scanner leia = new Scanner(System.in);
		
		String a, m, d, idade;
		
		int idadeNum;
		
		System.out.println("Qual sua idade em anos, meses e dias, respectivamente? (Digite separado por vírgula).");
		idade = leia.nextLine();
		
		String[] dados = idade.split(",");
		a = dados[0];
		m = dados[1];
		d = dados[2];
		
		int aNum = Integer.parseInt(a), mNum = Integer.parseInt(m), dNum = Integer.parseInt(d);
		aNum = (aNum * 365);
		mNum = (mNum * 30);
		idadeNum = aNum + mNum + dNum;
		
        System.out.println("\nSua idade em dias é de " + idadeNum + " dias.");
	}

}
 