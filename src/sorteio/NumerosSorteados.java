package sorteio;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

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

		Set<Integer>numerosArray = new HashSet<>();

		int i;
		for (i = 0; i < n; i++) {
			double sorteado = Math.random();
			int numeros = (int) (nMenor + sorteado * (nMaior - nMenor));
			numerosArray.add(numeros);
		}
		System.out.println("Números sorteados: " + numerosArray);
		
		sc.close();
		
	}
}
