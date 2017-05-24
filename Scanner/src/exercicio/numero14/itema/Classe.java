/*Pergunte para o usuário as seguintes questões, as responta e armazene em variáveis.
 * 
   i. Digite seu nome:
   ii. Digite seu ano de nascimento:
   iii. Digite seu telefone:
   iv. Digite a cidade de nascimento
 * 
 */
package exercicio.numero14.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome;
		int ano;
		String telefone;
		String cidade;
		
		System.out.println("Digite seu nome");
		nome = scanner.nextLine();
		
		System.out.println("Digite seu ano de nascimento");
		ano = scanner.nextInt();
		
		System.out.println("Digite seu telefone");
		telefone = scanner.next();
		
		System.out.println("Digite sua cidade de nascimento");
		cidade = scanner.nextLine();
		
		 scanner.close();
		
	}
}
