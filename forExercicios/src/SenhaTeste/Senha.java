package SenhaTeste;

import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int entrada, tentativa = 3, senha = 1759;

		while (true) {

			System.out.println("ensira a senha você tem" + tentativa  + "restantes");
			entrada = sc.nextInt();

			if (entrada == senha) {
				System.out.println("senha correta");
				break;
			} else {
				tentativa -= 1;
				System.out.println("tente novamente, você tem mais" +  tentativa + "restantes");
			}
			if (tentativa <= 0) {
				System.out.println("o login foi bloqueado");
				break;
			}

		}
		;

		sc.close();

	}

}
