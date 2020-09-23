package pacote02condicionais;

import java.util.Scanner;

public class DoisCondicionalCompostaEncadeada {

	//Método principal
public static void main(String[]args) {
	
		System.out.println("Digite sua idade: ");
		Scanner teclado = new Scanner(System.in);
		int idadeInteiro = Integer.parseInt(teclado.nextLine());
		
		if (idadeInteiro<16) {
			System.out.println("Não vota");
		}
		else {
			if ((idadeInteiro>=16 && idadeInteiro<18)||(idadeInteiro>70))
			{
				System.out.println("Voto opcional");
			}else {
				System.out.println("Voto obrigatório");
			}
			
		}
		
	}
	
}