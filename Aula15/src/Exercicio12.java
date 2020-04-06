import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		double valorDaHora = 0, horasTrabalhadas = 0, salarioBruto = 0;
		double	impostoDeRenda = 0, impostoSindical = 0, inss = 0, descontos = 0, fgts = 0, salarioliq = 0;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		 
		System.out.print("Digite o valor da sua hora trabalhada: ");
		valorDaHora = scan.nextDouble();
		System.out.print("Agora digite a quantidade de horasTrabalhadas: ");
		horasTrabalhadas = scan.nextDouble();
		
		
		
		if ( salarioBruto <= 900.00) {
			salarioBruto = (valorDaHora * horasTrabalhadas);
			impostoDeRenda = (salarioBruto * 0.00);
			impostoSindical = (salarioBruto * 0.03);
			inss = (salarioBruto * 0.10);
			fgts = (salarioBruto * 0.11);
			descontos = ( impostoDeRenda + impostoSindical + inss);
			salarioliq = ( salarioBruto - descontos );
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			System.out.println("Você é isento(a) de imposto de renda");
			System.out.println("INSS " + inss );
			System.out.println("FGTS "+ fgts );
			System.out.println("Total dos descontos: "  + descontos);
			System.out.println("Seu salário líquido é : R$ " + salarioliq );	
			
						
		}
		else if (salarioBruto > 900.00 && salarioBruto < 1500.00 ) {
			
			salarioBruto = (valorDaHora * horasTrabalhadas);
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			impostoDeRenda = (salarioBruto * 0.05);
			impostoSindical = (salarioBruto * 0.03);
			inss = (salarioBruto * 0.10);
			fgts = (salarioBruto * 0.11);
			descontos = ( impostoDeRenda + impostoSindical + inss);
			salarioliq = ( salarioBruto - descontos );
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			System.out.println("Imposto de Renda" + impostoDeRenda);
			System.out.println("INSS " + inss );
			System.out.println("FGTS "+ fgts );
			System.out.println("Total dos descontos: "  + descontos);
			System.out.println("Seu salário líquido é : R$ " + salarioliq );	
			
		}
		else if (salarioBruto >= 1500.00 && salarioBruto < 2500.00 ) {
			salarioBruto = (valorDaHora * horasTrabalhadas);
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			impostoDeRenda = (salarioBruto * 0.10);
			impostoSindical = (salarioBruto * 0.03);
			inss = (salarioBruto * 0.10);
			fgts = (salarioBruto * 0.11);
			descontos = ( impostoDeRenda + impostoSindical + inss);
			salarioliq = ( salarioBruto - descontos );
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			System.out.println("Imposto de Renda" + impostoDeRenda);
			System.out.println("INSS " + inss );
			System.out.println("FGTS "+ fgts );
			System.out.println("Total dos descontos: "  + descontos);
			System.out.println("Seu salário líquido é : R$ " + salarioliq );
			
		}
		else {
			
		}
		if (salarioBruto >= 2500.00 ) {
			salarioBruto = (valorDaHora * horasTrabalhadas);
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			impostoDeRenda = (salarioBruto * 0.20);
			impostoSindical = (salarioBruto * 0.03);
			inss = (salarioBruto * 0.10);
			fgts = (salarioBruto * 0.11);
			descontos = ( impostoDeRenda + impostoSindical + inss);
			salarioliq = ( salarioBruto - descontos );
			System.out.println("Salário bruto é : R$ " + salarioBruto + " reais ");
			System.out.println("Imposto de Renda" + impostoDeRenda);
			System.out.println("INSS " + inss );
			System.out.println("FGTS "+ fgts );
			System.out.println("Total dos descontos: "  + descontos);
			System.out.println("Seu salário líquido é : R$ " + salarioliq );
		}
			
		
		
	}
	

}
