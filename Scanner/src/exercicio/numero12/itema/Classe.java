/* COM TRÊS NUMEROS
 * Imprima o resultado do seguinte cálculo (primeiro número multiplicado pelo
terceiro número mais, o resultado somando com o segundo número elevado
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

		System.out.println("Me dê um número");
		numero1 = scanner.nextInt();

		System.out.println("Me dê mais um número");
		numero2 = scanner.nextInt();

		System.out.println("Me dê mais um número (É a última vez)");
		numero3 = scanner.nextInt();

		// função para elevar números(primeiro o numero que sera elevado, depois
		// por quanto será elevado)
		System.out.println((numero1 * numero3) + (Math.pow(numero2, 3)));
		scanner.close();

		// adicionar int para converter para double
		// System.out.println((int)(numero1 * numero3) + (Math.pow(numero2,
		// 3)));

	}
}
