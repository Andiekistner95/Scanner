/*
 * Imprima true se o resultado � maior que 10 ou maior que 1, caso contr�rio false.
 */
package exercicio.numero12.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int resultado;

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();

		resultado = (int) ((numero1 * numero3) + (Math.pow(numero2, 3)));

		if ((resultado > 0) || (resultado > 1)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.close();
	}
}
