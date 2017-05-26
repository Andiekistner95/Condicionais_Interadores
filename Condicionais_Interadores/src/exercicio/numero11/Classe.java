/*
 * Escreve um algoritmo que o usuário entre com três números e imprima o maior
   número entre eles, utilizando apenas um System.out.println.
 */
package exercicio.numero11;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número");
		int n1 = scanner.nextInt();
		int maior = n1;
		System.out.println("Digite um número");
		int n2 = scanner.nextInt();
		if (n2 > maior) {
			maior = n2;
		}
		System.out.println("Digite um número");
		int n3 = scanner.nextInt();
		if (n3 > maior) {
			maior = n3;
		}
		System.out.println("O maior número é: " +maior);
	scanner.close();
	}
}
