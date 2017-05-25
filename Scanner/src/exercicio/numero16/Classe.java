/*
 * Fale para o usuário digitar no console apenas números, quantos o mesmo achar
necessário. Após o usuário digitar, o algoritmo deve substituir todas os números
pelas respectivas letras, conforme quadro abaixo. Ou seja, se o usuário digitar o
seguinte valor (1 4 2 3 5 3), deve ser impresso no console (A D B C E C).
 */
package exercicio.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String numeros;

		System.out.println("Informe os números desejados (utilizando espaço para separá-los)");
		numeros = scanner.nextLine();
		scanner.close();

		//Estou quebrando o que o usuário digitou usando espaço como delimitador (\\s)
		// E estou atribuindo os valores encontrados no Array de partes
		String[] partes = numeros.split("\\s");

		//Adiciona cada letra da string para o char de alfabeto
		char[] alfabeto = "abcdefghijlmnopqrstuvxz".toCharArray();

		//Percorre o Array de numeros digitados
		for (int numerosDigitados = 0; numerosDigitados < partes.length; numerosDigitados++) {

			//Percorre o array de letras do alfabeto
			for (int aux = 0; aux <= alfabeto.length; aux++) {

				//Compara se o valor armazenado no array de numeros é igual a posição
				// da letra do alfabeto
				if (Integer.parseInt(partes[numerosDigitados]) - 1 == aux) {
					
					System.out.print(" " + alfabeto[aux]);
				}
			}
		}
	}
}
