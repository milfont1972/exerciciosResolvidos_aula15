import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// esse programa diz se um ano � bissexto ou n�o.
		int ano;
		int biss1;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o ano e aguarde que o programa vai informar se ele � bissexto ou n�o ");
		ano = scan.nextInt();
	biss1 = ano % 4;
	
	
	
	
	if (biss1 == 0) {
		System.out.println(+ ano + " � um ano bissexto. " );		
		
	}
	

	else {
		System.out.println(" N�o � um ano bissexto ");
	}
		
		
		

	}

}
