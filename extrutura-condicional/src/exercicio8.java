import java.util.Scanner;

public class exercicio8 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o salário: ");
		double salario = sc.nextDouble();
		
		if (salario <= 2000) {
			System.out.println("ISENTO");
		}
		
		else if (salario > 2000 && salario <= 3000) {
			salario = salario - 2000;
			double taxa8 = salario / 100 * 8;
			System.out.printf("R$ %.2f", taxa8);
		}
		
		else if (salario > 3.000 && salario <= 4500) {
			salario = salario - 3000;
			double taxa8 = 80;
			double taxa18 = salario / 100 * 18;
			double imposto = taxa8 + taxa18;
			System.out.printf("R$ %.2f" , imposto);
			}
		else {
			salario = salario - 4500;
			double taxa818 = 350;
			double taxa28 = salario / 100 * 28;
			double imposto = taxa818 + taxa28;
			System.out.printf("R$ %.2f" , imposto);
		}
		
		sc.close();
		}

	

}