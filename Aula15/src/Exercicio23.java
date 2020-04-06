import java.util.Scanner;



public class Exercicio23 {

	public static void main(String[] args) {
		/*Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há limites para a 
		 * quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total 
		 * a compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as 
		 * informações da compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar. 		 * 
		 */
		int opcao = 0;
		int opcaopagamento;
		double qtd = 0;
		float valor = 0;
		double desconto;
		float valorfinal = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo ao Hipermercado Tabajara, aproveite a super oferta de carnes.");
		System.out.println("OBSERVAÇÃO: Para atender a todos os clientes o Hipermercado está permitindo apenas a compra de um tipo de carne, porém a quantidade"
				+ " é ilimitada.");
		System.out.print("Digite 1 para Filé Duplo, 2 para Alcatra, 3 para Picanha: ");
		
		
		switch (opcao) {
		
		case 1: System.out.println("Você digitou 1 - Filé Duplo");break;
		case 2: System.out.println("Você digitou 2 - Alcatra ");break;
		case 3: System.out.println("Você digitou 2 - Picanha");break;
		default:	
		}
		opcao = scan.nextInt();		
		
		
		if (opcao == 1) {
			System.out.print("Digite quantos quilos de Filé Duplo vai levar: ");
			qtd = scan.nextDouble();
		}		
		if (opcao == 2) {
			System.out.print("Digite quantos quilos de Alcatra vai levar: ");	
			qtd = scan.nextDouble();
		}		
		if (opcao == 3) {
			System.out.print("Digite quantos quilos de Picanha vai levar: ");	
			qtd = scan.nextDouble();
		}
		
		
		if (opcao == 1 && qtd > 5) {
			valor = (float) (qtd * 5.80);
			System.out.println("Subtotal R$" + valor);
		}
		if (opcao == 1 && qtd <= 5) {
			valor = (float) (qtd *4.90);
			System.out.println("Subtotal R$" + valor);
		}
		
		
		if (opcao == 2 && qtd > 5) {
			valor = (float) (qtd * 5.90);
			System.out.println("Subtotal R$" + valor);
		}
		if (opcao == 2 && qtd <= 5) {
			valor = (float) (qtd * 6.80);
			System.out.println("Subtotal R$" + valor);
		}
		
		
		if (opcao == 3 && qtd > 5) {
			valor = (float) (qtd * 7.80);
			System.out.println("Subtotal R$" + valor);
		}
		if (opcao == 3 && qtd <= 5) {
			valor = (float) (qtd * 6.90);
			System.out.println("Subtotal R$" + valor);
		
		}
		
		System.out.println("CARO CLIENTE VOCÊ TERÁ 5% DE DESCONTO PAGANDO COM CARTÃO HIPERMERCADO TABAJARA");
		System.out.print("Pagamento com cartão Hipermercado Tabajara? Digite 1 para sim e 0 para não: ");
		opcaopagamento = scan.nextInt();
		
		if (opcaopagamento == 1) {
			desconto = (float) (valor * 0.05);
			valorfinal = (float) (valor - desconto);
			System.out.println(" Venda encerrada valor final: " + valorfinal);
		}
		if (opcaopagamento == 0) {
			System.out.println("Venda encerrada valor final: " + valor);
		}

	}

}
