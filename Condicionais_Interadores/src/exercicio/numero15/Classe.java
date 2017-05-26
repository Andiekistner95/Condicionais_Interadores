/*
 * Pergunte para o usuário um dia do mês e número do mês. Faça um algoritmo que
   valide se o dia e o mês existem no calendário, utilizando apenas um Sysout.
   Sendo considerado duas variáveis int um para dia e outra para mês.
 */
package exercicio.numero15;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int qntdias;
		System.out.println("Diga um dia do mês");
		int dia = scanner.nextInt();
		System.out.println("Diga o número do mês");
		int mes = scanner.nextInt();
		scanner.close();

		if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {

			qntdias = 31;

		} else if (mes == 2) {
			qntdias = 28;

		} else {
			qntdias = 30;
		}
		if ((dia <= qntdias) && (mes <= 12) && (mes >= 1)) {
			System.out.println("Data válida: " + dia);
			System.out.println("Mês válido: " + mes);

		}
	}
}
