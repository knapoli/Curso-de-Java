import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
	
	public static void main (String[]args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double  num, horas, salario, total;
		num = sc.nextDouble();
		horas = sc.nextDouble();
		salario = sc.nextDouble();
		total = horas * salario;
		System.out.printf("Number = " + num);
		System.out.printf("Salary = U$ %.2f%n", total);
		sc.close();
	}
	
	
}