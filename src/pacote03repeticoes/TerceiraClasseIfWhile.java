/**
 * 
 */
package pacote03repeticoes;

/**
 * @author wesley
 *
 */
public class TerceiraClasseIfWhile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador = 0;
		System.out.println("-----------------------------------------");
		//Repetidor com validação no inicio
		while (contador<1984) {
			//Oculta o valor que informar.
			if (contador==1983 || contador==1982 || contador==1981) {
				continue;
			}
			if (contador ==1979 ) {
				break;
			}
			System.out.println("Contador ano "+contador);
			contador++;
			}
}//Fim main
}//Fim classe
