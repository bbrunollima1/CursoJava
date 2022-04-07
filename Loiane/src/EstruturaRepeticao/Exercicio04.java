package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

	       Scanner entrada = new Scanner(System.in);
	       
	       int popA=8000;
	       int popB=20000;
	       int contador=0;
	       
	       while ( popA < popB) {
	    	   
	    	   popA += (popA / 100) * 3;
	    	   popB += (popB / 100) * 1.5;
	    	   contador++;
	    	   
	    	   
	       }
	       

    	   System.out.println(" Populacao A " + popA);
    	   
    	   System.out.println(" Populacao B " + popB);
    	   
    	   System.out.println(" qtd anos " + contador);
	}

}
