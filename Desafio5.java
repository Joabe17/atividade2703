package exercicio27do3;

import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		String cpf , senha;
		double val, saldo;
		System.out.println("Digite seu cpf");
		cpf = ler.nextLine ();
		if (cpf.equals("482345678")) {
			System.out.println("Digite sua senha");
			senha = ler.nextLine ();
			if (senha.equals("12345678")) {
				System.out.println("Seu saldo é 150");
				System.out.println("Qual valor deseja sacar?");
				val = ler.nextDouble();
				if (val <= 200) {
					saldo = 200 - val;
					System.out.println("saldo atualizado,valor correspondente é" + saldo);
				}else {
					System.out.println("saldo insuficiente");}
			}else {
				System.out.println("senha incorreta");}
		}else {
			System.out.println("cpf incorreto");
		} ler.close ();
	}
}



