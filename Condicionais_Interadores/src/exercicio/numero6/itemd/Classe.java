/*
 * d. Verifique se o usu�rio mora em �Gaspar� e no bairro �Belchior�, caso sim,
   imprima �OK, voc� gosta de pegar tr�nsito!�.
 */
package exercicio.numero6.itemd;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Gaspar")) && (bairro.equals("Belchior"))) {
			System.out.println("OK, voc� gosta de pegar tr�nsito!");
			scanner.close();
		}
	}
}
