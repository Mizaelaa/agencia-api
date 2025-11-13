package desafios;

import java.util.Scanner;

/* A função deve receber um numero N >= 0 (deve validar o input para a função),
e retornar o valor correspondente desse número na sequência Fibonacci. 
EX. fib(0) =0; fib(1) = 1; fib(2) = 1; fib(3) = 2; fib(5) = 5; fib(6) = 8.
*/
public class Fib {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um numero inteiro maior ou igual a 0:");
		int numero = input.nextInt();

		 if (numero < 0) {
	            System.out.println("O número deve ser maior ou igual a 0.");
	        } else {
	            System.out.println("O Fibonacci de " + numero + " é: " + fib(numero));
	        }

	        input.close();
	    }

	    public static int fib(int n) {
	        if (n <= 1) return n; 
	        return fib(n - 1) + fib(n - 2); 
	    }
	}
