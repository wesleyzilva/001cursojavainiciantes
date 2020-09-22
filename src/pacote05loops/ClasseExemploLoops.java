/**
 * 
 */
package pacote05loops;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author wesley
 *
 */
public class ClasseExemploLoops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInput = new Scanner(System.in);
		System.out.println("Digite valores para analisar o loop em 'do/while': ");
		int numerointeiro = 0;
		float somatoria = 0, somapares = 0, somaimpares = 0, maioresquecem = 0;
		int count = 0;
		float mediavalores = 0;
		
		do {
			count++;
			System.out.println("Digite um valor: ");
			System.out.println("Zero para sair.");
			numerointeiro = Integer.parseInt(tecladoInput.nextLine());
			System.out.println("Número: " + numerointeiro);
			somatoria += numerointeiro;
			System.out.println("Somatoria dos números: " + somatoria);
if (numerointeiro>100) {
	maioresquecem++;
}
if ((numerointeiro % 2) == 0) {
	somapares += numerointeiro;
} else {
	somaimpares += numerointeiro;
}
		} while (numerointeiro != 0);

		mediavalores = somatoria/count;
		System.out.println("Soma dos pares: " + somapares);
		System.out.println("Soma dos impares: " + somaimpares);
		System.out.println("Numeros maiores que 100: " + maioresquecem);
		System.out.println("Média dos valores: " + mediavalores);
		System.out.println("Saiu do loop while.");
	}//fim main

}


/*
 * Media = (x+y)/2
 */
