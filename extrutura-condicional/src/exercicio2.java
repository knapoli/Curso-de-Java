import java.util.Scanner;

public class exercicio2 {
	public static void main (String[]args) {
		int num, operacao;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com um numero inteiro: ");
		num = sc.nextInt();
		
		operacao = num % 2; 
		
		if (operacao != 0) {
			System.out.println("IMPAR");
		}
		else {
			System.out.println("PAR");
		}
				
		sc.close();
	}
}