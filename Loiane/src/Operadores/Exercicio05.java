package Operadores;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner entrada = new Scanner(System.in);
		
	   double metros;
	   double convers�oCentimetros;
		
       System.out.println("Por favor entre com o numero de metros");
	   metros = entrada.nextDouble();
	   
	   convers�oCentimetros = metros * 100;
	   
	   System.out.println("O resultado � " + convers�oCentimetros + " Cent�metros ");
		
	}

}
