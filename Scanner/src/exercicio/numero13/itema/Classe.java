/*Quatro vari�veis
 * Imprima true se o valor do primeiro n�mero � menor ou igual a soma do 
 *segundo n�mero com o terceiro e o quarto n�mero, for impar ou maior que 10,
 *caso contr�rio false.
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

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez, prometo!)");
		numero4 = scanner.nextInt();

		if ((numero1 <= (numero2 + numero3)) && ((numero4 % 2 != 0) || (numero4 > 10))) {
			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
