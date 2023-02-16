package operadoresLogicos;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
	
		//Sexto enunciado:
		String p1,p2,x1,x2,y1,y2;
		double d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva as coordenadas do PONTO 1 (Escreva os valores de X e Y separados por vírgula: X,Y)");
		p1 = leia.next();
		System.out.println("Escreva as coordenadas do PONTO 2 (Escreva os valores de X e Y separados por vírgula: X,Y)");
		p2 = leia.next();
		
		String[] coord1 = p1.split(",");
		String[] coord2 = p2.split(",");
		x1 = coord1[0];
		y1 = coord1[1];
		x2 = coord2[0];
		y2 = coord2[1];
		
		double x1D = Double.parseDouble(x1), x2D = Double.parseDouble(x2), y1D = Double.parseDouble(y1), y2D = Double.parseDouble(y2);
		d = Math.sqrt(Math.pow((x2D-x1D), 2) + Math.pow((y2D-y1D), 2));
		System.out.printf("A distância entre os pontos é de ~ %.2f.", d);
		
		
	}

}
