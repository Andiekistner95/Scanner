/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado.
Escreva no console para digitar outro número inteiro, leia o número inteiro digitado.
Imprima no console true se o primeiro número é maior que o segundo número digitado.
 */
package exercicio.numero4;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int numero1;
	int numero2;
	
	System.out.println("Digite um número");
	numero1 = scanner.nextInt();
	System.out.println("Digite outro número");
	numero2 = scanner.nextInt();
	
	if(numero1 > numero2){
		
		// true sem aspas é booleano, com aspas é texto
		System.out.println(true);
		
		scanner.close();
	}
}
}
