/*
 * Pe�a para o usu�rio digitar a idade e ano de nascimento. Pegue os valores que o
usu�rio digitou. Verifique se a idade digitada condiz com o ano de nascimento do
usu�rio, ou seja, se realmente ele tem a idade que disse ter. Caso sim imprima
�Voc� n�o mentiu para mim�, caso contr�rio, imprima �Voc� mentiu para mim, voc�
n�o � mais meu amigo�.
 */
package exercicio.numero5;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite sua idade");
		int idade = scanner.nextInt();
		
		System.out.println("Digite seu ano de nascimento");
		int ano = scanner.nextInt();
		
		if(2017 - idade == ano){
			System.out.println("Voc� n�o mentiu para mim");
		}else{
			System.out.println("Voc� mentiu para mim, voc� n�o � mais meu amigo");
			scanner.close();
		}
		scanner.close();
	}
	}


