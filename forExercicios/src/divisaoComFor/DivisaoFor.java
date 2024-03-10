package divisaoComFor;

import java.util.Scanner;

public class DivisaoFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			}
			else {
			double dividido = (double) x / y;
			
			System.out.printf("%.1f%n", dividido);
			}
		}

		sc.close();
	}

}
