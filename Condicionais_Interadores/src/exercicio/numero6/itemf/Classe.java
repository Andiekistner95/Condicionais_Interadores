/*
 * f. No final peça para o usuário responder a pergunta “Você concorda com o
   que eu disse?” utilizando System.out.println e pegue o que o usuário digitar
   com Scanner. Caso o usuário digitar true, imprima “Show de bola”, caso
   contrário “Ok, problema é nosso!”.
 */
package exercicio.numero6.itemf;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Você concorda com o que eu disse? (true ou false)");
		boolean concorda = scanner.nextBoolean();

		if (concorda == true) {
			System.out.println("Show de bola!");
		}else{
			System.out.println("Ok, problema é nosso!");
			scanner.close();
		}
	}
}