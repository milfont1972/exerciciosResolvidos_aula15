import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		// esse programa pede um n�mero inteiro e informa se ele � par ou �mpar
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro e aguarde que o programa vai informar se ele � par ou �mpar");
		int num = scan.nextInt();
		
		
		
		if (num % 2 == 0) {
			System.out.println(+ num + " � um n�mero par ");
		}
		else {
			System.out.println(+ num + " N�o um n�mero par ");
		}
		
		

	}

}
