package whileExemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 12;
		while (x != 12) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("Você acertou o nosso dia");
		
		
		sc.close();

	}

}
