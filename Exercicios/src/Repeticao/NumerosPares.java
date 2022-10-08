package Repeticao;

import java.util.Scanner;

public class NumerosPares {
	public static void main(String[] args) {
		
		int numero,cont;
		String opcao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("==========================");
		System.out.println("       Par ou Ímpar       ");
		System.out.println("==========================");
		
		System.out.print("Escolha par ou impar: ");
		opcao = entrada.nextLine();

		System.out.print("Digite um numero: ");
		numero = entrada.nextInt();

		switch (opcao) {
		
		    case "impar":
		        
		        for(cont=1; cont <= numero; cont++){
		            
		            if(cont%2 == 1){
		                System.out.print(cont + " ");
		            }
		        }
		        break;
		    
		    case "par":
		        
		        for(cont=1; cont <= numero; cont++){
		            
		            if(cont%2 == 0){
		                System.out.print(cont + " ");
		            }
		        }
		        break;
    	}
	}

}
