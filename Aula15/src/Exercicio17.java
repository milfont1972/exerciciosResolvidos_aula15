import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		// esse programa diz se um ano é bissexto ou não.
		int ano;
		int biss1;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o ano e aguarde que o programa vai informar se ele é bissexto ou não ");
		ano = scan.nextInt();
	biss1 = ano % 4;
	
	
	
	
	if (biss1 == 0) {
		System.out.println(+ ano + " é um ano bissexto. " );		
		
	}
	

	else {
		System.out.println(" Não é um ano bissexto ");
	}
		
		
		

	}

}
