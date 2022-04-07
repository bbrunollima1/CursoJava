package Relacionais;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com primeiro número:");
        int numero1 = entrada.nextInt();

        System.out.println("Entre com segundo número:");
        int numero2 = entrada.nextInt();

        System.out.println("Entre com terceiro número:");
        int numero3 = entrada.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3){
            System.out.println("numero1 é maior: " + numero1);
        } else if (numero2 >= numero1 && numero2 >=numero3){
            System.out.println("numero2 é maior: " + numero2);
        } else if (numero3 >= numero1 && numero3 >= numero2){
            System.out.println(" }3 é maior: " + numero3);
        } 
        
        if (numero1 <=numero2 && numero1 <= numero3){
            System.out.println("numero1 é menor: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3){
            System.out.println("numero2 é menor: " + numero2);
        } else if (numero3 <= numero1 && numero3 <= numero2){
            System.out.println("numero3 é menor: " + numero3);
    }
	 }    
}
