package Operadores;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double soma;
		double media;
		
		System.out.println("Por favor entre com a nota 1");
	    nota1 = entrada.nextDouble();
		
		System.out.println("Por favor entre com a nota 2");
	    nota2 = entrada.nextDouble();
		
		System.out.println("Por favor entre com a nota 3");
		nota3 = entrada.nextDouble();
		
		System.out.println("Por favor entre com a nota 4");
		nota4 = entrada.nextDouble();
		
		soma = nota1+nota2+nota3+nota4;
		
		media = soma/4;
		
		System.out.println("O resultado da soma das notas foi: " + soma);
		System.out.println("O resultado da media das notas foi: " + media);
		
	}

}
