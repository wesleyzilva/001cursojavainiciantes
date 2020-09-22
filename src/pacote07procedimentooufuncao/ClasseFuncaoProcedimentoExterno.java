/**
 * 
 */
package pacote07procedimentooufuncao;

/**
 * @author wesley
 *
 */
public class ClasseFuncaoProcedimentoExterno {
	/**
	 * @param i
	 * @param f
	 * 
	 */
	public static String contador(int i, int f) {
		// TODO Auto-generated method stub
		String s = " ";
		for (int c = i; c <= f; c++) {
			s = c + " ";
			System.out.println(s);
		}
		return s;

	}

}
