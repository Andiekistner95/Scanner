/*
 * Imprima no console o seguinte texto concatenando as variáveis
Meu nome é <nome>, nasci no ano <ano de nascimento>, tenho <idade> anos. 
Se você quiser entrar em contato comigo, pode ligar para o telefone <telefone>. 
Há esqueci de te dizer aonde eu nasci, foi na cidade de <cidade de nascimento>.
 */
package exercicio.numero14.itemb;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	String nome;
	int ano;
	int idade;
	int telefone;
	String cidade;
	
	System.out.println("Digite seu nome");
	nome = scanner.nextLine();
	
	System.out.println("Digite seu ano de nascimento");
	ano = scanner.nextInt();
	
	System.out.println("Digite sua idade");
	idade = scanner.nextInt();
	
	System.out.println("Digite seu telefone");
	telefone = scanner.nextInt();
	
	System.out.println("Digite sua cidade de nascimento");
	cidade = scanner.next();
			
	scanner.close();
	
	System.out.println("Meu nome é " + nome  + ", nasci no ano " + ano + ", tenho " + idade + " anos.Se você quiser entrar em contato comigo, pode ligar para o telefone " + telefone + ". Ah, esqueci de te dizer aonde eu nasci, foi na cidade de " + cidade + ".");
}
}

