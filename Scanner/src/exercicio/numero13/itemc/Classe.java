/*
 * Imprima true se o resultado da quest�o a e o resultado da quest�o b forem
verdadeiras, ou o resultado da quest�o a e o resultado da quest�o b forem
falsas.
 */
package exercicio.numero13.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int resultado;
		int resultado2;
		boolean resultadoA;
		boolean resultadoB;

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez, prometo!)");
		numero4 = scanner.nextInt();
		
		scanner.close();

		if ((numero1 <= (numero2 + numero3)) && ((numero4 % 2 != 0) || (numero4 > 10))) {
			resultadoA = true;
			
		} else {
			resultadoA = false;
		}

		resultado = (numero1 + numero2 + numero3 + numero4);
		resultado2 = (numero1 + numero2 + numero3);

		if ((resultado % 10 == 0) 
				|| (resultado % 5 == 0) 
				|| (numero1 == 5) 
				|| ((resultado2 > 100) && (numero1 > 0))) {
			resultadoB = true;
			
		} else {
			resultadoB = false;
		}
		
		if(resultadoA && resultadoB == true){
			System.out.println(true);
			
		}else{
			System.out.println(false);
			
		}
	}
}
