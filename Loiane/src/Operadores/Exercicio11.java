package Operadores;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada = new Scanner(System.in);
		
	     int numero1;
	     int numero2;
	     double numero3;
	     int resultadoA;
	     double resultadoB;
	     double resultadoC;
			
	     System.out.println("Por favor entre com o numero 1");
	     numero1 = entrada.nextInt();
	        
	     System.out.println("Por favor entre com o numero 2");
	     numero2 = entrada.nextInt();
	     
	     System.out.println("Por favor entre com o numero 3");
	     numero3 = entrada.nextDouble();
	     
	     resultadoA = (numero1 * 2) * (numero2 / 2);
	     
	     resultadoB = (numero1 * 3) + numero3;
	     
	     resultadoC = Math.pow(numero3, 3);
	     
	     System.out.println("Resultado A foi: " + resultadoA);
	     System.out.println("Resultado B foi: " + resultadoB);
	     System.out.println("Resultado C foi: " + resultadoC);
	}

}
