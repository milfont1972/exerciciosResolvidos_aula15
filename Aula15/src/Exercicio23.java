import java.util.Scanner;



public class Exercicio23 {

	public static void main(String[] args) {
		/*Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, por�m n�o h� limites para a 
		 * quantidade de carne por cliente. Se compra for feita no cart�o Tabajara o cliente receber� ainda um desconto de 5% sobre o total 
		 * a compra. Escreva um programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, contendo as 
		 * informa��es da compra: tipo e quantidade de carne, pre�o total, tipo de pagamento, valor do desconto e valor a pagar. 		 * 
		 */
		int opcao = 0;
		int opcaopagamento;
		double qtd = 0;
		float valor = 0;
		double desconto;
		float valorfinal = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bem vindo ao Hipermercado Tabajara, aproveite a super oferta de carnes.");
		System.out.println("OBSERVA��O: Para atender a todos os clientes o Hipermercado est� permitindo apenas a compra de um tipo de carne, por�m a quantidade"
				+ " � ilimitada.");
		System.out.print("Digite 1 para Fil� Duplo, 2 para Alcatra, 3 para Picanha: ");
		
		
		switch (opcao) {
		
		case 1: System.out.println("Voc� digitou 1 - Fil� Duplo");break;
		case 2: System.out.println("Voc� digitou 2 - Alcatra ");break;
		case 3: System.out.println("Voc� digitou 2 - Picanha");break;
		default:	
		}
		opcao = scan.nextInt();		
		
		
		if (opcao == 1) {
			System.out.print("Digite quantos quilos de Fil� Duplo vai levar: ");
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
		
		System.out.println("CARO CLIENTE VOC� TER� 5% DE DESCONTO PAGANDO COM CART�O HIPERMERCADO TABAJARA");
		System.out.print("Pagamento com cart�o Hipermercado Tabajara? Digite 1 para sim e 0 para n�o: ");
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
