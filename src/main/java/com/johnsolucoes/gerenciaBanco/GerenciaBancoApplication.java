package com.johnsolucoes.gerenciaBanco;

import java.util.Scanner;

public class GerenciaBancoApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Sobrenome: ");
		String sobrenome = sc.nextLine();
		System.out.print("CPF: ");
		String cpf = sc.nextLine();

		ContaBancaria conta = new ContaBancaria(nome, sobrenome, cpf);

		int opcao;
		do {
			System.out.println("\n=== MENU ===");
			System.out.println("1) Consultar saldo");
			System.out.println("2) Depositar");
			System.out.println("3) Sacar");
			System.out.println("0) Sair");
			System.out.print("Escolha: ");
			opcao = sc.nextInt();

			switch (opcao) {
				case 1:
					System.out.printf("Saldo atual: R$ %.2f%n", conta.consultarSaldo());
					break;
				case 2:
					System.out.print("Valor a depositar: ");
					double dep = sc.nextDouble();
					conta.depositar(dep);
					System.out.println("Depósito realizado.");
					break;
				case 3:
					System.out.print("Valor a sacar: ");
					double saq = sc.nextDouble();
					if (conta.sacar(saq))
						System.out.println("Saque efetuado.");
					else
						System.out.println("Saldo insuficiente.");
					break;
				case 0:
					System.out.println("Obrigado por usar. Até logo!");
					break;
				default:
					System.out.println("Opção inválida.");
			}
		} while (opcao != 0);

		sc.close();
	}
}
