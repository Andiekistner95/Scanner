/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
Imprima no console o valor do resultado do primeiro número elevado ao quadrado
mais o segundo número elevado ao quadrado.
 */
package exercicio.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number1;
		int number2;
		System.out.println("Give me a number");
		number1 = scanner.nextInt();
		System.out.println("Give me another number");
		number2 = scanner.nextInt();
		System.out.println((number1 * number1) + (number2 * number2));
		scanner.close();
	}
}
