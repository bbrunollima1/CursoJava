package Vetor;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner entrada = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posi��o " + i);
            vetorA[i] = entrada.nextInt();
        }
        
        int impar = 0;
        for (int i=0; i<vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                impar++;
            }
        }
        
        int par = vetorA.length - impar;
        
     
        double porcPar = (par * 100)/vetorA.length;
        double porcImpar = 100 - porcPar;
        
        System.out.print("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("Porcentagem Pares: " + porcPar);
        System.out.println("Porcentagem �mpares: " + porcImpar);
    }    
}
