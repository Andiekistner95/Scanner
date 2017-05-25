/*
 * Peça para o usuário digitar um texto.
 * Guarde o texto que o usuário digitou em uma variável.
 * Crie outra variável de nome “outroTexto”, atribuindo o valor da variável que o usuário digitou.
   Altere o valor da variável que o usuário digitou para “Olá”.
   Imprima as duas variáveis, e observe o que foi impresso.
 */
package exercicio.numero20;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");

		String primeirotexto = scanner.nextLine();
		String outroTexto = primeirotexto;
		primeirotexto = "Olá";

		System.out.println(primeirotexto + " " + outroTexto);
		scanner.close();
	}
}
