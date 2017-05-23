/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
Imprima no console o resultado da divisão dos dois números.
 */
package exercicio.numero6;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int numero1;
	int numero2;
	System.out.println("Give me a number");
	numero1 = scanner.nextInt();
	System.out.println("Give another number");
	numero2 = scanner.nextInt();
	
	System.out.println(numero1 / numero2);
	scanner.close();
}
}
