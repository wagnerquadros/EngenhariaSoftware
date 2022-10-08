
public class Cliente {

		private String nome;
		private long cpf;
		private String cidade;
		private String estado;
		
		public Cliente (String nome, long cpf, String cidade, String estado) {
			this.nome = nome;
			this.cpf = cpf;
			this.cidade = cidade;
			this.estado = estado;
		}
		
		public String getNome() { return this.nome;}
		public long getCPF() {return this.cpf;}
		public String getCidade() {return this.cidade;}
		public String getEstado() {return this.estado;}
		
		
		public void setNome(String nome) {this.nome = nome;}
		public void setCPF(long cpf) {this.cpf = cpf;}
		public void setCidade(String cidade) {this.cidade = cidade;}
		public void setEstado(String estado) {this.estado = estado;}
		
		
}
