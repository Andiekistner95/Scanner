/*
 * Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
Imprima no console o resto do primeiro n�mero digitado com o segundo n�mero
digitado, o multiplicando por 10.
 */
package exercicio.numero11;

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
		System.out.println((number1 % number2) * 10);
		scanner.close();
	}
}
