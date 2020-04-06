import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// esse programa pede um número inteiro e informa se ele é par ou ímpar
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro e aguarde que o programa vai informar se ele é par ou ímpar");
		int num = scan.nextInt();
		
		
		
		if (num % 2 == 0) {
			System.out.println(+ num + " é um número par ");
		}
		else {
			System.out.println(+ num + " Não um número par ");
		}
		
		

	}

}
