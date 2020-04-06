import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// esse programa calcula a raiz quadrada de uma expressão de segundo grau.
		int a, b, c;
		double delta;
		double raiz = 0;
		double x = raiz;
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de a ");
		a = scan.nextInt();
		
		System.out.println("Digite o valor de b ");
		b = scan.nextInt();
		
		System.out.println("Digite o valor de c");
		c = scan.nextInt();
		
		delta = a * Math.pow(x, 2) + b*x + c;
			raiz = Math.sqrt(delta);
			
		
			if (a == 0) {
				System.out.println("A equação não é de segundo grau.");
			}
			if (delta < 0 ) {
				System.out.println("Essa equação não possui raízes reais ");
			}
			if (delta == 0) {
				System.out.println("Essa equação só possui uma raiz ");
			}
			else {
				
			} if (delta > 0) {
				System.out.println("Essa equação possui duas raízes");
			}

	}

}
