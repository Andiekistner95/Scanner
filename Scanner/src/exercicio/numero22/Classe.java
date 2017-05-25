/*
 * Crie uma variável de nome “teste” do tipo boolean com o valor true.
 * Crie outra variável de nome “outroTeste” do tipo boolean com o valor false.
   Imprima os valores das duas variáveis.
   Coloque o valor da variável “teste” na variável “outroTeste”.
   Imprima novamente ambas as variáveis.
   Agora coloque o valor false na variável “teste”, e imprima ambas as variáveis novamente.
   Verifique o que aconteceu.
 */
package exercicio.numero22;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean teste = true;
		boolean outroteste = false;
		System.out.println(teste + " e " + outroteste);

		outroteste = teste;
		System.out.println(teste + " e " + outroteste);

		teste = false;
		System.out.println(teste + " e " + outroteste);

		scanner.close();
	}
}
