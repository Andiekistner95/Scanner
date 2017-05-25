/*
 * Peça para o usuário digitar um número. Guarde o número que o usuário digitou.
Some o número que o usuário digitou com 5. Imprima o resultado da soma.
Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.
 */
package exercicio.numero17;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int numero = scanner.nextInt();

		int soma = numero + 5;
		System.out.println("Resultado:" + soma);

		int soma2 = soma + 5;
		System.out.println("Resultado final:" + soma2);

		scanner.close();
	}
}
