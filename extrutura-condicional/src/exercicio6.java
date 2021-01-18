import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero entre 0 e 100: ");
		
		double num = sc.nextDouble();
		
		if (num >= 0 && num <= 25) {
			System.out.printf("Intervalo [0,25]");
		}
		
		else if (num > 25 && num <= 50) {
			System.out.printf("Intervalo (25,50]");
		}
		else if (num > 50 && num <= 75) {
			System.out.printf("Intervalo (50,75]");
		}
		else if (num > 75 && num <=100) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		sc.close();
			
	}
}