import java.util.Scanner;

public class BancoUI {

		private Banco meuBanco;
		private Scanner entrada; 
		
		public BancoUI (String nome, int numero, int agencia) {
			meuBanco = new Banco ("BB", numero, agencia);
			entrada = new Scanner (System.in);
		}
		
		public void menu() {
			
			int op;
			
			do {
				System.out.println();
				System.out.println("=======================");
				System.out.println("Bem vindo ao " + meuBanco.getNome());
				System.out.println("=======================");
				System.out.println("1. Abrir Conta");
				System.out.println("2. Saldo");
				System.out.println("3. Depositar");
				System.out.println("4. Sacar");
				System.out.println("5. Transferir");
				System.out.println("6. Listar contas");
				System.out.println("0. Sair\n");
				System.out.println("=======================");
				System.out.print("Informe a opção desejada (0 a 6):");
				op = entrada.nextInt();
				entrada.nextLine();
				
				switch(op) {
					
					case 1:
						abrirConta();
						break;
					
					case 2:
						consultarSaldo();
						break;
					
					case 3:
						depositarValor();
						break;
					
					case 4:
						sacarValor();
						break;
					
					case 5:
						transferirValor();
						break;
						
					case 6:
						listarContas();
						break;
					
					case 0: break;
				}
			}while(op!=0);
		}
		
		public void abrirConta() {
			String nome, cidade, estado;
			long cpf;
			
			System.out.println();
			System.out.println("=======================");
			System.out.println("Abertura de conta");
			System.out.print("Informe o nome do titular: ");
			nome = entrada.nextLine();
			System.out.print("Informe o CPF do titular: ");
			cpf = entrada.nextLong();
			entrada.nextLine();
			System.out.print("Informe a cidade: ");
			cidade = entrada.nextLine();
			System.out.print("Informe o estado: ");
			estado = entrada.nextLine();
			Cliente cliente = meuBanco.cadastrarCliente(nome, cpf, cidade, estado);
			int numeroConta = meuBanco.abrirConta(cliente);
			System.out.println("===============================");
			System.out.println("Abertura realizada com sucesso.");
			System.out.println(meuBanco.dadosConta(numeroConta));
			System.out.println("===============================");
		}
		
		public void consultarSaldo() {
			int numeroConta;
			System.out.println();
			System.out.println("=======================");
			System.out.println("Consultar Saldo");
			System.out.println("Informe o numero da conta:");
			numeroConta = entrada.nextInt();
			System.out.println("=======================");
			System.out.println("Saldo atual: " +meuBanco.getSaldo(numeroConta));
			System.out.println("=======================");
		}
		
		public void depositarValor() {
			int numeroConta;
			double valor;
			System.out.println();
			System.out.println("=======================");
			System.out.println("Depositar");
			System.out.println("Informe o numero da conta:");
			numeroConta = entrada.nextInt();
			System.out.println("Qual o valor: ");
			valor = entrada.nextDouble();
			meuBanco.deposita(numeroConta, valor);
			System.out.println("=======================");
			System.out.println("Saldo atual: " +meuBanco.getSaldo(numeroConta));
			System.out.println("=======================");
		}
		
		public void sacarValor() {
			int numeroConta;
			double valor;
			System.out.println();
			System.out.println("=======================");
			System.out.println("Sacar Valor");
			System.out.println("Informe o numero da conta:");
			numeroConta = entrada.nextInt();
			System.out.println("Qual o valor: ");
			valor = entrada.nextDouble();
			meuBanco.sacar(numeroConta, valor);
			System.out.println("=======================");
			System.out.println("Saldo atual: " +meuBanco.getSaldo(numeroConta));
			System.out.println("=======================");
			
		}
		
		public void transferirValor() {
			int origem, destino;
			double valor;
			System.out.println();
			System.out.println("=======================");
			System.out.println("Transferência de Valor");
			System.out.println("Informe a conta origem: ");
			origem = entrada.nextInt();
			System.out.println("Informe a conta destino: ");
			destino = entrada.nextInt();
			System.out.println("Informe o valor: ");
			valor = entrada.nextDouble();
			meuBanco.transferir(origem, destino, valor);
			
		}
		
		public void listarContas() {
			System.out.println(meuBanco.toString());
		}
}
