/*
 * Escreva no console para digitar um n�mero inteiro, leia o n�mero inteiro digitado.
Escreva no console para digitar outro n�mero inteiro, leia o n�mero inteiro digitado.
Imprima no console true se o primeiro n�mero � maior que o segundo n�mero digitado.
 */
package exercicio.numero4;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int numero1;
	int numero2;
	
	System.out.println("Digite um n�mero");
	numero1 = scanner.nextInt();
	System.out.println("Digite outro n�mero");
	numero2 = scanner.nextInt();
	
	if(numero1 > numero2){
		
		// true sem aspas � booleano, com aspas � texto
		System.out.println(true);
		
		scanner.close();
	}
}
}
