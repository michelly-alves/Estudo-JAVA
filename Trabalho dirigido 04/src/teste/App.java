package teste;

import java.util.Scanner;

import empresa.Funcionario;
import empresa.OperacaoFuncionario;


public class App {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Numero de funcionarios: ");
			int N = scan.nextInt();
			scan.nextLine();
			Funcionario[] vet = new Funcionario[N];
			int i = 0;
			for (i = 0; i < N; i++) {
				System.out.print("Nome do funcionario: ");
				String nome = scan.nextLine();
				System.out.print("CPF do funcionario: ");
				String cpf = scan.nextLine();
				System.out.print("Sexo do funcionário (F/M): ");
				char sexo = scan.next().charAt(0);
				while(sexo != 'F' && sexo != 'f' && sexo != 'm' && sexo != 'M' ) {
					System.out.print("Sexo do funcionário (F/M): ");
					 sexo = scan.next().charAt(0);
				}
				System.out.print("Salario Bruto do funcionário: ");
				double salarioBruto = scan.nextDouble();
				scan.nextLine();
				System.out.print("Ano de Nascimento do funcionario: ");
				String dataNascimento = scan.nextLine();
				vet[i] = new Funcionario(nome, cpf, sexo, salarioBruto, dataNascimento);
				System.out.println();
			}

			
			for (i = 0; i < N; i++) {
				
				System.out.println("Idade" + vet[0].calculaIdade(vet[0].getDataNascimento(), vet, N));
				System.out.println("Salario liquido" + vet[0].calculaSalarioLiquido(N));
				System.out.println("Vefifica funcionario"
						+ vet[0].verificaFuncionario(vet[0].getNome(), vet[0].getCpf(), vet[0].getSexo(), vet, N));
				System.out.println("Valida data Admissao" + vet[0].validaDataAdmissao(vet, N));
				System.out.println("Valida CPF" + vet[0].validaCpf(vet[0].getCpf()));
				System.out.println("Valida data de nascimento" + vet[0].validaDataNascimento(vet[0].getDataNascimento(), vet, N));
				System.out.println(vet[i].toString());
				
			}
				System.out.println("Verifica dados"+OperacaoFuncionario.verificaDados(vet, N, vet[0].getDataNascimento(), vet[0].getCpf(), vet[0].getNome(), vet[0].getSexo()));
				System.out.println("Sexo feminino: "+OperacaoFuncionario.contaGeneroFeminino(vet, vet[0].getSexo(), N));
				OperacaoFuncionario.imprimeIdadeMaiorMenor(vet, vet[0].getDataNascimento(), N);
				OperacaoFuncionario.ImprimeMaiorMenorSalario(vet, vet[0].getSalarioBruto(), N);
				

			scan.close();
		}
	}

}
