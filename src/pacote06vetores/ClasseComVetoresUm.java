/**
 * 
 */
package pacote06vetores;

import java.util.Arrays;

/**
 * @author wesley
 *
 */
public class ClasseComVetoresUm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Criar objetos basta digitar new e Ctrl+Space Definir Tipo, Nome e Tamanho.
		 * 
		 * O vetor é um objeto, possui caracteristicas/atributo: coisas que o objeto tem
		 * e métodos(): coisas que o objeto faz
		 * 
		 * Indices são as posições dentro do vetor, que começa sempre com índice 0.
		 */
		System.out.println("ex01------------");
		int n1[] = new int[4]; // Para criação de um objeto vetor com tamanho específico.
		int n2[] = { 1, 12, 8, 18, 24, 4 }; // Caso você saiba o valor á ser inserido, você pode inseri-los
											// imediatamente.
		System.out.println("Tamanho do vetor: " + n2.length);

		System.out.println("Usando laço For:");
		// FOR simples para impressão dos valores dentro da posição do vetor.
		for (int c = 0; c <= (n2.length - 1); c++) {
			System.out.println("Na posição " + c + " temos o valor: " + n2[c]);
		} // Fim for
		System.out.println("Fim do laço For simples.");
		System.out.println("----------------");

		/*
		 * FOR each : Para cara elemento de vetor n2 coloque o inteiroDentroDoVetor
		 * 
		 */
		System.out.println("ex02------------");
		System.out.println("'Para' específico para vetores.");

		System.out.println("Ordenação original:");
		for (int inteiroDentroDoVetor : n2) {
			System.out.println("" + inteiroDentroDoVetor);
		}

		System.out.println("Ordenação com sort:");
		for (int inteiroDentroDoVetor : n2) {
			Arrays.sort(n2);
			System.out.println("" + inteiroDentroDoVetor);
		}
		System.out.println("Fim do laço For each.");
		System.out.println("----------------");

		System.out.println("ex03------------");
		System.out.println("Busca dentro do vetor:");
		for (int inteiroDentroDoVetor : n2) {
			System.out.println("Vetor n2: " + inteiroDentroDoVetor);
		}
		/*
		 * Não existe índices negativos, portanto, caso procure um valor que não existe
		 * o retorno será negativo.
		 */
		int posicao = Arrays.binarySearch(n2, 24);
		System.out.println("A busca do número 24 retornou na posição: " + posicao);
		System.out.println("----------------");

		/*
		 * Preenchendo um vetor com valores pré definidos.
		 */
		System.out.println("ex04------------");
		System.out.println("Criação de vetor com valores prédefinidos.");
		int x[] = new int[200]; // Criação de vetor
		Arrays.fill(x, 0); // Preenchimento de vetor
		for (int valor : x) {
			System.out.printf(" " + valor);
		}
		System.out.println("----------------");
		/*
		 * Vetor dentro de vetor com teste de mesa
		 */
		System.out.println("ex05------------");
		System.out.println("Vetor dentro de vetor." + " Qual valor será impresso?");

		int vetor[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int vetorOriginal[] = vetor;
		System.out.println("Vetor original: ");
		for (int i : vetor) {
			System.out.printf(" " + i);
		}
		System.out.println("");
		System.out.println("vetor[2] = " + vetor[2]);
		System.out.println("vetor[8] = " + vetor[8]);

		/*
		 * Vetor na posição 2 = 2 Vetor na posição 4 = 4 Vetor na posição vetor[2] vai
		 * receber o valor da posição 4
		 * 
		 */
		vetor[(vetor[2])] = vetor[(vetor[8])];

		System.out.println("vetor[(vetor[2])] = " + vetor[(vetor[2])]);
		System.out.println("vetor[(vetor[8])] = " + vetor[(vetor[8])]);
		System.out.println("Vetor na posição vetor[2] vai receber o valor na posição de vetor[8]:");
		System.out.printf(" " + vetorOriginal); //USAR O FOR PARA IMPRIMIR O VETOR ORIGINAL
		System.out.println("");
		//Vetor original
		for (int i : vetorOriginal) {
			System.out.printf(" "+i);
		}
		System.out.println("");
		// Para cada i dentro do vetor imprima i
		//Vetor alterado
		for (int i : vetor) {
			System.out.printf(" " + i);
		}
		System.out.println("");
		System.out.println("----------------");
		/*
		 * 
		 */
		System.out.println("ex06------------");
		System.out.println("Vetor para impressão de valores");

		String stringNome = "WESLEYGOMESDASILVA";
		String stringNomeOriginal = "WESLEYGOMESDASILVA";
		char vetorNome[] = new char[18];
		System.out.println("String Original: ");
		System.out.println(stringNomeOriginal);
		System.out.println("String tratada: ");
		for (int c = stringNome.length() - 1; c >= 0; c--) {
			vetorNome[c] = stringNome.charAt(c);
			System.out.printf("" + vetorNome[c]);
		}
		// Imprimir da primeira até a última posição.
		/*
		 * for (char 1 : vetorNome ) { System.out.println(1); }
		 */

	}// Fim main

}
