/*
 * Pe�a para o usu�rio digitar dois n�meros, pegue os dois n�meros que o usu�rio
digitou. Multiplique os dois n�meros. Se o resultado da multiplica��o for m�ltiplo de 5
imprima �o resultado � m�ltiplo de 5�, caso contr�rio, imprima �o resultado n�o foi o
esperado�. Ap�s o teste da da condi��o do if, imprima o resultado da multiplica��o.
 */
package exercicio.numero3;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int numero = scanner.nextInt();
		
		System.out.println("Digite outro n�mero");
		int numero2 = scanner.nextInt();
		
		int multip = numero * numero2;
		
		if(multip % 5 == 0){
			System.out.println("O resultado � m�ltiplo de 5: " );
		}else{
			System.out.println("Resultado n�o foi o esperado");
			scanner.close();
		}
		System.out.println(multip);
		scanner.close();
	}
	}

