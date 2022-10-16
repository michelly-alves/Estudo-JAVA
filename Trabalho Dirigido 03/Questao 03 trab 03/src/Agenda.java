
public class Agenda {
	
	public static void menu () {
		System.out.println("1-Atualizar contato.");
		System.out.println("2-Deletar contato.");
		System.out.println("3-Pesquisar contato.");
		System.out.println("4-Sair.");
	}
	
	public static void atualizarContatoNome(Contatos[] contato, String Name, int N ) {
		int i = 0;
		for(i=0;i<N;i++) {
		contato[i].setName(Name);
		System.out.println("Nome: " + contato[i].getName());
		System.out.println("Email: " + contato[i].getEmail());
		System.out.println("Telefone: " + contato[i].getTelefone());
		}
		
	}
	
	public static void atualizarContatoTelefone(Contatos[] contato, String Telefone, int N ) {
		int i = 0;
		for(i=0;i<N;i++) {
		contato[i].setName(Telefone);
		System.out.println("Nome: " + contato[i].getName());
		System.out.println("Email: " + contato[i].getEmail());
		System.out.println("Telefone: " + contato[i].getTelefone());
		}
		
	}
	
	public static void atualizarContatoEmail(Contatos[] contato, String Email, int N ) {
		int i = 0;
		for(i=0;i<N;i++) {
		contato[i].setName(Email);
		System.out.println("Nome: " + contato[i].getName());
		System.out.println("Email: " + contato[i].getEmail());
		System.out.println("Telefone: " + contato[i].getTelefone());
		}
		
	}
	
	public static void deletarContato(Contatos[] contato, String ContatoDelet, int N) {
		int i=0;
		for (i = 0; i < contato.length; i++) {
			if (ContatoDelet.equals(contato[i].getTelefone())) {
				contato[i].setName(null);
				contato[i].setEmail(null);
				contato[i].setTelefone(null);
				System.out.println("Contato deletado!");
				break;
			} else {
				System.out.println("Não há contato com esse numero.");

			}
		}
	}

	public static void pesquisarContato(Contatos[] contato, String contatoPesquisa, int N) {
		int i=0;
		for (i = 0; i < contato.length; i++) {
			if (contatoPesquisa.equals(contato[i].getTelefone())) {
				System.out.println("Nome: " + contato[i].getName());
				System.out.println("Email: " + contato[i].getEmail());
				System.out.println("Telefone: " + contato[i].getTelefone());
				break;
			}else {
				System.out.println("Não há contato com esse numero.");
				break;
			}
		}
	}
	
	public void adicionarContato() {
		
	}
}
