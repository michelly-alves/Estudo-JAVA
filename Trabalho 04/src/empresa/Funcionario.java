package empresa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Funcionario {
	private String cpf;
	private String nome;
	private char sexo;
	private double salarioBruto;
	private String dataAdmissao;
	private String dataNascimento;
	private int idadeFuncionario;
	private double salarioLiquido;
	public Boolean valido;

	public Funcionario(String nome, String cpf, LocalDate dataAdmissao) {
		this.setCpf(cpf);
		this.setNome(nome);

	}

	public Funcionario(String nome, String cpf, char sexo, double salarioBruto, String dataNascimento,
			String dataAdmissao) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setSalarioBruto(salarioBruto);
		this.setSexo(sexo);
		this.setDataAdmissao(dataAdmissao);
	}

	private void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;

	}

	public String getDataAdmissao() {

		return dataAdmissao;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public double setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
		return salarioLiquido;
	}

	public int getIdadeFuncionario() {
		return idadeFuncionario;
	}

	public Date ModificaStringDataNascimento(String dataNascimento) {
		Date dataInicial = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
			String strDataInicial = dataNascimento;
			try {
				dataInicial = sdf.parse(strDataInicial);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		

		return dataInicial;

	}

	public Date ModificaStrignDataAdmissao(String dataNascimento) {
		Date dataFinal = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
			String strDataFinal = dataAdmissao;
			try {
				dataFinal = sdf.parse(strDataFinal);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		
		return dataFinal;

	}

	public int calculaIdade(String dataNascimento) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date DataFinal = new Date();

		int ano1 = Integer.parseInt(sdf.format(this.ModificaStringDataNascimento(dataNascimento)));
		int ano2 = Integer.parseInt(sdf.format(DataFinal));
		idadeFuncionario = ano2 - ano1;
		return this.idadeFuncionario;

	}

	public Boolean validaDataNascimento(String dataNascimento) {
		Date dataInicial = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
			String strDataInicial =dataNascimento;
			try {
				dataInicial = sdf.parse(strDataInicial);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int ano1 = Integer.parseInt(sdf.format(dataInicial));
			if (ano1 < 1920) {
				valido = false;
			} else {
				valido = true;
			
		}
		return valido;
	}

	public Boolean validaDataAdmissao(String dataAdmissao) {
		Date dataFinal = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	
			String strDataFinal = dataAdmissao;
			try {
				dataFinal = sdf.parse(strDataFinal);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int ano2 = Integer.parseInt(sdf.format(dataFinal));
			if (ano2 < 1995) {
				valido = false;
			} else {
				valido = true;
			}
		
		return valido;
	}

	public Boolean verificaFuncionariosIguais(String nome, String cpf, char sexo, Funcionario[] vet, int N) {
		int i = 0, j = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				if ((vet[i].nome.equals(vet[j].nome )) && (vet[i].cpf.equals(vet[j].cpf)) &&
					(vet[i].sexo == vet[j].sexo)) {
					valido = false;
				} else {
					valido = true;
				}
			}
		}
		return valido;
	}

	public boolean validaCpf(String cpf) {
		if (cpf.length() == 14) {
			return true;
		} else {
			return false;
		}

	}

	public double calculaSalarioLiquido(double salarioBruto) {
		salarioLiquido = salarioBruto;

			if (salarioBruto <= 3000) {
				salarioLiquido = salarioBruto - (salarioBruto * 0.17);
			} else if (salarioBruto > 3000) {
				salarioLiquido = salarioBruto - (salarioBruto * 0.27);
			}
		
		return this.salarioLiquido;
	}

	public String toString() {
		return "Nome:" + this.nome + "\nSexo:" + this.sexo + "\nCPF " + this.cpf + "\nSalario bruto $"
				+ this.salarioBruto + "\nData de nascimento:" + this.dataNascimento + "\nSalario liquido:"
				+ this.salarioLiquido +"\nIdade"+ this.idadeFuncionario;

	}

}