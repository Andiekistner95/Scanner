/*
 * Crie uma vari�vel de nome �teste� do tipo boolean com o valor true.
 * Crie outra vari�vel de nome �outroTeste� do tipo boolean com o valor false.
   Imprima os valores das duas vari�veis.
   Coloque o valor da vari�vel �teste� na vari�vel �outroTeste�.
   Imprima novamente ambas as vari�veis.
   Agora coloque o valor false na vari�vel �teste�, e imprima ambas as vari�veis novamente.
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
