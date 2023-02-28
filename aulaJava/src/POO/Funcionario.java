package POO;

public class Funcionario {

	private String nome, cidade;
	private int identificacao, idade, telefone;
	
	public Funcionario(int identificacao, String nome, int idade, int telefone, String cidade) {
		this.nome = nome;
		this.cidade = cidade;
		this.identificacao = identificacao;
		this.idade = idade;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int dataNascimento) {
		this.telefone = dataNascimento;
	}
	
	public void vizualizar() {
		System.out.println("\n\nFuncioário " + getIdentificacao() + " - " + getNome()
		+ "\nIdade: " + getIdade() 
		+ "\nContato: " + getTelefone()
		+ "\nCidade de Residência: " + getCidade());
	}
}
