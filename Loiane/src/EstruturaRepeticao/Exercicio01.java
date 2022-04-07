package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
       Scanner entrada = new Scanner(System.in);
       
       double nota;
		
       do {
       System.out.println("Por favor entre com  nota");
	   nota = entrada.nextDouble();
	   
	   System.out.println("Sua nota foi: " + nota);
     
       }while(nota >= 0 && nota <= 10);
       
       System.out.println("A nota " + nota + " é invalida");
	}
	

      
}
