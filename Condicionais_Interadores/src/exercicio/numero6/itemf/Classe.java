/*
 * f. No final pe�a para o usu�rio responder a pergunta �Voc� concorda com o
   que eu disse?� utilizando System.out.println e pegue o que o usu�rio digitar
   com Scanner. Caso o usu�rio digitar true, imprima �Show de bola�, caso
   contr�rio �Ok, problema � nosso!�.
 */
package exercicio.numero6.itemf;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Voc� concorda com o que eu disse? (true ou false)");
		boolean concorda = scanner.nextBoolean();

		if (concorda == true) {
			System.out.println("Show de bola!");
		}else{
			System.out.println("Ok, problema � nosso!");
			scanner.close();
		}
	}
}