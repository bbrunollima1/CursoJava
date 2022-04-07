package Operadores;

import java.util.Scanner;

public class Exercicios06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner entrada = new Scanner(System.in);
		
        double raio;
        double pi= 3.14;
        double area;
        double dobro;
		
        
        System.out.println("Por favor entre com o raio do circulo!");
		raio = entrada.nextDouble();
		
		area = pi * (raio * raio);
		
		dobro = area * 2;
		
		System.out.println("O resultado da area do circulo foi: " + area);
		System.out.println("O resultado do dobro da area do circulo foi: " + dobro);
	}

}
