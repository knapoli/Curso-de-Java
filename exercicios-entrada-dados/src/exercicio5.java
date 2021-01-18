import java.util.Scanner;
import java.util.Locale;

public class exercicio5 {
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numPeca1, numPeca2, cod1, cod2;
		double  preco1, preco2, total;
		cod1 = sc.nextInt();
		numPeca1 = sc.nextInt();
		preco1 = sc.nextDouble();
		cod2 = sc.nextInt();
		numPeca2 = sc.nextInt();
		preco2 = sc.nextDouble();
		total = (numPeca1 * preco1) + (numPeca2 * preco2);
		System.out.printf("Valor a pagar = R$ %.2f%n", total);
		sc.close();
	}
	
	
}