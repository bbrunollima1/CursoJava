package Relacionais;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    Scanner entrada = new Scanner(System.in);
 		
		String sexo;
		
		
		System.out.println("Por favor informe seu sexo, F para feminino e M para masculino ");
	    sexo = entrada.next();
	           
	    if(sexo.equalsIgnoreCase("M")   ) {
	    	System.out.println("Seu sexo e masculino");
	    }
	    else if( sexo.equalsIgnoreCase("f") ) {
	    	System.out.println("Seu sexo e feminino");
	    }else {
	    	
	    	System.out.println("informacao invalida");
	}
	}

}
