package empresa;

public class OperacaoFuncionario {

	public static Boolean verificaDados(Funcionario[] vet, int N, String dataNascimento, String cpf, String nome,
			char sexo) {
		int i = 0;
		Boolean verifica = true;
		for (i = 0; i < N; i++) {
			if (vet[i].validaCpf(cpf) == true && vet[i].validaDataAdmissao(vet, N) == true
					&& vet[i].validaDataNascimento(dataNascimento, vet, N) == true
					&& vet[i].verificaFuncionariosIguais(nome, cpf, sexo, vet, N) == true) {
				verifica = true;
			} else {
				verifica = false;
			}
			}	
		return verifica;
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

	public static void ImprimeMaiorMenorSalario(Funcionario[] vet, double salarioBruto, int N) {
		double menorSalario = vet[0].calculaSalarioLiquido(salarioBruto, N, vet);
		double maiorSalario = vet[0].calculaSalarioLiquido(salarioBruto, N, vet);
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
		System.out.println("O menor salario é de: " + vet[indice].getNome() + " e o maior salario é de : "
				+ vet[indice2].getNome());
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
		System.out.println("O Funcionario de maior Idade é: " + vet[indice].getNome() + " com a idade:"+maiorIdade+" e o de menor idade é: "
				+ vet[indice2].getNome() + " com  a idade: "+menorIdade);

	}
}
