import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		Contatos[] contato = new Contatos[100];
		int menu = 0, N = 0;
		int i = 0;

		System.out.println("Quantos contatos deseja adicionar? ");
		N = sc.nextInt();
		for (int j = 0; j < N; j++) {
			if (contato[j] == null) {
				System.out.print("Nome do contato: ");
				String Name = scan.nextLine();
				System.out.print("Numero do contato: ");
				String Telefone = scan.nextLine();
				System.out.print("Email do contato: ");
				String Email = scan.nextLine();
				contato[j] = new Contatos(Name, Telefone, Email);
				System.out.println();
			}
		}
		Agenda.menu();
		menu = sc.nextInt();
		
			switch (menu) {
			case 1:
				String nomeAtt;
				int campoAtt;
				System.out.println("Digite o numero do contato que deve ser atualizado: ");
				nomeAtt = scan.nextLine();
				for (i = 0; i < contato.length; i++) {
					if (nomeAtt.equals(contato[i].getTelefone())) {
						System.out.println("Qual campo deseja atualizar? ");
						System.out.println("1-Nome.");
						System.out.println("2-Telefone.");
						System.out.println("3-Email.");
						campoAtt = sc.nextInt();

						switch (campoAtt) {
						case 1:
							System.out.println("Novo nome:");
							String Name = scan.nextLine();
							Agenda.atualizarContatoNome(contato, Name, N );
							break;
						case 2:
							System.out.println("Novo Telefone:");
							String Telefone = scan.nextLine();
							Agenda.atualizarContatoTelefone(contato, Telefone, N);
							break;
						case 3:
							System.out.println("Novo Email:");
							String Email = scan.nextLine();
							Agenda.atualizarContatoEmail(contato, Email, N);
							break;
						}
					}break;
				}
				break;
			case 2:
				String ContatoDelet;
				System.out.println("Qual contato deseja deletar, pelo numero?");
				ContatoDelet = scan.nextLine();
				Agenda.deletarContato(contato, ContatoDelet, N);	
				break;
			case 3:
				String contatoPesquisa;
				System.out.print("Contato que deseja pesquisar, por numero: ");
				contatoPesquisa = scan.nextLine();
				Agenda.pesquisarContato(contato, contatoPesquisa, N);
				break;
			case 4:
				System.out.println("Obrigada por utilizar nosso sistema!");
				break;
			}
		sc.close();
		scan.close();

	}

}
