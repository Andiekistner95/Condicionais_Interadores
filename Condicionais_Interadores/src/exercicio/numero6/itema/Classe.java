/*
 * Peça para o usuário digitar a cidade onde mora, armazene o valor em variável. Peça
para o usuário digitar o bairro onde mora, armazene o valor em variável. Com tais
informações efetue as seguintes condições:

a. Verifique se o usuário mora em “Blumenau” e no bairro “Velha”, caso sim,
imprima “Você se atrasará para o trabalho!”.
 */
package exercicio.numero6.itema;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Velha"))) {
			System.out.println("Você se atrasará para o trabalho!");
			scanner.close();
		}
	}
}
