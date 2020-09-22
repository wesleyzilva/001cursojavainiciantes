/**
 * 
 */
package pacote04chamadaentreclasses;

import java.util.Scanner;

/**
 * @author wesley
 *
 */
public class SextaClasseChamadaEntreMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Exercício de chamada entre método sextometodoprimeiro e sextometodosegundo e sextometodoterceiro
		 * Passando o seuNome á partir da entrada dos dados 
		 * via sextometodoprimeiro 
		 * para o sextometodoterceiro 
		 * usando o sextometodosegundo
		 */	
		String seuNome = "";
		Scanner tecladoInput = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		seuNome = tecladoInput.nextLine();

		/*
		 * O método á ser chamado deve estar dentro do metodomain
		 * o método chamado deve ser construido fora do metodomain, pois, é outro método.
		 */
		System.out.println("Monte seu código do começo e preste atenção na sequencia");
		System.out.println("1- Chamando o método com o parametro : 'sextometodoprimeiro (seuNome);'");		
		sextometodoprimeiro (seuNome);
		System.out.println("2.0- Metodo main aguardando retorno");		
		System.out.println("Fim da metodomain");
		}//FIM metodomain
	
	/* Métodos á serem utilizados pelo metodomain devem ficar fora do main.
	 * Método á ser usado como comunicador de métodos.
	 */
	private static void sextometodoprimeiro (String seuNome) {
		System.out.println("2.1- Já estamos dentro do método sextometodoprimeiro");
		System.out.println("2.2 -Chamando o método 'sextometodosegundo(seuNome);'");
		sextometodosegundo(seuNome);
		System.out.println("2.3- Metodo sextometodosegundo aguardando retorno");
		System.out.println("Fim do método sextometodoprimeiro");
	}

	public static void sextometodosegundo (String seuNome) {
		System.out.println("3.0- Já estamos dentro do método sextometodosegundo");
		System.out.println("3.1 - Chamando o método 'sextometodoterceiro(seuNome);'");
		sextometodoterceiro(seuNome);
		System.out.println("3.2- Metodo sextometodosegundo aguardando retorno");
		System.out.println("Fim do método sextometodosegundo");
	}

	/**
	 * @param seuNome
	 */
	private static void sextometodoterceiro(String seuNome) {
		// TODO Auto-generated method stub
		System.out.println("4.0- Já estamos dentro do método sextometodoterceiro");
		System.out.println(
				"4.1- Metodo sextometodoterceiro imprime variável "
				+ "vinda do método main no inicio do programa");
		System.out.println("       R: Usei 3 métodos para imprimir o seu nome: "+seuNome);
		System.out.println("Fim do método sextometodoterceiro");
		System.out.println("Observe que este é o único método que imprime esta observação");
	}
	
	}//FIM Classe