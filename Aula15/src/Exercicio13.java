import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero de 1 a 7 e o programa se dir� qual dia da semana ele corresponde. ");
		
		int num = scan.nextInt();
		
		
		
		switch (num){
		case 1: System.out.println(" domingo ");break;
		case 2: System.out.println(" segunda-feira ");break;
		case 3: System.out.println(" ter�a-feira ");break;
		case 4: System.out.println("quarta-feira ");break;
		case 5: System.out.println("quinta-feira ");break;
		case 6: System.out.println("sexta-feira ");break;
		case 7: System.out.println("s�bado");break;
		default: System.out.println(" Voc� digitou um n�mero fora do range tente novamente "); 
		
		
			
		
		}
		
		
		

	}

}
