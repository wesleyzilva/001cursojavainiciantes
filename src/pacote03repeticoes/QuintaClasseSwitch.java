package pacote03repeticoes;

import java.util.Scanner;

public class QuintaClasseSwitch {

	public static void main (String[]args) {

/*
 * Usando Switch
 */	
	System.out.println("------------------------------------");
	System.out.println("ex4 : Uso do Switch para opções:");
	System.out.println("Quantas pernas você tem?");
	Scanner teclado = new Scanner(System.in);
	String qtdPernas = 	teclado .nextLine();
	String tipo = null;
	
	switch (qtdPernas) {
	case "1":
		tipo = "seu Saci !!!";
		break;
	case "2":
		tipo = "seu Bípede !!!";
		break;
	case "3":
		tipo = "seu Tripé !!!";
		break;
	case "4":
		tipo = "seu Quadrupede !!!";
		break;		
	case "8":
		tipo = "seu Aranha !!!";
		break;
	case "10":
		tipo = "seu Alien !!!";
		break;
	default:
		break;
	}
	System.out.println("Ixiii: "+tipo);
	
	}
	
}
