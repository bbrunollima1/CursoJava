package Relacionais;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Scanner entrada = new Scanner(System.in);
		
		double nota1;
		double nota2;
		double media;
		
		System.out.println("Por favor entre com o numero 1");
		nota1 = entrada.nextDouble();
		
		System.out.println("Por favor entre com o numero 2");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		  if(media>=7 && media<10 ) {
		    	System.out.println("Aluno aprovado com media: " + media);
		    }
		    else if(media<7) {
		    	System.out.println("Aluno reprovado com media: " + media);
		    }
		    else if(media==10 ) {
		    	
		    	System.out.println("Aluno aprovado com Distincao com media: " + media);
		}
		}

}


