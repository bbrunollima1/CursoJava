package Operadores;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner entrada = new Scanner(System.in);
			
	     double ganhoHoras;
	     double horasTrabalhadas;
	     double salarioBruto;
	     double inss;
	     double sindicato;
	     double ir;
	     double totalDescontos;
	     double salarioLiquido;
	     
			
	     System.out.println("Por favor entre com quanto você ganha por hora trabalhadas");
	     ganhoHoras= entrada.nextDouble();
	        
	     System.out.println("Por favor entre com quantas horas você trabalhou");
	     horasTrabalhadas = entrada.nextDouble();
	     
	     salarioBruto = ganhoHoras * horasTrabalhadas;
	     
	     inss = (salarioBruto / 100) * 8;
	     
	     sindicato = (salarioBruto / 100) * 5;
	    		 
	     ir = (salarioBruto / 100) * 11;
	      
	     totalDescontos = inss + sindicato + ir;
	     
	     salarioLiquido = salarioBruto - totalDescontos;
	     
	     
	     System.out.println("Salario Bruto foi: " + salarioBruto);
	     System.out.println("Desconto Inss foi: " + inss);
	     System.out.println("Descoto Sindicato foi: " + sindicato);
	     System.out.println("Desconto IR foi: " + ir);
	     System.out.println("Desconto total foi: " + totalDescontos);
	     System.out.println("Salario Liquido foi: " + salarioLiquido);
	}

}
