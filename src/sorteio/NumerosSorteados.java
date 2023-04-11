package sorteio;

import java.util.Scanner;

public class NumerosSorteados {
	public static void main(String[] args) {
		System.out.println("Bem-vindo ao Sorteador!");
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantos números serão sorteados: ");
		int n = sc.nextInt();

		System.out.println("Digite o menor número do sorteio: ");
		int nMenor = sc.nextInt();
		
		System.out.println("Digite o maior número sorteio: ");
		int nMaior = sc.nextInt();

		
		sc.close();
		
	}
}
