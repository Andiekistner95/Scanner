/*
 * Diga se o c�digo abaixo esta condizente com o que ser� impresso no console,
 * se n�o, o por que e diga o resultado correto.

a. String texto = �Vin�cius�;
String outroTexto = texto + �Ferneda�;
texto = outroTexto + �Ferneda�;
System.out.println(outroTexto);
Console: ViniciusFernedaFerneda
 */
package exercicio.numero23.itema;

public class Classe {
public static void main(String[] args) {
	
	String texto = "Vin�cius";
	String outroTexto = texto + "Ferneda";
	texto = outroTexto + "Ferneda";
	System.out.println(outroTexto);
}
}
//Foi impresso o outroTexto, para chegar ao resultado desejado seria necess�rio imprimir o texto.