package desafios;

import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Digite um valor maior que 1 para encontrar os números primos: ");
		int num = input.nextInt();

		if (num <= 1) {
			System.out.println("O número deve ser maior que 1.");
		} else {
			System.out.println("Números primos até " + num + " (Recursivo): " + pRecursivo(num, 2, new ArrayList<>()));

			System.out.println("Números primos até " + num + " (Linear): " + pLinear(num));
		}

		input.close();
	}

	public static ArrayList<Integer> pRecursivo(int n, int i, ArrayList<Integer> primos) {
		if (i > n) {
			return primos;
		}
		if (isPrimo(i)) {
			primos.add(i);
		}
		return pRecursivo(n, i + 1, primos);
	}

	public static ArrayList<Integer> pLinear(int n) {
		ArrayList<Integer> primos = new ArrayList<>();

		for (int i = 2; i <= n; i++) {
			if (isPrimo(i)) {
				primos.add(i);
			}
		}

		return primos;
	}

	public static boolean isPrimo(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

}
