/*
 * Imprima false se o primeiro n�mero � maior que 10 ou o terceiro n�mero for
maior que 0, ou o segundo n�mero mais o quarto n�mero for igual a 0. Caso
contr�rio true.
 */
package exercicio.numero13.iteme;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez, prometo!)");
		numero4 = scanner.nextInt();

		scanner.close();

		if ((numero1 > 10) || (numero3 > 0) || (numero2 + numero4 == 0)) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}
