package Relacionais;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com primeiro n�mero:");
        int numero1 = entrada.nextInt();

        System.out.println("Entre com segundo n�mero:");
        int numero2 = entrada.nextInt();

        System.out.println("Entre com terceiro n�mero:");
        int numero3 = entrada.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("numero1 � maior: " + numero1);
        } else if (numero2 >= numero1 && numero2 >=numero3){
            System.out.println("numero2 � maior: " + numero2);
        } else if (numero3 >= numero1 && numero3 >= numero2){
            System.out.println(" }3 � maior: " + numero3);
        } 
        
        if (numero1 <=numero2 && numero1 <= numero3){
            System.out.println("numero1 � menor: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3){
            System.out.println("numero2 � menor: " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2){
            System.out.println("numero3 � menor: " + numero3);
    }
	 }    
}
