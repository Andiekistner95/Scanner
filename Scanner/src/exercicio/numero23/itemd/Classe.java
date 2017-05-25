/* double numero = 0.1 + 0.2;
   numero = 0.1 + 0.2;
   double outroNumero = numero - 0.1;
   numero = outroNumero;
   outroNumero = numero - 1;
   System.out.println(numero);
Console:
0.3
 * 
 */
package exercicio.numero23.itemd;

public class Classe {
	public static void main(String[] args) {
		double numero = 0.1 + 0.2;
		numero = 0.1 + 0.2;
		double outroNumero = numero - 0.1;
		numero = outroNumero;
		outroNumero = numero - 1;
		System.out.println(numero);
	}
}
//numero tinha o valor 0.3 até receber o valor de outroNumero (0.2)