import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/* esse programa lê 2 números e em seguida pergunta ao usuário qual operação ele deseja realizar. Esse
		 * programa ainda classifica se o resultado é par ou ímpar.
		 
*/
		int num1, num2, resultado = 0;
		int opcao = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite outro número inteiro: ");
		num2 = scan.nextInt();
		
		System.out.println("Digite 1 para soma; 2 para subtração; 3 para multiplicação; 4 para divisão:");
		
		opcao = scan.nextInt();
		
		if (opcao == 1) {
		resultado = num1 + num2;
		System.out.println("O resultado é: "+ resultado);
			
		}
		if (opcao == 2) {
			resultado = num1 - num2;
			System.out.println("O resultado é: "+ resultado);
		}
		else if (opcao ==3) {
			resultado = num1 * num2;
			System.out.println("O resultado é: "+ resultado);
		}
		else {
			
		}
		if (opcao == 4) {
			resultado = num1 /num2;
			System.out.println("O resultado é: "+ resultado);
		}
		if (resultado % 2 == 0 ) {
			System.out.println("Esse resultado é par ");
			
		} 
		else {
			System.out.println("Esse resultado é ímpar");
		}
		
		if (resultado < 0 ) {
			System.out.println("E também negativo");
		}
		else {
			System.out.println("E também positivo");
		}
		
		
		
	}

}
