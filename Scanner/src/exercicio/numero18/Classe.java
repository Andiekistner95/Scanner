/*
 * Pe�a para o usu�rio digitar um n�mero. Guarde o n�mero que o usu�rio digitou.
Subtraia o n�mero por 5 e imprima o resultado. Pegue novamente o n�mero que o
usu�rio digitou e subtraia por 3 e imprima o resultado. Pegue o resultado da
subtra��o por 5 e o resultado da subtra��o por 3 e imprima os dois resultado.
 */
package exercicio.numero18;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();

		int s1 = numero - 5;
		System.out.println("Resultado:" + s1);

		int s2 = numero - 3;
		System.out.println("Resultado:" + s2);
		
		System.out.println("Resultados: " + s1 + " e " + s2);

		scanner.close();
	}
}
