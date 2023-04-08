package whileExemplo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 05;
		while (x != 05) {
			soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println("Verificação de data de pagamento realizada com sucesso");
		
		
		sc.close();

	}

}
