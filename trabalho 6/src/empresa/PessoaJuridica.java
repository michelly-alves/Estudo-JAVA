package empresa;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	private Calendar dataCriacao;
	private int idade;

	public PessoaJuridica(String nome, String cnpj) {
		this.cnpj = cnpj;
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCpf(String cnpj) {
		if (this.validarDocumento() == true) {
			this.cnpj = cnpj;
		}
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public Calendar setDataCriacao(int Ano, int Mes, int Dia) {
		this.dataCriacao = GregorianCalendar.getInstance();
		this.dataCriacao.set(Ano, Mes, Dia);
		return dataCriacao;
	}

	public Boolean validarDocumento() {
		if (cnpj.length() == 14) {
			return true;
		} else {
			return false;
		}

	}

	public int calcularIdade(int Dia, int Mes, int Ano) {
		Calendar hoje = GregorianCalendar.getInstance();
		int meses = (hoje.get(Calendar.YEAR) * 12 + hoje.get(Calendar.MONTH))
				- (dataCriacao.get(Calendar.YEAR) * 12 + dataCriacao.get(Calendar.MONTH));
		return this.idade = meses / 12;
	}

	public Boolean equals(String cnpj) {
		if (this.cnpj.equals(cnpj)) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "PessoaJuridica \nCNPJ:" + this.cnpj + " \nNome:" + this.nome + "\nIdade:" + this.idade;
	}
}
