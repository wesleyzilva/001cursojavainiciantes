/**
 * 
 */
package pacote03repeticoes;

import java.util.Scanner;

/**
 * @author wesley
 *
 */
public class QuintoLoopDoWhile {

	/**
	 * @param args
	 * O método main é o primeiro a ser chamado e executado pela JVM
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		do {
			System.out.println("Digite um número: ");
			int numero = teclado.nextInt();
			contador += numero;
			System.out.println("Quer continuar? [S/N] ");
			
			contador++;
		} while (contador<=1984);
	}

}