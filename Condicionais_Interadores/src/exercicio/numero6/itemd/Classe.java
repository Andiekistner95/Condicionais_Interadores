/*
 * d. Verifique se o usuário mora em “Gaspar” e no bairro “Belchior”, caso sim,
   imprima “OK, você gosta de pegar trânsito!”.
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
			System.out.println("OK, você gosta de pegar trânsito!");
			scanner.close();
		}
	}
}
