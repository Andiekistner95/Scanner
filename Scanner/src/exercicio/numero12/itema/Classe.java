/* COM TR�S NUMEROS
 * Imprima o resultado do seguinte c�lculo (primeiro n�mero multiplicado pelo
terceiro n�mero mais, o resultado somando com o segundo n�mero elevado
ao cubo).
 */
package exercicio.numero12.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numero1;
		int numero2;
		int numero3;

		System.out.println("Me d� um n�mero");
		numero1 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero");
		numero2 = scanner.nextInt();

		System.out.println("Me d� mais um n�mero (� a �ltima vez)");
		numero3 = scanner.nextInt();

		// fun��o para elevar n�meros(primeiro o numero que sera elevado, depois
		// por quanto ser� elevado)
		System.out.println((numero1 * numero3) + (Math.pow(numero2, 3)));
		scanner.close();

		// adicionar int para converter para double
		// System.out.println((int)(numero1 * numero3) + (Math.pow(numero2,
		// 3)));

	}
}
