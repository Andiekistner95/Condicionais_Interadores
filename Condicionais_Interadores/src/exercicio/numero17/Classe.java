/*
 * Pergunte o nome da pessoa e a sua idade. Pergunte o nome de outra pessoa e sua
   idade. Pergunte o nome da terceira pessoa e sua idade. Imprima o nome e idade de
   pessoas mais velha, do meio e a mais nova, utilizando apenas um Sysout.
   Sendo considerado a idade uma variável int.
 */
package exercicio.numero17;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String nome1;
		int idade1;
		String nome2;
		int idade2;
		String nome3;
		int idade3;

		System.out.println("Qual o seu nome?");
		nome1 = scanner.nextLine();
		System.out.println("Qual a sua idade?");
		idade1 = scanner.nextInt();

		String velha = nome1;
		String meio = nome1;
		String nova = nome1;

		int idadevelha = idade1;
		int idademeio = idade1;
		int idadenova = idade1;

		System.out.println("Qual o seu nome?");
		nome2 = scanner.next();
		System.out.println("Qual a sua idade?");
		idade2 = scanner.nextInt();

		if (idade2 > idade1) {
			velha = nome2;
			idadevelha = idade2;
		} else if (idade2 < idade1) {
			meio = nome2;
			idademeio = idade2;
		}
		System.out.println("Qual o seu nome?");
		nome3 = scanner.next();
		System.out.println("Qual a sua idade?");
		idade3 = scanner.nextInt();
		scanner.close();

		if (idade3 > idadevelha) {
			idadenova = idademeio;
			nova = meio;
			idademeio = idadevelha;
			meio = velha;
			idadevelha = idade3;
			velha = nome3;
		}else if(idade3 > idademeio){
			idadenova = idademeio;
			nova = meio;
			idademeio = idade3;
			meio = nome3;
		}else if(idade3 < idademeio){
			idadenova = idade3;
			nova = nome3;
		}
		System.out.println(velha + idadevelha + "\r\n" + meio + idademeio + "\r\n" + nova + idadenova);
	}
}
