/**
 * 
 */
package pacote06vetores;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author wesley
 *
 */
public class ExercicioVetores {

	/*
	 * Programa que recebe valores do usuário, 1 Valor do tamanho do vetor. 2 Valor
	 * da posiçao onde será inserido um dado 3 Valor á ser inserido na posição
	 * informada 4 Imprimir o vetor com o valor inserido na posição informada 5
	 * Inserir todos os valores e mostrar o vetor completo.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite o TAMANHO do vetorBase que deseja criar.");
		// Inicia o método que vai buscar as informações imputadas no System.in
		Scanner teclado = new Scanner(System.in);
		// Criando vetor com parametro recebido.
		int vetorBase[] = new int[teclado.nextInt()];
		// Iniciando vetor com valores zarados
		Arrays.fill(vetorBase, 0);
		System.out.println("O vetorBase tem TAMANHO = " + vetorBase.length);
		// Mostrando os valores do vetor criado
		for (int i : vetorBase) {
			System.out.printf(" " + vetorBase[i]);
		}
		int escolha;
		do {
			System.out.println("");
			System.out.println("Escolha uma opção abaixo : ");
			System.out.println("1 - Inserir valor em uma posição.");
			System.out.println("2 - Ordenar valores do vetor.");
			System.out.println("3 - Voltar ao Menu.");
			System.out.println("4 - Buscar um valor na posição");
			System.out.println("0 - Sair do programa.");
			escolha = teclado.nextInt();
			int j = 0;
			switch (escolha) {
			case 1:
				while (j != vetorBase.length + 1) {
					System.out.println("+++++++++inicioCase1");
					System.out.println("Digite a POSIÇÃO que deseja inserir um VALOR.");
					int posicaoValor;
					if ((posicaoValor = teclado.nextInt()) > vetorBase.length) {
						System.out.println("Digite uma posição até o tamanho de: " + vetorBase.length);
						System.out.println("++++++++fimCase1");
						break;
					}

					System.out.println("Digite o VALOR que deseja inserir na POSIÇÃO.");
					int valorInserido = teclado.nextInt();

					System.out.println("Será inserido no vetorBase de TAMANHO = " + vetorBase.length + ", na POSIÇÃO = "
							+ posicaoValor + ", o VALOR = " + valorInserido);
					vetorBase[posicaoValor] = valorInserido; // Vetor Base na posicaoValor recebe o valorInserido.

					// Imprimir o vetor criado para mostrar a posição que foi inserido o valor na
					// posição correta.
					System.out.println(Arrays.toString(vetorBase));
					j++;
					if (j == vetorBase.length) {
						System.out.println("Vetor preenchido, volte ao Menu e selecione outra opção.");
						System.out.println("+++++++++fimCase1");
						break;
					}
				}
				break;
			case 2:
				System.out.println("+++++++++inicioCase2");
				System.out.println("Vetor inserido na opção 1 ordenado por valores crescentes:");
				Arrays.sort(vetorBase);
				System.out.println(Arrays.toString(vetorBase));
				System.out.println("++++++++fimCase2");
				break;
			case 4:
				System.out.println("+++++++++inicioCase4");
				System.out.println("Digite a posição que deseja ver o valor:");
				int informaValor = teclado.nextInt();
				System.out.println("Valor na posição selecionada: "+Arrays.binarySearch(vetorBase, informaValor));
				System.out.println("++++++++fimCase4");
			default:
				System.out.println("Saiu do programa.");
			}
		} while (escolha != 0);
		System.out.println("Escolha foi = " + escolha + "fim do DO");
		/*
		 * Arrays.sort(vetorBase); Ordenação do vetor int mostrarPosicao =
		 * Arrays.binarySearch(num,1); Buscar valor
		 */

	}// main
}
// class
