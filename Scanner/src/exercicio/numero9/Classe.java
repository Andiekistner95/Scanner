/*
 * Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
Imprima no console true se o primeiro n�mero � menor igual a zero ou o segundo
n�mero � maior que 10. Caso contr�rio imprima false.
 */
package exercicio.numero9;

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
		if ((number1 <= 0) || (number2 > 10)) {
			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
