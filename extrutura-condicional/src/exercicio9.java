import java.util.Scanner;

public class exercicio9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com a quantidade de minutos: ");
		int min = sc.nextInt();
		
		double conta = 50;
		if (min > 100) {
			conta += (min - 100) * 2 ;
				}
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		sc.close();
	}
}