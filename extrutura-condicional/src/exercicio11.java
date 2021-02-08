import java.util.Scanner;

public class exercicio11 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o valor: ");
		double preco = sc.nextDouble();
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		double conta = preco - desconto;
		System.out.printf("Valor a pagar: R$ %.2f%n", conta);
		sc.close();
	}
}