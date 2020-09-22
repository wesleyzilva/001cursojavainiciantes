/**
 * 
 */
package pacote07procedimentooufuncao;

import java.util.Scanner;

/**
 * @author wesley
 *
 */
public class ClassseFuncaoProcedimentoMelhorado {

	/**
	 * @param numero2
	 * @param numero1
	 * @return FUNÇÃO "int" somaNumeros não pode ser "void", pois, retorna um valor.
	 */
	public static int somaNumeros(int numero1, int numero2) {
		// TODO Auto-generated method stub
		int soma = numero1 + numero2;
		return soma;
	}

	/**
	 * @param numero2
	 * @param numero1 PROCEDIMENTO
	 */
	public static void subtracaoNumeros(int numero2, int numero1) {
// TODO Auto-generated method stub
		int resultadoSubtracao = numero1 - numero2;
		System.out.println("Resultado da subtração é = " + resultadoSubtracao);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int escolha;
		do {
			System.out.println("------MENU------ 0 para sair.");
			System.out.println("Escolha uma opção para realizar a operação:");
			System.out.println("1- Soma");
			System.out.println("2- Subtração");
			System.out.println("3- Contador");
			System.out.println("------");
			escolha = teclado.nextInt();
			switch (escolha) {
			case 1: // chama a função de soma
				System.out.println("Opção 1 : Soma com retorno de função:");
				int resultadoSoma = somaNumeros(100, 36);
				System.out.println("Resultado da soma é = " + resultadoSoma);
				System.out.println("------");
				break;
			case 2: // chama o procedimento de subtração
				System.out.println("Opção 2 : Subtração com retorno de procedimento:");
				subtracaoNumeros(321, 555);
				System.out.println("------");
				break;
			case 3:// chama o método contador em arquivo externo.
				System.out.println("Opção 3 : Contador");
				System.out.println("Numero final: " + ClasseFuncaoProcedimentoExterno.contador(10, 99));
				System.out.println("------");
				break;
			default:
				break;
			}

		} while (escolha != 0);

	}

}
