import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/* esse programa recebe as medidas e informa se as mesmas podem formar um triângulo e que tipo
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a medida do primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Digite a medida do segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Digite a medida do terceiro lado: ");
		double lado3 = scan.nextDouble();
		
		if ( lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1 + lado2 ) {
			System.out.println(" Os valores podem formar um triângulo ");
			
		}
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println(" Com esses valores é um triângulo Equilátero ");
			
		}
		if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ) {
			System.out.println(" Com esses valores é um triângulo Isósceles ");
		}
		if (lado1 != lado2 && lado2 != lado3 ) {
			System.out.println(" Com esses valores é um triângulo Escaleno ");
		}
		else {
		System.out.println(" Não forma um triângulo ");	
		}
		
		
	}

}
