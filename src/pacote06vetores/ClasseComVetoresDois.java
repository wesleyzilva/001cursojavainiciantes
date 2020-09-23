/**
 * 
 */
package pacote06vetores;

import java.util.Calendar;

/**
 * @author wesley
 *
 */
public class ClasseComVetoresDois {

	/**
	 * @param args 
	 * Identifica se um ano é bissexto e 
	 * mostra que Fevereiro tem 29 dias.
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ex02------------");
		String mes[] = { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" };
		int tot[] = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31, 30 };

		Calendar calendar = Calendar.getInstance();
		int anoatual = calendar.get(calendar.YEAR);
//		int anoatual = 2020;
		
		if (((anoatual % 4) == 0) && ((anoatual % 100) != 0) || ((anoatual % 400) == 0)) {
			System.out.println(anoatual + " é um ano bissexto.");

			for (int i = 0; i < mes.length; i++) {
				System.out.println(mes[i] + " tem " + tot[i] + " dias.");
			} // final do for

		} // final do if
		else {
			System.out.println(anoatual + " não é um ano bissexto.");

			for (int j = 0; j < mes.length; j++) {
				tot[1] = 29;
				System.out.println(mes[j] + " tem " + tot[j] + " dias.");
			}
		}
		
	}// fim do metodo
}// fim classe
