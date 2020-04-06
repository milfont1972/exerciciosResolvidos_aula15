import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/* Programa para calcular o valor de frutas. Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
		 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
		 * 
*/
		int opcao = 0;
		double morango = 0;
		double maca = 0;
		double misto = morango + maca;
		float compra1 = 0;
		float compra2 = 0;
		float totaldacompra;
		double superdesconto;
		float compradescontao;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Seja bem vindo(a) a fruteria do Manoel, aproveite nossa promoção especial "
				+ "na venda de morangos e maçãs.");
		
		System.out.print("Digite 1 para morangos, 2 para maçãs ou 3 para comprar ambos: ");
		// laço do menu escolha
		
		switch (opcao) {
		case 1: System.out.println("Você escolheu morango ");
		case 2: System.out.println("Você escolheu maçãs");
		case 3: System.out.println("Você escolheu ambos");break;
		default: 
		}
		opcao = scan.nextInt();
		if (opcao == 1) {
			System.out.print("Digite o peso a ser comprado:  ");	
			morango = scan.nextDouble();

		}		
		if (opcao == 2) {
			System.out.print("Digite o preso a ser comprado: ");
			maca = scan.nextDouble();
		}
		if (opcao == 3) {
			System.out.print("Você escolheu ambos! ");
			System.out.println("Digite primeiro o peso de morangos e depois de maçãs. ");
			morango = scan.nextDouble();
			maca = scan.nextDouble();

		}
		
		
		//laço da escolha 1 : morango
		if (opcao == 1  && morango > 5) {
			compra1 = (float) (morango * 2.20);
			System.out.print("Você digitou " + morango + " de morango ");
			
		}
		if (opcao == 1  && morango  <= 5) {
			compra1 = (float) (morango * 2.50);
			System.out.println("Você digitou " + morango + " de morango ");
			
		}
		//laço da escolha 2 : maçã
		if (opcao == 2  && maca > 5) {
			compra2 = (float) (maca * 1.50);
			System.out.print("Você digitou " + maca + " de maçã " );
		}
		 if (opcao == 2  && maca  <= 5) {
			compra2 = (float) (maca * 1.80);
			System.out.print("Você digitou " + maca + " de maçã");			
		}
		 //laço da escolha 3 : ambos
		 if (opcao == 3) {
			 
			 System.out.println("Você digitou: " + morango + " de morango " + maca + " de maçã ");
		 }
		 if (morango > 5) {
		    compra1 = (float) (morango * 2.20);
		    System.out.println(" Subvalor morangos " + compra1);
				
		 }
		 if (morango  <= 5) {
				compra1 = (float) (morango * 2.50);
			System.out.println(" Subvalor morangos " + compra1);
		 }
		 if (maca > 5) {
			 compra2 = (float) (maca * 1.50);
			 System.out.println(" Subvalor maçãs " + compra2);
		 }
		 else {
		 }
		 if (maca <= 5) {		 
			 compra2 = (float) (maca * 1.80);
			 System.out.println(" Subvalor maçãs " + compra2);
		 }
		 totaldacompra = compra1 + compra2;
		 System.out.println("Total da compra " + totaldacompra);
		 
		 if ( morango > 8 || maca > 8 || misto > 8  || totaldacompra > 25) {
			 superdesconto = totaldacompra * 0.10;
			 compradescontao = (float) (totaldacompra - superdesconto);
			 System.out.println("A sua compra com o descontão de mais 10% é igual a " + compradescontao);
		 }		
		
	}

}
