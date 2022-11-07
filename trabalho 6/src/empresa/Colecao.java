package empresa;

public interface Colecao {
	
	public Boolean inserir(Pessoa p);
	public Boolean remover();
	public Boolean remover(int indice);
	public void atualizar(int indice, Pessoa p);
	public Boolean pesquisar(Pessoa p);
	public Boolean colecaoEstaVazia();
	public void imprimirDadosColecao();
	public Pessoa retornarObjeto(int indice);
}
