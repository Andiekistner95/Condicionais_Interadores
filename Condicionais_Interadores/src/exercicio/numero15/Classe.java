/*
 * Pergunte para o usu�rio um dia do m�s e n�mero do m�s. Fa�a um algoritmo que
   valide se o dia e o m�s existem no calend�rio, utilizando apenas um Sysout.
   Sendo considerado duas vari�veis int um para dia e outra para m�s.
 */
package exercicio.numero15;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Diga um dia do m�s");
		int dia = scanner.nextInt();
		System.out.println("Diga o n�mero do m�s");
		int mes = scanner.nextInt();
		scanner.close();

		if ((mes == 1) || (mes == 3) || (mes == 5) || (mes == 7) || (mes == 8) || (mes == 10) || (mes == 12)) {

			int qntdias = 31;

		} else {
			if (mes == 2) {
				int qntdias = 28;

			} else {
				int qntdias = 30;
			}

		}

	}

}
