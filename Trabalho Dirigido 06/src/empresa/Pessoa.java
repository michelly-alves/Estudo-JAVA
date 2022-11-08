package empresa;

public abstract class Pessoa {
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract Boolean validarDocumento();

	public abstract int calcularIdade(int Dia, int Mes, int Ano);

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + "]";
	}
}
