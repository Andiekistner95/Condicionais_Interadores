/*
 * e. Verifique se o usuário mora em “Blumenau” e no bairro “Bela vista”, caso sim,
   imprima “Pegue carona com quem vêem de Gaspar, economiza gasolina!”.
 */
package exercicio.numero6.iteme;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a cidade onde mora");
		String cidade = scanner.nextLine();

		System.out.println("Digite o bairro onde mora");
		String bairro = scanner.nextLine();

		if ((cidade.equals("Blumenau")) && (bairro.equals("Bela Vista"))) {
			System.out.println("Pegue carona com quem vem de Gaspar, economiza gasolina!");
			scanner.close();
		}
	}
}