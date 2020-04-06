import java.io.IOException;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		/* esse programa calcula o valor do desconto de abastecimento da gasolina e do álcool.
		*/
		int tipoDoComb;
		double precoLtGas = 2.50;
		double precoLtEta = 1.90;
		double descGas;
		double descGasTotal;
		double compraTotal;
		double descEtaTotal = 0;
		double descEta;
		double qtd;
		double compra;
		
		
		
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Digite 1 para gasolina e 2 para etanol: ");
			  tipoDoComb = scan.nextInt();
			  
			  if (tipoDoComb == 1) {
				  System.out.println(" Você escolheu gasolina: ");
			  } if (tipoDoComb == 2) {
				  System.out.println("Você escolheu álcool: ");
			  }
				  System.out.println("Digite a quantidade de combustível você vai comprar: ");
				  qtd = scan.nextDouble();
				  
				  if (tipoDoComb == 1 && qtd <= 20) {
					  compraTotal = qtd * precoLtGas;
					  descGas = precoLtGas * 0.04;
					  descGasTotal = descGas * qtd;
					  compra = (compraTotal - descGasTotal);
					  System.out.println("O valor da sua compra é R$:" + compra );
				  }
				   if (tipoDoComb == 1 && qtd > 20 ) {
					  compraTotal = qtd * precoLtGas;
					  descGas = precoLtGas * 0.06;
					  descGasTotal = descGas * qtd;
					  compra = (compraTotal - descGasTotal);
					  System.out.println("O valor da sua compra é R$:" + compra );
				  }
				   else if (tipoDoComb == 2 && qtd <= 20) {
					   compraTotal = qtd * precoLtEta;
					   descEta = precoLtEta * 0.03;
						  descEtaTotal = descEta * qtd;
						  compra = (compraTotal - descEtaTotal);
						  System.out.println("O valor da sua compra é R$:" + compra );

				   }
				   else {
					   
				   }
				   if (tipoDoComb == 2 && qtd > 20) {
					   compraTotal = qtd * precoLtEta;
					   descEta = precoLtEta * 0.05;
					   descEtaTotal = descEta * qtd;
						  compra = (compraTotal - descEtaTotal);
						  System.out.println("O valor da sua compra é R$:" + compra );
				   }
					   
				   }
			  
	}


			
				
				
			
		
		
		

	


