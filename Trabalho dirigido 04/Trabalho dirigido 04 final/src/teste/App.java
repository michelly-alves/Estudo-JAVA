package teste;

import java.text.ParseException;
import java.util.Scanner;

import empresa.Funcionario;
import empresa.OperacaoFuncionario;

public class App {
	public static void main(String[] args) throws ParseException {
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
				while (sexo != 'F' && sexo != 'f' && sexo != 'm' && sexo != 'M') {
					System.out.print("Sexo do funcionário (F/M): ");
					sexo = scan.next().charAt(0);
				}
				System.out.print("Salario Bruto do funcionário: ");
				double salarioBruto = scan.nextDouble();
				scan.nextLine();
				System.out.print("Ano de Nascimento do funcionario: ");
				String dataNascimento = scan.nextLine();

				System.out.print("Ano de Admissao do funcionario: ");
				String dataAdmissao = scan.nextLine();
				vet[i] = new Funcionario(nome, cpf, sexo, salarioBruto, dataNascimento, dataAdmissao);
				System.out.println();
			}

			for (i = 0; i < N; i++) {

				vet[i].calculaSalarioLiquido(vet[i].getSalarioBruto());
				vet[i].calculaIdade(vet[i].getDataNascimento(), vet, N);
				System.out.println(vet[i].toString());
				System.out.println("");

			}
			OperacaoFuncionario.imprimeIdadeMaiorMenor(vet, vet[0].getDataNascimento(), N);
			System.out.println("Quantidade de funcionarias do sexo FEMININO: "
					+ OperacaoFuncionario.contaGeneroFeminino(vet, vet[0].getSexo(), N));
			System.out.println("Quantidade de funcionarias do sexo MASCULINO: "
					+ OperacaoFuncionario.contaGeneroMasculino(vet, vet[0].getSexo(), N));
			OperacaoFuncionario.ImprimeMaiorMenorSalario(vet, vet[0].getSalarioBruto(), N);
			System.out.println("");
			scan.close();
		}
	}

}