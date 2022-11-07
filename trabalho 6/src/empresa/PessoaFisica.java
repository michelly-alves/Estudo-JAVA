package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaFisica extends Pessoa {

	private String cpf;
	private Calendar dataNascimento;
	private int idade;

	public PessoaFisica(String nome, String cpf, ColecaoPessoa colecaoPessoa) {
		this.cpf = cpf;
		this.nome = nome;
	}

	public PessoaFisica() {
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if (this.validarDocumento() == true) {
			this.cpf = cpf;
		}
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public Calendar setDataNascimento(int Ano, int Mes, int Dia) {
		this.dataNascimento = GregorianCalendar.getInstance();
		this.dataNascimento.set(Ano, Mes, Dia);
		return dataNascimento;
	}

	public Boolean validarDocumento() {
		if (cpf.length() == 18) {
			return true;
		} else {
			return false;
		}

	}

	public int calcularIdade(int Dia, int Mes, int Ano) {
		Calendar hoje = GregorianCalendar.getInstance();
		int meses = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
				- (dataNascimento.get(Calendar.YEAR) * 12 + dataNascimento.get(Calendar.MONTH));
		return this.idade = meses / 12;
	}

	public Boolean equals(String cpf) {
		if (this.cpf.equals(this.cpf)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "PessoaFisica \nCPF: " + this.cpf + " \nNome:" + this.nome + " \nIdade:" + this.idade;
	}

}
