package Operadores;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int soma;
		
		System.out.println("Por favor entre com o numero 1");
		numero1 = entrada.nextInt();
		
		System.out.println("Por favor entre com o numero 2");
		numero2 = entrada.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("O resultado da soma foi: " + soma);
	}

}
