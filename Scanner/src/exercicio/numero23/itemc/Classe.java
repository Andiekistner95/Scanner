/*
 * int numero = 10;
   int outroNumero = numero;
   outroNumero = outroNumero + 10;
   numero = outroNumero;
   numero = outroNumero + 1;
   System.out.println(numero + 1);
   outroNumero = numero + 1;
   System.out.println(numero);
Console:
21
22
 */
package exercicio.numero23.itemc;

public class Classe {
	public static void main(String[] args) {
		int numero = 10;
		int outroNumero = numero;
		outroNumero = outroNumero + 10;
		numero = outroNumero;
		numero = outroNumero + 1;
		System.out.println(numero + 1);
		outroNumero = numero + 1;
		System.out.println(numero);
	}
}
//Na hora de imprimir a variavel numero foi adicionado +1 tornando assim o resultado em 22.
//E na segunda impressão ele imprimiu o numero(= 21) ao invés de outroNumero(= 22).