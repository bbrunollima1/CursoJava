package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      

	       Scanner entrada = new Scanner(System.in);
	       
	       String nomeUsuario;
	       String sexo;
	       String estadoCivil;
	       int idade;
	       double salario;
		   boolean infoValidas = false;
	       
		   do {
	       System.out.println("Por favor! digite o nome do usuario");
	       nomeUsuario = entrada.next();
	  
	       if(nomeUsuario.length()>=3) {
	    	   infoValidas = true;
	    	   
	       }else {
	    	   System.out.println("nome precisa de no minimo 3 caracteres");
	       }
	      
	     
	       }while(!infoValidas);
		   
		   infoValidas = false;
		   
		   do {
		       System.out.println("Por favor! digite a idade do usuario");
		       idade = entrada.nextInt();
		  
		       
		       if(idade>=0 && idade <=150) {
		    	   infoValidas = true;
		    	   
		       }else {
		    	   System.out.println("idade precisa ser entre 0 e 150");
		       }
		      
		     
		       }while(!infoValidas);
		   
		       infoValidas = false;
		       
		       do {
			       System.out.println("Por favor! digite o salario do usuario");
			       salario = entrada.nextDouble();
			  
			       
			       if(salario > 0) {
			    	   infoValidas = true;
			    	   
			       }else {
			    	   System.out.println("salario precisa ser entre maior que 0");
			       }
			      
			     
			       }while(!infoValidas);
		          
		       infoValidas = false;
		       
		       do {
			       System.out.println("Por favor! digite o sexo do usuario");
			       sexo = entrada.next();
			  
			       
			       if(sexo.equalsIgnoreCase("m")  || sexo.equalsIgnoreCase("f") ) {
			    	   infoValidas = true;
			    	   
			       }else {
			    	   System.out.println("sexo precisa ser f ou m");
			       }
			      
			     
			       }while(!infoValidas);
		       infoValidas = false;
		       
		       do {
			       System.out.println("Por favor! digite o estado Civil do usuario");
			       estadoCivil = entrada.next();
			  
			       
			     if( estadoCivil.equalsIgnoreCase("S")  || estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D") ) {
			    	   infoValidas = true;
			    	   
			       }else {
			    	   System.out.println("Estado civil precisa ser s,c,v e d");
			       }
			      
			     
			       }while(!infoValidas);
		       
		       System.out.println(" As informacoes apuradas foram: ");
		       System.out.println("Nome: " + nomeUsuario);
		       System.out.println("Idade: " + idade);
		       System.out.println("Salario: " + salario);
		       System.out.println("Sexo: " + sexo);
		       System.out.println("Estado civil: " + estadoCivil);
		       
		   
		   
	 
		}
	}


