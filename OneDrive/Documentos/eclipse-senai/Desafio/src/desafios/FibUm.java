package desafios;

import java.util.Scanner;

public class FibUm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número inteiro para a sequência Fibonacci: ");
		int num = input.nextInt();

		if (num < 0) {
			System.out.println("O número deve ser maior ou igual a 0.");
		} else {
			System.out.println("O Fibonacci de " + num + " é: " + fib(num));
		}

		input.close();
	}

	public static int fib(int n) {
		
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		// Calculando Fibonacci para n >= 2
		int a = 0, b = 1;
		for (int i = 2; i <= n; i++) {
			int temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	}
}
