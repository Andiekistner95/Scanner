/*
 * Fale para o usu�rio digitar no console apenas n�meros, quantos o mesmo achar
necess�rio. Ap�s o usu�rio digitar, o algoritmo deve substituir todas os n�meros
pelas respectivas letras, conforme quadro abaixo. Ou seja, se o usu�rio digitar o
seguinte valor (1 4 2 3 5 3), deve ser impresso no console (A D B C E C).
 */
package exercicio.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String numeros;

		System.out.println("Informe os n�meros desejados (utilizando espa�o para separ�-los)");
		numeros = scanner.nextLine();
		scanner.close();

		//Estou quebrando o que o usu�rio digitou usando espa�o como delimitador (\\s)
		// E estou atribuindo os valores encontrados no Array de partes
		String[] partes = numeros.split("\\s");

		//Adiciona cada letra da string para o char de alfabeto
		char[] alfabeto = "abcdefghijlmnopqrstuvxz".toCharArray();

		//Percorre o Array de numeros digitados
		for (int numerosDigitados = 0; numerosDigitados < partes.length; numerosDigitados++) {

			//Percorre o array de letras do alfabeto
			for (int aux = 0; aux <= alfabeto.length; aux++) {

				//Compara se o valor armazenado no array de numeros � igual a posi��o
				// da letra do alfabeto
				if (Integer.parseInt(partes[numerosDigitados]) - 1 == aux) {
					
					System.out.print(" " + alfabeto[aux]);
				}
			}
		}
	}
}
