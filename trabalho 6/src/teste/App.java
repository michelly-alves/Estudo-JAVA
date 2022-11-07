package teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import empresa.ColecaoPessoa;
import empresa.Pessoa;
import empresa.PessoaFisica;
import empresa.PessoaJuridica;

public class App {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			List<Object> list = new ArrayList<>(100);
			System.out.print("Tamanho do vetor de pessoas:");
			int tam = scan.nextInt();
			scan.nextLine();

			Pessoa[] vet = new Pessoa[tam];

			ColecaoPessoa colecaoPessoa = new ColecaoPessoa();

			for (int i = 0; i < tam; i++) {
				list.add(vet[i]);

				System.out.print("Digite o nome:");
				String nome = scan.nextLine();
				System.out.print("fisica(CPF) ou juridica (CNPJ)?");
				String opcao = scan.next();
				scan.nextLine();
				while (!opcao.equals("CPF") && !opcao.equals("CNPJ")) {
					System.out.print("Fisica(CPF) ou juridica(CNPJ)?");
					opcao = scan.next();
					scan.nextLine();
				}
				if (opcao.equals("CPF")) {

					System.out.print("Digite o CPF:");
					String cpf = scan.nextLine();
					System.out.print("Digite a data de nascimento(dd mm aaaa):");
					int Dia = scan.nextInt();
					int Mes = scan.nextInt();
					int Ano = scan.nextInt();
					scan.nextLine();
					colecaoPessoa = new ColecaoPessoa(vet, i);
					PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf, new ColecaoPessoa(vet, i));
					pessoaFisica.setDataNascimento(Ano, Mes, Dia);

					colecaoPessoa.inserir(pessoaFisica);
					vet[i] = pessoaFisica;
					pessoaFisica.calcularIdade(Dia, Mes, Ano);
					if (pessoaFisica.getCpf().equals(cpf) == false) {
						System.out.println("Pessos Fisica Igual a outra");
					}
				} else {

					System.out.print("Digite o CNPJ:");
					String cnpj = scan.nextLine();
					System.out.println("Digite a data de criaçao (dd mm aaaa):");
					int Dia = scan.nextInt();
					int Mes = scan.nextInt();
					int Ano = scan.nextInt();
					scan.nextLine();
					PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
					pessoaJuridica.setDataCriacao(Ano, Mes, Dia);
					vet[i] = pessoaJuridica;
					pessoaJuridica.calcularIdade(Dia, Mes, Ano);
					if (pessoaJuridica.getCnpj().equals(cnpj) == false) {
						System.out.println("Pessos Juridica Igual a outra");
					}
				}
				System.out.println();
			}

			for (int i = 0; i < tam; i++) {
				System.out.println();
				System.out.println(vet[i].toString());
				System.out.printf("POSIÇÃO %d", i);
				System.out.println();
			}
			System.out.println();
			System.out.println("REMOÇÃO");
			System.out.print("Digite a posição");
			int indice = scan.nextInt();
			colecaoPessoa.remover(indice);
			if (colecaoPessoa.remover(indice) == false) {
				System.out.println("Objeto removido.");
			}

			System.out.println();
			System.out.println("PESQUISA");
			System.out.print("Digite a posição");
			int pesquisar = scan.nextInt();
			if (colecaoPessoa.pesquisar(vet[pesquisar]) == false) {
				System.out.println("Objeto não existe.");
			}else {
				System.out.println(colecaoPessoa.retornarObjeto(indice));
			}

			System.out.println();
			System.out.println("ATUALIZAR");
			System.out.print("Digite a posição");
			indice = scan.nextInt();
			scan.nextLine();
			System.out.print("Digite o nome");
			String nome = scan.nextLine();
			System.out.print("fisica(CPF) ou juridica (CNPJ)?");
			String opcao = scan.next();
			scan.nextLine();
			while (!opcao.equals("CPF") && !opcao.equals("CNPJ")) {
				System.out.print("Fisica(CPF) ou juridica(CNPJ)?");
				opcao = scan.next();
				scan.nextLine();
			}
			if (opcao.equals("CPF")) {

				System.out.print("Digite o CPF:");
				String cpf = scan.nextLine();
				System.out.print("Digite a data de nascimento(dd mm aaaa):");
				int Dia = scan.nextInt();
				int Mes = scan.nextInt();
				int Ano = scan.nextInt();
				scan.nextLine();
				colecaoPessoa = new ColecaoPessoa(vet, indice);
				PessoaFisica pessoaFisica = new PessoaFisica(nome, cpf, new ColecaoPessoa(vet, indice));
				pessoaFisica.setDataNascimento(Ano, Mes, Dia);

				colecaoPessoa.inserir(pessoaFisica);
				vet[indice] = pessoaFisica;
				pessoaFisica.calcularIdade(Dia, Mes, Ano);
				if (pessoaFisica.getCpf().equals(cpf) == false) {
					System.out.println("Pessos Fisica Igual a outra");
				}
			} else {

				System.out.print("Digite o CNPJ:");
				String cnpj = scan.nextLine();
				System.out.println("Digite a data de criaçao (dd mm aaaa):");
				int Dia = scan.nextInt();
				int Mes = scan.nextInt();
				int Ano = scan.nextInt();
				scan.nextLine();
				PessoaJuridica pessoaJuridica = new PessoaJuridica(nome, cnpj);
				pessoaJuridica.setDataCriacao(Ano, Mes, Dia);
				vet[indice] = pessoaJuridica;
				pessoaJuridica.calcularIdade(Dia, Mes, Ano);
				if (pessoaJuridica.getCnpj().equals(cnpj) == false) {
					System.out.println("Pessos Juridica Igual a outra");
				}
			}
			colecaoPessoa.atualizar(indice, vet[indice]);
			if (colecaoPessoa.pesquisar(vet[indice]) == true) {
				System.out.println("Objeto adcionado com sucesso.");
			}
				System.out.println();
				colecaoPessoa.imprimirDadosColecao();
			
		
		}

	}
}
