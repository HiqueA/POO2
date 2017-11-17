
public class Passageiro {

	private String nome;
	private String cpf;
	private Categoria categoria;

	public Passageiro() {
		super();
	}

	public Passageiro(String nome, String cpf, Categoria categoria) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Passageiro [nome=" + nome + ", cpf=" + cpf + ", categoria=" + categoria + "]";
	}

}
