import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
		int total = 0 ,resp1 = 0, resp2 = 0, resp3 = 0, resp4 = 0,resp5 = 0; 
		
		
		
		/* Esse programa faz perguntas e classifica a pessoa a respeito de um crime
		 * */ 
		Scanner scan = new Scanner(System.in);
		System.out.println("O senhor Jo�o da Silva foi assassinado, responda �s perguntas:  Digite 0 para N�O ou 1 para SIM ");
		
		System.out.println("Telefonou para a v�tima?" );
		resp1 = scan.nextInt();
		
		System.out.println("Esteve no local do crime?");
		resp2 = scan.nextInt();
		
		System.out.println("Mora perto da v�tima?" );
		resp3 = scan.nextInt();
		
		System.out.println("Devia para a v�tima?" );
		resp4 = scan.nextInt();
		
		System.out.println("J� trabalhou com a v�tima?" );
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
