package FistSteps;
import java.util.Scanner;

public class SomaDosMenores {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numeroUm, numeroDois, numeroTres, soma;
		
		System.out.println("Digite três numeros:");
		numeroUm = entrada.nextInt();
		numeroDois = entrada.nextInt();
		numeroTres = entrada.nextInt();
		
		soma = numeroUm + numeroDois;
		
		if (soma > numeroTres) {
		    System.out.println("A soma dos dois primeiros numeros é maior que o terceiro numero");
		} else {
		    if (soma < numeroTres) {
		        System.out.println("A soma dos primeiros numeros é menor");
		    } else {
		        System.out.println("A soma dos primeiros é igual ao terceiro numero");
		    }
	    }
	
	}

}
