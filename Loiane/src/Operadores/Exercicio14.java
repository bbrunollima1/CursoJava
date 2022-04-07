package Operadores;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
       Scanner entrada = new Scanner(System.in);
       
       double tamanhoArquivo;
       double velocidadeNet;
       double tempo;
       
	   System.out.println("Por favor entre com o tamanho do arquivo");
	   tamanhoArquivo = entrada.nextDouble();
		
	   System.out.println("Por favor entre com velocidade da internet");
	   velocidadeNet = entrada.nextDouble();
		
	   tempo = tamanhoArquivo / velocidadeNet;
		
	   System.out.println("O tempo é: " + tempo);
	}

}
