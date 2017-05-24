/*Quatro variáveis
 * Imprima true se o valor do primeiro número é menor ou igual a soma do 
 *segundo número com o terceiro e o quarto número, for impar ou maior que 10,
 *caso contrário false.
 */
package exercicio.numero13.itema;

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

		if ((numero1 <= (numero2 + numero3)) && ((numero4 % 2 != 0) || (numero4 > 10))) {
			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
