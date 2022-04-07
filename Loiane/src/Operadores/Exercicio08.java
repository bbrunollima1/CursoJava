package Operadores;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner entrada = new Scanner(System.in);
			
	     double ganhoHoras;
	     double horasTrabalhadas;
	     double salarioMensal;
	     
			
	     System.out.println("Por favor entre com quanto você ganha por hora trabalhadas");
	     ganhoHoras= entrada.nextDouble();
	        
	     System.out.println("Por favor entre com quantas horas você trabalhou");
	     horasTrabalhadas = entrada.nextDouble();
	     
	     salarioMensal = ganhoHoras * horasTrabalhadas;
	     
	     System.out.println("Seu salario mensal é: "  + salarioMensal);
	    
	     
	     
	}
}


