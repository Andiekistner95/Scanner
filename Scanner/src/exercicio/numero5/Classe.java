/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
Imprima no console true se o resultado do primeiro número menos o segundo
número é maior que 0 e false caso for menor igual a 0.
 */
package exercicio.numero5;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();
		System.out.println("Me dê outro número");
		numero2 = scanner.nextInt();

		if ((numero1 - numero2) > 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
