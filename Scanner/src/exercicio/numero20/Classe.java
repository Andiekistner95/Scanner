/*
 * Pe�a para o usu�rio digitar um texto.
 * Guarde o texto que o usu�rio digitou em uma vari�vel.
 * Crie outra vari�vel de nome �outroTexto�, atribuindo o valor da vari�vel que o usu�rio digitou.
   Altere o valor da vari�vel que o usu�rio digitou para �Ol�.
   Imprima as duas vari�veis, e observe o que foi impresso.
 */
package exercicio.numero20;

import java.util.Scanner;

public class Classe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");

		String primeirotexto = scanner.nextLine();
		String outroTexto = primeirotexto;
		primeirotexto = "Ol�";

		System.out.println(primeirotexto + " " + outroTexto);
		scanner.close();
	}
}
