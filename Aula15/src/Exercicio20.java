import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		int total = 0 ,resp1 = 0, resp2 = 0, resp3 = 0, resp4 = 0,resp5 = 0; 
		
		
		
		/* Esse programa faz perguntas e classifica a pessoa a respeito de um crime
		 * */ 
		Scanner scan = new Scanner(System.in);
		System.out.println("O senhor João da Silva foi assassinado, responda às perguntas:  Digite 0 para NÃO ou 1 para SIM ");
		
		System.out.println("Telefonou para a vítima?" );
		resp1 = scan.nextInt();
		
		System.out.println("Esteve no local do crime?");
		resp2 = scan.nextInt();
		
		System.out.println("Mora perto da vítima?" );
		resp3 = scan.nextInt();
		
		System.out.println("Devia para a vítima?" );
		resp4 = scan.nextInt();
		
		System.out.println("Já trabalhou com a vítima?" );
		resp5 = scan.nextInt();
		
		
		total = resp1 + resp2 + resp3 + resp4 + resp5;
		
		if (total == 2 ) {
			System.out.println(" SUSPEITA ");
		}
		else if (total == 3 || total == 4) {
			System.out.println(" CUMPLICE ");
		}
		else if (total == 5) {
			System.out.println(" ASSASSINO ");
			
			}
		
		else {
			System.out.println("INOCENTE");
		}
		
		
		

	}

}
