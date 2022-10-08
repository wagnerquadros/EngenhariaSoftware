
public class Conta {

	private int numero;
	private Cliente cliente;
	private double saldo;
	
	
	public Conta(int numero, Cliente titular) {
		this.numero = numero;
		this.cliente = titular;
		saldo = 0;
	}

	public int getNumero() {return numero;}
	public Cliente getCliente() {return cliente;}
	public String getTitular() {return cliente.getNome();}
	public double getSaldo() {return saldo;}
	
	public void setNumero(int numero) {this.numero = numero;}
	public void setTitular(String titular) {this.cliente.setNome(titular);}
	public void setSaldo(double valor) {this.saldo = valor;}
	
	
	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}

	public void saca (double valor) {
		if (verificaSaldo(valor)) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente, saldo atual: " + this.getSaldo());
		}
	}
	
	public void transferir (Conta origem, Conta destino, double valor) {
		if (verificaSaldo(valor)) {
			origem.saca(valor);
			destino.deposita(valor);
			
		} else {
			System.out.println("Saldo insuficiente, saldo atual: " + origem.getSaldo());
		}
	}
	
	private boolean verificaSaldo(double valor) {
		if (valor <= this.saldo) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Conta [Numero: " + numero + ", Titular: " + cliente.getNome() + ", Saldo: " + saldo + "]";
	}
	
}
