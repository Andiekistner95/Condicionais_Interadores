/*
 * Peça para o usuário digitar dois números, pegue os dois números que o usuário
digitou. Multiplique os dois números. Se o resultado da multiplicação for múltiplo de 5
imprima “o resultado é múltiplo de 5”, caso contrário, imprima “o resultado não foi o
esperado”. Após o teste da da condição do if, imprima o resultado da multiplicação.
 */
package exercicio.numero3;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int numero = scanner.nextInt();
		
		System.out.println("Digite outro número");
		int numero2 = scanner.nextInt();
		
		int multip = numero * numero2;
		
		if(multip % 5 == 0){
			System.out.println("O resultado é múltiplo de 5: " );
		}else{
			System.out.println("Resultado não foi o esperado");
			scanner.close();
		}
		System.out.println(multip);
		scanner.close();
	}
	}

