package FistSteps;
import java.util.Scanner;


public class TempoServico {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tempoServico, bonus;
		
		System.out.print("Digite quantos anos trabalha na firma:");
		tempoServico = entrada.nextInt();
		
		bonus = (tempoServico/5);
		
		if (bonus >= 1) {
		    System.out.println("Ganhaste: " + bonus);
		} else {
		    System.out.println("Lamento, não ganhaste bônus ainda");
		}
	}

}
