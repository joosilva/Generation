package operadoresLogicos;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		String dados, a, b, c, d, e, f;
		double x, y, aNum, bNum, cNum, dNum, eNum, fNum;
		
		System.out.println("Defina os valores da equação (A, B, C, D, E, F):");
		dados = leia.next();
		
		String[] coord = dados.split(",");
		
		a = coord[0]; b = coord[1]; c = coord[2]; d = coord[3]; e = coord[4]; f = coord[5];
		aNum = Double.parseDouble(a); bNum = Double.parseDouble(b); cNum = Double.parseDouble(c); dNum = Double.parseDouble(d); eNum = Double.parseDouble(e); fNum = Double.parseDouble(f);
		
		x = (cNum * eNum - bNum * fNum) / (aNum * eNum - bNum * dNum);
		y = (aNum * fNum - cNum * dNum) / (aNum * eNum - bNum * dNum);
		
		System.out.println("O valor da variável X é " + x + " e da variável Y é " + y + ".");
		
	}

}
