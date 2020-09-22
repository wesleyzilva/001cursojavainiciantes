/**
 * 
 */
package pacote05loops;

import javax.sound.midi.Soundbank;

/**
 * @author wesley
 *
 */
public class SetimaClasseExercicios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c = 'c';
		int i = 10;
		double d = 10;
		long l = 1;
		String s = "Hello";
		
		//c =  c + i; //Não pode somar inteiro com caracter
		//s += i; // Para String pode somar ou concatenar
		//i += s; //Para inteoro não pode receber String
		//c += s; //String maior que caracter
		//i += l; //Inteiro pode receber um long	
		
		
		
		int j = 1;
		int a = 0;
		System.out.println("a= "+a);
		System.out.println("j= "+j);
		System.out.println("----");
		while (j<20) {
			System.out.println("Início While");
			++a;
			System.out.println("++a = "+a);
			j += 1;
			System.out.println("j+=1 = "+j);
			System.out.println("Incremento antes do if----");
			if (a<20) {
				++j;
				System.out.println("j = "+j);
				System.out.println("end if----");
			};
		}
		System.out.println("----");
		System.out.println("a= "+a);
		System.out.println("j= "+j);

	}

}