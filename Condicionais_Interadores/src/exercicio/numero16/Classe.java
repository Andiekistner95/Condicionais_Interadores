/*
 * Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua idade. 
 * Imprima o nome da pessoa mais velha e a idade dela, e o nome da pessoa mais nova e a
 * idade dela, utilizando apenas um Sysout. Sendo considerado a idade uma variável int.
 */
package exercicio.numero16;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome1;
		int idade1;
		String nome2;
		int idade2;
		String maisvelha;
		String maisnova;

		System.out.println("Qual o seu nome?");
		nome1 = scanner.nextLine();
		System.out.println("Qual a sua idade?");
		idade1 = scanner.nextInt();
		System.out.println("Qual o seu nome?");
		nome2 = scanner.next();
		System.out.println("Qual a sua idade?");
		idade2 = scanner.nextInt();
		scanner.close();

		if (idade1 > idade2) {
			maisvelha = "Pessoa mais velha: " + nome1 + " Idade:" + idade1;
			maisnova = "Pessoa mais nova: " + nome2 + " Idade:" + idade2;
		} else{
			maisvelha = "Pessoa mais velha: " + nome2 + " Idade:" + idade2;
		maisnova = "Pessoa mais nova: " + nome1 + " Idade:" + idade1;
		}
		System.out.println(maisvelha + "\r\n" + maisnova);
	}

}
