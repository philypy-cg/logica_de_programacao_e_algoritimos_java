package exercicio_revisao;

import java.util.Locale;
import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		sc.close();
	}

}
