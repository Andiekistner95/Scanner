/*
 * Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
Some o n�mero que o usu�rio digitou com 5. Imprima o resultado da soma.
Pegue o resultado e some com 5 novamente. Imprima o resultado da soma.
 */
package exercicio.numero17;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();

		int soma = numero + 5;
		System.out.println("Resultado:" + soma);

		int soma2 = soma + 5;
		System.out.println("Resultado final:" + soma2);

		scanner.close();
	}
}
