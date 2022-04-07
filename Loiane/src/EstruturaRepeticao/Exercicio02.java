package EstruturaRepeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	       Scanner entrada = new Scanner(System.in);
	       
	       String nomeUsuario;
	       String senha;
		   boolean infoValidas = false;
	       
		   do {
	       System.out.println("Por favor! digite o nome do usuario");
	       nomeUsuario = entrada.next();
	       
	       System.out.println("Por favor! digite a senha do usuario");
	       senha = entrada.next();
	       
	       if(nomeUsuario.equalsIgnoreCase(senha)) {
	    	   infoValidas = false;
	    	   System.out.println("Senha igual ao nome do usuario, digite novamente");
	    	   
	       }else {
	    	   infoValidas = true;
	    	   System.out.println("Senha diferente ao nome do usuario, senha correta");
	       }
		   

	     
	       }while(!infoValidas);
	       
	 
		}
	}


