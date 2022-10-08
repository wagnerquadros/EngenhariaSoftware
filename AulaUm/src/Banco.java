import java.util.ArrayList;

public class Banco {
	
	private String nome;
	private int numeroBco;
	private int agencia;
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	private static int refContas = 100;
	
	
	public Banco(String nome, int numeroBco, int agencia) {
		this.nome = nome;
		this.numeroBco = numeroBco;
		this.agencia = agencia;
	}
	
	public Cliente cadastrarCliente(String nome, long cpf, String cidade, String estado) {
		Cliente cliente = new Cliente(nome, cpf, cidade, estado);
		return cliente;
	}
			
	
	public int abrirConta(Cliente cliente) {
		listaContas.add(new Conta (refContas, cliente));
		return refContas++;
	}
	
	private Conta getConta (int numero) {
		for (int i=0; i<listaContas.size();i++) {
			if (listaContas.get(i).getNumero() == numero) {
				return listaContas.get(i);
			}
		} return null;
	}

	private boolean verificaConta(int numero) {
		if(getConta(numero)!= null) {
			return true;
		}
		return false;
	}
	
	public void deposita(int numeroConta, double valor) {
		if (verificaConta(numeroConta)) {
			Conta conta = getConta(numeroConta);
			conta.deposita(valor);

		} else {
			System.out.println("Conta Inexistente");
		}
	}
	
	public void transferir (int origem, int destino, double valor) {
		if (verificaConta(origem) && verificaConta(destino)) {
			Conta debito = getConta(origem);
			Conta credito = getConta(destino);
			debito.transferir(debito, credito, valor);
		} else {
			System.out.println("Conta Inexistente");
		}
	}
	
	public double getSaldo(int numero) {
		if (verificaConta(numero)) {
			Conta conta = getConta(numero);
			 return conta.getSaldo();
		} else {
			System.out.println("Conta Inexistente");
		}
		return 0;
	}
	
	public void sacar(int numero, double valor) {
		if(verificaConta(numero)) {
			Conta conta = getConta(numero);
			conta.saca(valor);
		}
	}
	
	public String toString() {
		String dados ="";
		for(int i=0; i<listaContas.size(); i++) {
			dados += listaContas.get(i).toString()+"\n";
		}
		return dados;
	}
	
	public String dadosConta(int numero) {
		if (verificaConta(numero)) {
			Conta conta = getConta(numero);
			return conta.toString();
		}
		return null;
	}
	
	//Metodos do banco
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public int getNumeroBco() {return numeroBco;}
	public void setNumeroBco(int numeroBco) {this.numeroBco = numeroBco;}
	public int getAgencia() {return agencia;}
	public void setAgencia(int agencia) {this.agencia = agencia;
	}
	
}
