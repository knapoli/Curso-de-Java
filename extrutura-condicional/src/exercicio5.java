import java.util.Scanner;

public class exercicio5 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o codigo do produto (de 1 a 5): ");
		double cod = sc.nextDouble();
		System.out.println("Entre com a quantidade: ");
		double quant = sc.nextDouble();
		
		double total;
		if (cod == 1) {
			total = quant * 4.0;
		}
		else if (cod == 2) {
			total = quant * 4.5;
		}
		else if (cod == 3) {
			total = quant * 5.0;
		}
		else if (cod == 4) {
			total = quant * 2.0;
		}
		else {
			total = quant * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		sc.close();
	}
	
}