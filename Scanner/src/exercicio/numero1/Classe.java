/*
 * Escreva no console para digitar um número inteiro, leia o número inteiro digitado e
imprima o número no console.
 */
package exercicio.numero1;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		//chamar a classe scanner
		Scanner scanner = new Scanner(System.in);

		int numero;
		
		System.out.println("Digite um número");
		
		//vai capturar o numero para mostrar no scanner
		numero = scanner.nextInt();

		System.out.println(numero);
		
		// fechar o scanner
		scanner.close();
	}
}
