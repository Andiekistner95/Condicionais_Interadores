/*
 * c. Verifique se o usuário mora em “Blumenau” e no bairro “Garcia”, caso sim,
   imprima “Você tem que sair de madrugada para não pegar trânsito!”.
 */
package exercicio.numero6.itemc;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Garcia"))) {
			System.out.println("Você tem que sair de madrugada para não pegar trânsito!");
			scanner.close();
		}
	}
}

