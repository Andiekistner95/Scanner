/*
 * boolean numero = true;
   String booleano = �false�;
   numero = false | true;
   booleano = �false | false�;
   numero = false | numero;
   System.out.println(booleano );
   System.out.println(numero );
Console:
false
true
 */
package exercicio.numero23.itemf;

public class Classe {
public static void main(String[] args) {
	boolean numero = true;
	   String booleano = "false";
	   numero = false | true;
	   booleano = "false | false";
	   numero = false | numero;
	   System.out.println(booleano );
	   System.out.println(numero );
}
}
//A vari�vel de nome booleano � uma string, ent�o foi impresso tudo que estava entre " ".