/*
 * Escreva um algoritmo que o usu�rio entre com o sal�rio da pessoa e imprima o
   sal�rio l�quido, segundo as informa��es abaixo, utilizando apenas um System.out.println:
a. Menor ou igual a R$ 600,00 � isento
b. Maior que R$ 600 e menor ou igual a R$ 1.200,00 o desconto � de 20%
c. Maior que R$ 1.200,00 e menor ou igual a R$ 2000,00 o desconto � 25%
d. Maior que R$ 2000,00 o desconto � 30%
   Sendo que o sal�rio l�quido � igual ao sal�rio bruto menos os descontos.
 */
package exercicio.numero13;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o sal�rio");
		int salario = scanner.nextInt();
		scanner.close();

		if (salario <= 600) {
			System.out.println("R$ " + salario);
		} else {
			if (salario > 600 && (salario <= 1200)) {
				System.out.println("R$ " + salario * 0.80);

			} else {
				if (salario > 1200 && (salario <= 2000)) {
					System.out.println("R$ " + salario * 0.75);

				} else {
					if (salario > 2000) {
						System.out.println("R$ " + salario * 0.70);
					}
				}
			}
		}
	}
}
