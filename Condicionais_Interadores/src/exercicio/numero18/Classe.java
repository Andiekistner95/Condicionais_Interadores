/*
 * Pergunte o nome da pessoa, o dia e m�s e ano de anivers�rio. Pergunte para outra
   pessoa o nome, o dia, m�s e ano de anivers�rio. Agora verifique qual � a pessoa
   mais velha, e imprima o nome da mais velha e o nome da mais nova, utilizando
   apenas um Sysout. Sendo considerado o dia, m�s e ano, cada uma sendo uma vari�vel int.
 */
package exercicio.numero18;

import java.util.Scanner;

public class Classe {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	String nome1;
	int dia1;
	int mes1;
	int ano1;
	String nome2;
	int dia2;
	int mes2;
	int ano2;

	System.out.println("Qual o seu nome?");
	nome1 = scanner.nextLine();
	System.out.println("Qual o dia do seu anivers�rio?");
	dia1 = scanner.nextInt();
	System.out.println("Qual o m�s do seu anivers�rio?");
	mes1 = scanner.nextInt();
	System.out.println("Qual o ano do seu anivers�rio?");
	ano1 = scanner.nextInt();
	
	String maisvelha = nome1;
	String maisnova = nome1;
	
	
	
}
}
