/*
 * Escreva no console para digitar um texto, leia o texto digitado e imprima o texto no
console.
 */
package exercicio.numero2;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		String texto;
		
		System.out.println("Digite o texto");
		
		// é usado nextLine para pegar a linha inteira que for digitada
		texto = scanner.nextLine();
		
		System.out.println(texto);
		
		scanner.close();
		
	}

}
