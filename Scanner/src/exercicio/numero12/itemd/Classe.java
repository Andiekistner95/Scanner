/*
 * Imprima true se o resultado é menor que 10 ou maior que 100, caso contrário false.
 */
package exercicio.numero12.itemd;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int resultado;

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();

		System.out.println("Me dê mais um número");
		numero2 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez)");
		numero3 = scanner.nextInt();

		resultado = (int) ((numero1 * numero3) + (Math.pow(numero2, 3)));

		if ((resultado < 10) || (resultado > 100)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		scanner.close();
	}
}
