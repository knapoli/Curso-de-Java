import java.util.Scanner;

public class exercicio3 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		int A, B;
		System.out.println("Entre com o primeiro valor inteiro: ");
		A = sc.nextInt();
		System.out.println("Entre com o segundo valor inteiro: ");
		B = sc.nextInt();
		
		if (A % B ==0 || B % A == 0) {
			System.out.println("S�o Multiplos");
		}
		else {
			System.out.println("N�o s�o multiplos");
		}
		sc.close(); 
	}
}