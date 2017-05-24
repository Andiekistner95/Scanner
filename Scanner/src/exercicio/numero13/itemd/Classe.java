/*
 * Imprima false se o valor do primeiro dígito mais o segundo, terceiro e quarto
for maior que 10, caso contrário true.
 */
package exercicio.numero13.itemd;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();

		System.out.println("Me dê mais um número");
		numero2 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez)");
		numero3 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez, prometo!)");
		numero4 = scanner.nextInt();

		scanner.close();

		if ((numero1 + numero2 + numero3 + numero4) > 10) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}
