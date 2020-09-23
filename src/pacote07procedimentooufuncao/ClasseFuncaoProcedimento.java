/**
 * 
 */
package pacote07procedimentooufuncao;

/**
 * @author wesley
 */

/*
 * PROCEDIMENTO não tem retorno. 
 * FUNÇÃO tem retorno.
 * 
 * STATIC : Não precisa criar um objeto para usar em outra classe. PUBLIC /
 * PRIVATE / PROTECT :
 */
public class ClasseFuncaoProcedimento {

	/**
	 * PROCEDIMENTO 1 Método "static" tem que chamar um método "static" STATIC:
	 * funcional apenas na classe, não é instanciado. PRIVATE / PUBLIC :
	 */
	private static void soma(int numero1, int numero2) {
		// TODO Auto-generated method stub
		System.out.println("Inicio do procedimento sem retorno.");
		int soma = numero1 + numero2;
		System.out.println("Resultado da Soma = " + soma);
		System.out.println("Fim do procedimento sem retorno.");
		System.out.println("----------------");
	}

	/**
	 * PROCEDIMENTO 2 Procedimentos vazio chamado de "void" são métodos que pode ser
	 * usados. Ex: Método main é um procedimento/rotina que não retorna valores e
	 * recebe um argumento "args[]" do tipo vetor de Strings.
	 * 
	 * 
	 * O Metodo main é estático e serve apenas para classe e não para instancia
	 * Não pode chamar procedimento ou função sem o mesmo não ser estático.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Chamando o método soma com os parâmetros do método chamado.
		 */
		System.out.println("Inicio Método main.");
		System.out.println("----------------");
		soma(100, 11);
		subtração(999, 111);
		System.out.println("Fim Método main.");
		System.out.println("----------------");
	}

	/**
	 * PROCEDIMENTO 3 FUNÇÃO : Método criado que retorna um valor.
	 */
	static int subtração(int numero1, int numero2) {
		// TODO Auto-generated method stub
		System.out.println("Inicio da função com retorno.");
		int subtracao = numero1 - numero2;
		System.out.println("Resultado da Subtração = " + subtracao);
		System.out.println("Fim da função com retorno.");
		System.out.println("----------------");
		return subtracao;
	}
}