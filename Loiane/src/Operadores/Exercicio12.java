package Operadores;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        Scanner entrada = new Scanner(System.in);
		
        double altura; 
        double pesoIdeal;
        
		System.out.println("Por favor entre com sua altura!");
		altura = entrada.nextDouble();

	    pesoIdeal = (72.7 * altura) - 58;
	    
	    System.out.println("Seu peso ideal é: " + pesoIdeal);
	}

}
