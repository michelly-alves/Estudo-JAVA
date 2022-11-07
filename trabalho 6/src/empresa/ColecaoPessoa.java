package empresa;

public class ColecaoPessoa implements Colecao {
	Pessoa[] dados;
	int posicaoCorrente;

	public ColecaoPessoa(Pessoa[] dados, int posicaoCorrente) {
		this.dados = dados;
		this.posicaoCorrente = posicaoCorrente;
	}

	public ColecaoPessoa() {

	}

	public Pessoa[] getDados() {
		return dados;
	}

	public void setDados(Pessoa[] dados) {
		this.dados = dados;
	}

	public int getPosicaoCorrente() {
		return posicaoCorrente;
	}

	public void setPosicaoCorrente(int posicaoCorrente) {
		this.posicaoCorrente = posicaoCorrente;
	}

	@Override
	public Boolean inserir(Pessoa p) {
		if(this.dados == null) {
			this.dados[this.posicaoCorrente] = p;
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public Boolean remover() {
		if (this.dados[posicaoCorrente] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Boolean remover(int indice) {
		if (this.dados[this.posicaoCorrente] == dados[indice] && this.remover() == true) {
			this.dados[this.posicaoCorrente] = null;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public Boolean colecaoEstaVazia() {

		if (this.dados.length == 0) {
			return false;
		} else {
			return true;
		}

	}

	@Override
	public void imprimirDadosColecao() {
		if (this.colecaoEstaVazia() == true) {
			for (int i = 0; i < dados.length; i++) {
				System.out.println("Funcionario" + this.dados[i]);
				System.out.println();
			}
		}else {
			System.out.println("Coleção Vazia!");
		}

	}
	@Override
	public Pessoa retornarObjeto(int indice ) {
		return this.dados[indice];
	}

	@Override
	public void atualizar(int indice, Pessoa p) {
		if(this.colecaoEstaVazia() == true) {
			this.dados[this.posicaoCorrente] = this.retornarObjeto(indice);
		}
	}

	@Override
	public Boolean pesquisar(Pessoa p) {
		if(this.colecaoEstaVazia() == true && p == this.dados[this.posicaoCorrente]) {
			this.retornarObjeto(this.posicaoCorrente);
			return true;	
		}else {
			return false;
		}
	}

}