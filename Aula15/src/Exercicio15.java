import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		/* esse programa recebe as medidas e informa se as mesmas podem formar um tri�ngulo e que tipo
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite a medida do primeiro lado: ");
		double lado1 = scan.nextDouble();
		System.out.println("Digite a medida do segundo lado: ");
		double lado2 = scan.nextDouble();
		System.out.println("Digite a medida do terceiro lado: ");
		double lado3 = scan.nextDouble();
		
		if ( lado1 < lado2 + lado3 || lado2 < lado1 + lado3 || lado3 < lado1 + lado2 ) {
			System.out.println(" Os valores podem formar um tri�ngulo ");
			
		}
		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println(" Com esses valores � um tri�ngulo Equil�tero ");
			
		}
		if (lado1 == lado2 || lado2 == lado3 || lado3 == lado1 ) {
			System.out.println(" Com esses valores � um tri�ngulo Is�sceles ");
		}
		if (lado1 != lado2 && lado2 != lado3 ) {
			System.out.println(" Com esses valores � um tri�ngulo Escaleno ");
		}
		else {
		System.out.println(" N�o forma um tri�ngulo ");	
		}
		
		
	}

}
