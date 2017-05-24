/*
 * Imprima true se a soma do primeiro dígito mais o segundo mais o terceiro
mais o quarto dígito for múltiplo de 10, ou múltiplo de 5, ou o primeiro dígito for 5,
ou a soma do primeiro dígito mais o segundo e o terceiro dígito, for maior que 100.0, 
e o primeiro dígito maior que 0.
 */
package exercicio.numero13.itemb;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int resultado;
		int resultado2;

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();
		System.out.println("Me dê mais um número");
		numero2 = scanner.nextInt();
		System.out.println("Me dê mais um número (É a última vez)");
		numero3 = scanner.nextInt();
		System.out.println("Me dê mais um número (É a última vez, prometo!)");
		numero4 = scanner.nextInt();

		resultado = (numero1 + numero2 + numero3 + numero4);
		resultado2 = (numero1 + numero2 + numero3);

		if ((resultado % 10 == 0) 
				|| (resultado % 5 == 0) 
				|| (numero1 == 5) 
				|| ((resultado2 > 100) && (numero1 > 0))
				) {

			System.out.println(true);
		} else {
			System.out.println(false);
			scanner.close();
		}
	}
}
