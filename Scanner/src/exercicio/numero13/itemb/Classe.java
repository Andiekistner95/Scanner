/*
 * Imprima true se a soma do primeiro d�gito mais o segundo mais o terceiro
mais o quarto d�gito for m�ltiplo de 10, ou m�ltiplo de 5, ou o primeiro d�gito for 5,
ou a soma do primeiro d�gito mais o segundo e o terceiro d�gito, for maior que 100.0, 
e o primeiro d�gito maior que 0.
 */
package exercicio.numero13.itemb;

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

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();
		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();
		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();
		System.out.println("Me d� mais um n�mero (� a �ltima vez, prometo!)");
		numero4 = scanner.nextInt();

		resultado = (numero1 + numero2 + numero3 + numero4);
		resultado2 = (numero1 + numero2 + numero3);

		if ((resultado % 10 == 0) 
				|| (resultado % 5 == 0) 
				|| (numero1 == 5) 
				|| ((resultado2 > 100) && (numero1 > 0))
				) {

			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
