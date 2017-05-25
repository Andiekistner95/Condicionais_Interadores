/*
 * 7. Calculadora
a. Pe�a para o usu�rio digitar um n�mero, e armazene o n�mero.
b. Pe�a para o usu�rio digitar um operador matem�tico (+, -, /, x), e armazene o operador.
c. Pe�a para o usu�rio digitar outro n�mero, e armazene o n�mero.
d. Caso o usu�rio digitou o operador +, some os dois n�meros e imprima o
resultado �Valor da soma: <resultado>�.
e. Caso o usu�rio digitou o operador -, subtraia os dois n�meros e imprima o
resultado �Valor da subtra��o: <resultado>�.
f. Caso o usu�rio digitou o operador /, divida os dois n�meros e imprima o
resultado �Valor da divis�o: <resultado>�.
g. Caso o usu�rio digitou o operador *, multiplique os dois n�meros e imprima o
resultado �Valor da multiplica��o: <resultado>�.
 */
package exercicio.numero7;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero");
		int n1 = scanner.nextInt();
		System.out.println("Digite um operador matem�tico (+, -, /, *)");
		String operador = scanner.next();
		System.out.println("Digite outro n�mero");
		int n2 = scanner.nextInt();
		scanner.close();

		switch (operador) {
		case "+":
			System.out.println("Valor da soma: " + (n1 + n2));
			break;
		case "-":
			System.out.println("Valor da subtra��o: " + (n1 - n2));
			break;
		case "/":
			System.out.println("Valor da divis�o: " + (n1 / n2));
			break;
		case "*":
			System.out.println("Valor da multiplica��o: " + (n1 * n2));
			break;
		}
	}
}