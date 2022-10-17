
	private String cpf;
	private String nome;
	private char sexo;
	private double salarioBruto;
	private double salarioLiquido;
	private Date dataAdmissao;
	private String dataNascimento;
	private int idadeFuncionario;
	public Boolean valido;

	public Funcionario(String nome, String cpf, LocalDate dataAdmissao) {
		this.setCpf(cpf);
		this.setNome(nome);

	}

	public Funcionario(String nome, String cpf, char sexo, double salarioBruto, String dataNascimento) {
		this.setCpf(cpf);
		this.setNome(nome);
		this.setDataNascimento(dataNascimento);
		this.setSalarioBruto(salarioBruto);
		this.setSexo(sexo);
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

	public int calculaIdade(String dataNascimento, Funcionario[] vet, int N) {
		Date dataInicial = null;
		int i = 0, idadeFuncionario = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		for (i = 0; i < N; i++) {
			String strDataInicial = vet[i].dataNascimento;
			try {
				dataInicial = sdf.parse(strDataInicial);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			this.dataAdmissao = new Date();

			int ano1 = Integer.parseInt(sdf.format(dataInicial));
			int ano2 = Integer.parseInt(sdf.format(dataAdmissao));
			vet[i].idadeFuncionario = ano2 - ano1;

		}

		return this.idadeFuncionario;

	}

	public Boolean validaDataNascimento(String dataNascimento, Funcionario[] vet, int N) {
		Date dataInicial = null;
		int i = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		for (i = 0; i < N; i++) {
			String strDataInicial = vet[i].dataNascimento;
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
		}
		return valido;
	}

	public Boolean validaDataAdmissao(Funcionario[] vet, int N) {
		int i = 0;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		for (i = 0; i < N; i++) {
			this.dataAdmissao = new Date();
			int ano2 = Integer.parseInt(sdf.format(dataAdmissao));
			if (ano2 < 1995) {
				valido = false;
			} else {
				valido = true;
			}
		}
		return valido;
	}

	public Boolean verificaFuncionariosIguais(String nome, String cpf, char sexo, Funcionario[] vet, int N) {
		int i = 0, j = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				if ((vet[i].nome == vet[j].nome && i != j) && (vet[i].cpf == vet[j].cpf && i != j)
						&& (vet[i].sexo == vet[j].sexo && i != j)) {
					valido = false;
				} else {
					valido = true;
				}
			}
		}
		return valido;
	}

	public boolean validaCpf(Funcionario[] vet, int N, String cpf) {
		for (int i = 0; i < N; i++) {
			if (vet[i].cpf.length() == 14) {
				return valido = true;
			} else {
				return valido = false;
			}
		}
		return valido;
	}
	

	public double calculaSalarioLiquido(Funcionario[] vet, int N,double salarioBruto) {
			salarioLiquido = salarioBruto;
		for(int i =0;i<N;i++) {
				if (vet[i].salarioBruto <= 3000) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.17);
		} else if (vet[i].salarioBruto > 3000) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.27);
		}
		}
	
		return this.salarioLiquido;
	}

	public String toString() {
		return "\nNome:" + this.nome + " \nSexo:" + this.sexo + " \nCPF " + this.cpf + " \nSalario bruto $"
				+ this.salarioBruto + " \nData de nascimento:" + this.dataNascimento + " \nSalario liquido:"
				+ this.salarioLiquido + " \nidade:" + this.idadeFuncionario;

	}

}
