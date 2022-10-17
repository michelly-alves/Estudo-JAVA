package empresa;

public class OperacaoFuncionario {

	public static Boolean verificaDados(Funcionario[] vet, int N, String dataNascimento, String cpf, String nome,
			char sexo) {
		int i = 0;
		Boolean verifica = true;
		for (i = 0; i < N; i++) {
			if (vet[i].validaCpf(vet, N, cpf) == true && vet[i].validaDataAdmissao(vet, N) == true
					&& vet[i].validaDataNascimento(dataNascimento, vet, N) == true && vet[i].verificaFuncionariosIguais(nome, cpf,sexo,vet, N) == true) {
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
		double menorSalario = vet[0].calculaSalarioLiquido(vet, N,salarioBruto);
		double maiorSalario = vet[0].calculaSalarioLiquido(vet, N,salarioBruto);
		int indice1 =0, indice2 =0;
		int i = 0, j=0;
		for (i = 0; i < N; i++) {
			if (menorSalario > vet[i].calculaSalarioLiquido(vet, N,salarioBruto)) {
				menorSalario = vet[i].calculaSalarioLiquido(vet, N, salarioBruto);
				indice1 = i;
			}
		}
		for(j=0;j<N;j++) {
			if (maiorSalario < vet[j].calculaSalarioLiquido(vet, N,salarioBruto)) {
				maiorSalario = vet[j].calculaSalarioLiquido(vet, N, salarioBruto);
				indice2 = j;
			}
		}
		System.out.println("O funcionario de menor salario é: " + vet[indice1].getNome() + " e o funcionario de maior salario é: " + vet[indice2].getNome());
	}

	public static void imprimeIdadeMaiorMenor(Funcionario[] vet, String dataNascimento, int N) {

		int menorIdade = vet[0].calculaIdade(dataNascimento, vet, N);
		int maiorIdade = vet[0].calculaIdade(dataNascimento, vet, N);

		int indiceNovo = 0, indiceVelho = 0;
		int i = 0, j=0;
		for (i = 0; i < N; i++) {

			if (menorIdade > vet[i].calculaIdade(dataNascimento, vet, N)) {
				menorIdade = vet[i].calculaIdade(dataNascimento, vet, N);
				indiceNovo = i;
			}
		}
		for (j = 0; j < N; j++) {

			if (maiorIdade < vet[j].calculaIdade(dataNascimento, vet, N)) {
				maiorIdade = vet[j].calculaIdade(dataNascimento, vet, N);
				indiceVelho = j;
			}
		}
		System.out.println("Funcionario " +vet[indiceVelho].getNome() + " é o funcionario mais velho com "
				+ maiorIdade + " anos");
		System.out.println("Funcionario " + vet[indiceNovo].getNome() + " é o funcionario mais jovem com "
				+ menorIdade + " anos");
	}
}
