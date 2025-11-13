package desafios;

import java.util.Scanner;

public class Fib3 {
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
	        if (n <= 1) {
	            return n; 
	        }
	        int anterior = 0, proxima = 1, soma = 0;
	        for (int i = 2; i <= n; i++) {
	            soma = anterior + proxima;
	            anterior = proxima;
	            proxima = soma;
	        }
	        return soma;
	    }
}
