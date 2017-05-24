/*
 * Imprima false se o primeiro número é maior que 10 ou o terceiro número for
maior que 0, ou o segundo número mais o quarto número for igual a 0. Caso
contrário true.
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

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();

		System.out.println("Me dê mais um número");
		numero2 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez)");
		numero3 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez, prometo!)");
		numero4 = scanner.nextInt();

		scanner.close();

		if ((numero1 > 10) || (numero3 > 0) || (numero2 + numero4 == 0)) {
			System.out.println(false);
		} else {
			System.out.println(true);
		}
	}
}
