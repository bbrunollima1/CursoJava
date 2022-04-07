package Vetor;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner entrada = new Scanner(System.in);
	        
	        int[] vetorA = new int[10];
	        
	        for (int i=0; i<vetorA.length; i++){
	            System.out.println("Entre com o valor da posição " + i);
	            vetorA[i] = entrada.nextInt();
	        }
	        
	        int somaMenor15 = 0;
	        int somaMaior15 = 0;
	        int qtdMaior15 = 0;
	        int igual15 = 0;
	        for (int i=0; i<vetorA.length; i++){
	            if (vetorA[i] == 15){
	                igual15++;
	            } else if (vetorA[i] < 15){
	                somaMenor15 += vetorA[i];
	            } else {
	                qtdMaior15++;
	                somaMaior15 += vetorA[i];
	            }
	        }
	        
	        System.out.print("Vetor A = ");
	        for (int i=0; i<vetorA.length; i++){
	            System.out.print(vetorA[i] + " ");
	        }
	        System.out.println();
	        
	        System.out.println("Qtd números igual 15: " + igual15);
	        System.out.println("Soma números menor 15: " + somaMenor15);
	        System.out.println("Média números maior 15: " + (somaMaior15/qtdMaior15));
	    }    
	}