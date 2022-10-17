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
				for(i=0;i<N;i++) {
					System.out.println("");
					vet[i].calculaSalarioLiquido(vet, N,vet[i].getSalarioBruto()) ;
					vet[i].calculaIdade(vet[i].getDataNascimento(), vet, N);
					System.out.println(vet[i].toString());
					
				if(OperacaoFuncionario.verificaDados(vet, N, vet[0].getDataNascimento(), vet[0].getCpf(), vet[0].getNome(), vet[0].getSexo()) == true) {
					System.out.printf("Dados do funcionario %s corretos!", vet[i].getNome());
				}else {
					System.out.printf("Dados do funcionario %s incorretos!", vet[i].getNome());
				}
				}
				System.out.println("");

				
				System.out.println("\nQuantidade de funcionarios com o sexo feminino: "+OperacaoFuncionario.contaGeneroFeminino(vet, vet[0].getSexo(), N));
				OperacaoFuncionario.imprimeIdadeMaiorMenor(vet, vet[0].getDataNascimento(), N);
				OperacaoFuncionario.ImprimeMaiorMenorSalario(vet, vet[0].getSalarioBruto(), N);


			scan.close();
		}
	}

}
