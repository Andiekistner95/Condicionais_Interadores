/*
 *   10. Pe�a para o usu�rio digitar dois n�meros double. E efetue as seguintes valida��es:
a. Se a soma dos n�meros for maior que 20, imprima no console �<resultado da
   soma> � maior que 20�
b. Se a soma dos n�meros for maior que 30, imprima no console �<resultado da
   soma> � maior que 30�
c. Se a soma dos n�meros for maior que 10 ou maior que 20, imprima no
   console �<resultado da soma> � maior que 10 ou <resultado da soma> maior que 20 �
d. Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, imprima no console
   �<resultado da soma> � m�ltiplo de 5 e <resultado da soma> de 10�
e. Se a soma dos n�mero � m�ltiplo de 5 e m�ltiplo de 10, ou o primeiro
   n�mero digitado � 5, imprima no console �<resultado da soma> � m�ltiplo de
   5 e <resultado da soma> de 10 ou o <primeiro n�mero digitado> � 5�
 */
package exercicio.numero10;

import java.util.Scanner;

public class Classe {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero double");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite outro n�mero double");
		double n2 = scanner.nextDouble();
		scanner.close();

		if ((n1 + n2) > 20) {
			System.out.println(n1 + n2 + " � maior que 20");
			
		} else if ((n1 + n2) > 30) {
			System.out.println(n1 + n2 + " � maior que 30");
			
		} else if ((n1 + n2) > 10 || ((n1 + n2) > 20)) {
			System.out.println(n1 + n2 + " � maior que 10 ou " + n1 + n2 + " � maior que 20");
			
		} else if ((n1 + n2) % 5 == 0 && (n1 + n2) % 10 == 0) {
			System.out.println(n1 + n2 + " � multiplo de 5 e " + n1 + n2 + " � multiplo de 10");
			
		} else if ((n1 + n2) % 5 == 0 && (n1 + n2) % 10 == 0 || n1 == 5) {
			System.out.println(n1 + n2 + " � multiplo de 5 e " + n1 + n2 + " � multiplo de 10 ou o " + n1 + " � 5.");

		}
	}
}
