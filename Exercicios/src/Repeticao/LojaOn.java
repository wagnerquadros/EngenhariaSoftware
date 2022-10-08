package Repeticao;
import java.util.Scanner;

public class LojaOn {

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		double precoProduto, valor, parcela;
		int codigoPagamento;
		
		System.out.println("-----------------------");
		System.out.println("---- Loja On line -----");
		System.out.println("-----------------------");
		System.out.print ("Digite o valor do produto: ");
		precoProduto = entrada.nextDouble();
		
		System.out.println("=============================================");
		System.out.println(" Forma de Pagamento   |  Código   | Desconto ");
		System.out.println("=============================================");
		System.out.println(" Á vista              |     1     |    30%   ");
		System.out.println(" Em duas vezes        |     2     |    20%   ");
		System.out.println(" Em três vezes        |     3     |    10%   ");
		System.out.println(" De 4 a 6 vezes       |     4     |     0    ");
		System.out.println("=============================================");
		System.out.print("Escolha a forma de pagamento: ");
		codigoPagamento = entrada.nextInt();
		
		switch (codigoPagamento) {
		    case 1:
		        valor = precoProduto * 0.7;
		        System.out.println ("O valor à vista fica: " + valor);
		        break;
		    case 2:
		        valor = precoProduto * 0.8;
		        parcela = valor / 2;
		        System.out.println("Duas parcelas de " + parcela);
		        break;
		    case 3:
		        valor = precoProduto * 0.9;
		        parcela = valor / 3;
		        System.out.println("Três parcelas de " + parcela);
		        break;
		    case 4:
		        System.out.println("4 parcelas de: " + precoProduto/4);
		        System.out.println("5 parcelas de: " + precoProduto/5);
		        System.out.println("6 parcelas de: " + precoProduto/6);
		        break;
		    default:
		        System.out.println("Código Invalido");
		        break;
		}

	}
}
