package empresa;

public class OperacaoFuncionario {

	public static Boolean verificaDados(Funcionario[] funcionario, int tamFunc, String dataNascimento, String cpf,
			String nome, char sexo, String dataAdmissao) {
		int i = 0;
		for (i = 0; i < tamFunc; i++) {
			if (funcionario[i].validaCpf(cpf) == true && funcionario[i].validaDataAdmissao(dataAdmissao) == true
					&& funcionario[i].validaDataNascimento(dataNascimento) == true) {
				return true;
			} else {
				if (funcionario[i].validaCpf(funcionario[i].getCpf()) == false) {
					System.out.println("CPF invalido!");
				}
				if (funcionario[i].validaDataAdmissao(funcionario[i].getDataAdmissao()) == false) {
					System.out.println("Data de admissão incorreta!");
				}
				if (funcionario[i].validaDataNascimento(funcionario[i].getDataNascimento()) == false) {
					System.out.println("Data de nascimento incorreta!");
				}
				if (funcionario[i].verificaFuncionariosIguais(funcionario[i].getNome(), funcionario[i].getCpf(),
						funcionario[i].getSexo(), funcionario, tamFunc) == false && tamFunc > 1) {
					System.out.println("Funcionário igual a outro já cadastrado!");
				}
			}
		}
		return false;
	}

	public static int contaGeneroFeminino(Funcionario[] vet, char sexo, int N) {
		int quantidade = 0, i = 0;
		for (i = 0; i < N; i++) {
			if (vet[i].getSexo() == 'F' || vet[i].getSexo() == 'f') {
				quantidade++;
			}
		}
		return quantidade;
	}

	public static int contaGeneroMasculino(Funcionario[] vet, char sexo, int N) {
		int quantidade = 0, i = 0;
		for (i = 0; i < N; i++) {
			if (vet[i].getSexo() == 'M' || vet[i].getSexo() == 'm') {
				quantidade++;
			}
		}
		return quantidade;
	}

	public static void ImprimeMaiorMenorSalario(Funcionario[] vet, double salarioBruto, int N) {
		double menorSalario = vet[0].calculaSalarioLiquido(salarioBruto);
		double maiorSalario = vet[0].calculaSalarioLiquido(salarioBruto);
		int i = 0, j = 0, indice = 0, indice2 = 0;
		for (i = 0; i < N; i++) {
			if (menorSalario < vet[i].getSalarioLiquido()) {
				menorSalario = vet[i].getSalarioLiquido();
				indice2 = i;

			}
			for (j = 0; j < N; j++) {
				if (maiorSalario > vet[j].getSalarioLiquido()) {
					maiorSalario = vet[j].getSalarioLiquido();
					indice = j;
				}
			}

		}
		System.out.println("O MENOR salario é de:" + vet[indice].getNome());
		System.out.println("O MAIOR salario é de:" + vet[indice2].getNome());
	}

	public static void imprimeIdadeMaiorMenor(Funcionario[] vet, String dataNascimento, int N) {
		double menorIdade = vet[0].calculaIdade(dataNascimento, vet, N);
		double maiorIdade = vet[0].calculaIdade(dataNascimento, vet, N);
		int i = 0, indice = 0, indice2 = 0;
		for (i = 0; i < N; i++) {
			if (menorIdade > vet[i].getIdadeFuncionario()) {
				menorIdade = vet[i].getIdadeFuncionario();
				indice2 = i;

			}
			if (maiorIdade < vet[i].getIdadeFuncionario()) {
				maiorIdade = vet[i].getIdadeFuncionario();
				indice = i;

			}

		}
		System.out.println("O Funcionario MAIS VELHO é: " + vet[indice].getNome() + " com " + maiorIdade + "anos.");
		System.out.println("O Funcionario MAIS JOVEM é: " + vet[indice2].getNome() + " com " + menorIdade + " anos.");

	}
}