import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		/* esse programa l� 2 n�meros e em seguida pergunta ao usu�rio qual opera��o ele deseja realizar. Esse
		 * programa ainda classifica se o resultado � par ou �mpar.
		 
*/
		int num1, num2, resultado = 0;
		int opcao = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		num1 = scan.nextInt();
		
		System.out.println("Digite outro n�mero inteiro: ");
		num2 = scan.nextInt();
		
		System.out.println("Digite 1 para soma; 2 para subtra��o; 3 para multiplica��o; 4 para divis�o:");
		
		opcao = scan.nextInt();
		
		if (opcao == 1) {
		resultado = num1 + num2;
		System.out.println("O resultado �: "+ resultado);
			
		}
		if (opcao == 2) {
			resultado = num1 - num2;
			System.out.println("O resultado �: "+ resultado);
		}
		else if (opcao ==3) {
			resultado = num1 * num2;
			System.out.println("O resultado �: "+ resultado);
		}
		else {
			
		}
		if (opcao == 4) {
			resultado = num1 /num2;
			System.out.println("O resultado �: "+ resultado);
		}
		if (resultado % 2 == 0 ) {
			System.out.println("Esse resultado � par ");
			
		} 
		else {
			System.out.println("Esse resultado � �mpar");
		}
		
		if (resultado < 0 ) {
			System.out.println("E tamb�m negativo");
		}
		else {
			System.out.println("E tamb�m positivo");
		}
		
		
		
	}

}
