import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		double media;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		System.out.println(" Digite a segunda nota: ");
		double nota2 = scan.nextDouble();
		media = (nota1 + nota2)/2;
		
		System.out.println("Voc� digitou as notas: " + nota1 + " e " + nota2 + "." + " Sua m�dia � : " + media  );
		
		if (media >= 9.0 && media <= 10.0) {
			System.out.println("Seu conceito � A, logo voc� est� APROVADO ");
			
		} else if  (media >= 7.5 && media < 9.0) {
			System.out.println("Seu conceito � B, logo voc� est� APROVADO ");			
			
		}
		else if (media < 7.5 && media >= 6.0 ) {
			System.out.println("Seu conceito � C, logo voc� est� APROVADO ");
			
		}
		else if (media < 6.0 && media >= 4.0 ) {
			System.out.println("Seu conceito � D, logo voc� est� REPROVADO ");
			
		} else {
			
		}
		if (media < 4.0 && media >= 0.0) {
			System.out.println("Seu conceito � E, logo voc� est� REPROVADO");
		}
		
		
		
		
		

	}

}
