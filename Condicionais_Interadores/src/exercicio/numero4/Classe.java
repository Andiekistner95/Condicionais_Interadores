/*
 * Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio
digitou. Se o primeiro n�mero que o usu�rio digitar e o segundo n�mero que o
usu�rio digitou forem m�ltiplos de 7, imprima �os dois n�meros s�o m�ltiplos de 7�,
caso contr�rio imprima, �os dois n�meros n�o s�o m�ltiplos de 7�.
 */
package exercicio.numero4;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();
		
		System.out.println("Digite outro n�mero");
		int numero2 = scanner.nextInt();
		
		if((numero % 7 == 0) && (numero2 % 7 == 0)){
			System.out.println("Os dois n�meros s�o multiplos de 7: " + numero + " e " + numero2 );
		}else{
			System.out.println("Os dois n�meros n�o s�o multiplos de 7: " + numero + " e " + numero2);
			scanner.close();
		}
		scanner.close();
	}
	}


