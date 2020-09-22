package pacote02condicionais;

import java.util.Calendar;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class UmTerminalInteligente {

//Método principal chamador de outros métodos	
public static void main(String[]args) {
	
	System.out.println("Bem vindo ao terminal inteligente para praticar java !!!");
	System.out.println("Qual seu nome?");
	//Inicialização de input via teclado
	Scanner teclado = new Scanner(System.in);
	//Inicialização de Calendário
	Calendar calendar = Calendar.getInstance();
	
	String seuNome = teclado.nextLine();
	String log = calendar.getTime()+" Start log";
	
	System.out.printf("Olá %s!\nHoje é %s.\nEntão vamos começar.", seuNome, calendar.getTime());
	System.out.println("");
	System.out.println("Digite sua idade:");
	String idadeString = teclado.nextLine();
	int idadeInteiro = Integer.parseInt(idadeString);

	System.out.println("Digite o dia de nascimento:");
	String diaNascimento = teclado.nextLine();
	
	
	System.out.println("Digite o seu número da sorte:");
	String numeroSorteString = teclado.nextLine();
	int numeroSorteInteiro = Integer.parseInt(numeroSorteString);

	
	/*
	 * Calculadora para identificar o ano de nascimento.
	 * Identificar o ano atual
	 * Observe a conversão de String para Inteiro.
	 * 
	 */
	
	int anoAtual = calendar.get(calendar.YEAR);
	int anoNascimento = anoAtual - Integer.parseInt(idadeString);
	System.out.println("Você nasceu em: "+ anoNascimento);
	
	/*
	 * Operador Ternário para cálculo de voto
	 * 
	 * idade<=16
	 * &&
	 * idade<18
	 * ou então
	 * >70 
	 * o voto é facultativo
	 * 
	 */
	
	String operadorTernario = (Integer.parseInt(idadeString)>=16&&idadeInteiro<18)||(idadeInteiro>70)?"Facultativo":"Obrigatório";
	System.out.println("Seu voto é : " +operadorTernario);

	/*
	 * Usando funções matemáticas
	 * Blibliotecas que devem ser importadas.
	 */
	System.out.println("-----------------Exemplos-----------------");
System.out.println("ex1 : Funções matemáticas");
	Double randon = Integer.parseInt(idadeString)*Math.random();
	System.out.println("Exemplo de função matemática usando randon*idade:" +randon);
	
	
/*
 * Condicionais Simples e Compostas
 */	
	System.out.println("------------------------------------");
	System.out.println("ex2 : Usando if/else");
	float mediaAno = (anoNascimento+anoAtual)/2;
	if (mediaAno<2000) {
		System.out.println("mediaAno MENOR que 2000: "+mediaAno);
		System.out.println("fim if1");
		
		if (Integer.parseInt(diaNascimento)%2==0) {
			System.out.println("diaNascimento é PAR: "+diaNascimento);
			System.out.println("fim if2");}
			else {
				System.out.println("diaNascimento é PAR: "+diaNascimento);
				System.out.println("fim else2");				
			}	
	}
	else {
		System.out.println("mediaAno MAIOR que 2000: "+mediaAno);
		System.out.println("fim else1");
	}
	

/*
 * Condicionais Simples e Compostas
 */	
	System.out.println("------------------------------------");
	System.out.println("ex3 : Equação de segundo grau com seus dados:");
	System.out.println("A*x²+B*x+C=0");
	System.out.println(""
			+ "A = Dia de Nascimento = "+diaNascimento
			+ "B = Idade = "+Integer.toString(idadeInteiro)
			+ "C = Numero da sorte = "+numeroSorteInteiro);
	System.out.println("Lembrando das fórmulas: "
			+ "Delta = B² -(4*A*C)"
			+ " e "
			+ "x=(-B+-RaizDelta)/(2*A)");
	
	double delta = Math.pow(idadeInteiro,2)-(4*Integer.parseInt(diaNascimento)*numeroSorteInteiro);
	if (delta<0) {
		System.out.println("*** R: Se o delta for menor que zero, a equação não possuirá valores reais. delta= "+String.valueOf(delta));
		System.out.println("Lascou! não da para continuar.");
		System.out.println("Para duas raizes reais use número da sorte = 1");
	} else {
		System.out.println("*** R: delta maior que zero, portanto possui duas raízes reais.");
		System.out.println("delta= "+String.valueOf(delta));
		System.out.println("Raizes reais");
		System.out.println("x=(-B+-RaizDelta)/(2*A)");

		double x1 = ((-idadeInteiro+Math.sqrt(delta))/(2*Integer.parseInt(diaNascimento)));
		System.out.println("x1= "+x1);
		double x2 = ((-idadeInteiro-Math.sqrt(delta))/(2*Integer.parseInt(diaNascimento)));
		System.out.println("x2= "+x2);
	}//Fim ifelse


	/*
	 * Teste de chamada de entre métodos
	 * 1 Crio o chamador com o parametro/objeto
	 * 2 Crio o método passando o parametro/objeto
	 * 3 Uso dentro do método criado o objeto normalmente.
	 */
	System.out.println("-------------------------------------");
	System.out.println("Teste de chamada de 'Método 1' para 'Método 2' passando parâmetros.");
	System.out.println("testeChamadaMetodoOutraClasse (seuNome);");
	testeChamadaMetodoOutraClasse (seuNome);
	
}//Fim do método main

//Metodo 2 para ser usado
private static void testeChamadaMetodoOutraClasse(String seuNome) {
	// TODO Auto-generated method stub
	System.out.println("-------------------------------------");
	System.out.println("Retorno do método chamado com o parametro seuNome = " + seuNome );
}

}//Fim da classe