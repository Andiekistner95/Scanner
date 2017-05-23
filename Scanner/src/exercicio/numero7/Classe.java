/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
Imprima no console true se o resultado da divisão dos dois número é par, e false
caso o resultado da divisão seja ímpar.
 */
package exercicio.numero7;

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
		if (number1 % number2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
