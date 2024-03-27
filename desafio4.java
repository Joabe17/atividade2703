package exercicio27do3;

import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3;
		System.out.println("digite o primeiro valor");
		n1 = ler.nextInt ();
		System.out.println("digite o segundo valor");
		n2 = ler.nextInt ();
		System.out.println("digite o terçeiro valor");
		n3 = ler.nextInt ();
		if (n1 == n2 && n2 == n3){
			System.out.println("o triangulo é equilatero");
		}
		else if (n1 == n2 || n1 == n3 || n2 == n3) {
			System.out.println("O triangulo é isoceles");
		}
		else {
			System.out.println("O triangulo é escaleno");
		}
		ler.close();
	}
}
