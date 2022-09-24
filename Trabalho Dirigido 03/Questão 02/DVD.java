
public class DVD {
	public String Titulo;
	public String Codigo;
	public int AnoLancamento;
	public String GeneroMusical;
	public int valor;
	public String Gravadora;
	public Autor aut;
	
	public void informações (DVD[] dvd, int N, Autor[] aut ) {
		int i = 0;
		for(i=0;i<N;i++) {
			System.out.println();
			System.out.println("Titulo: " + dvd[i].Titulo);
			System.out.println("Codigo: " + dvd[i].Codigo);
			System.out.println("Ano de lançamento: " + dvd[i].AnoLancamento);
			System.out.println("Genero musical: " + dvd[i].GeneroMusical);
			System.out.println("Valor pago: " + dvd[i].valor);
			System.out.println("Gravadora: " + dvd[i].Gravadora);
			System.out.println("Autor: " + aut[i].Nome);
			System.out.println("Atuação (Carreira solo ou não): " + aut[i].AtuaSolo);
			System.out.println();
		}
		
	}
	
	public void AnoLancamentos(DVD[] dvd, int N) {
		int i=0, j=0,indice =0, contador =0;
		int [] x;
		x = new int [N];
		if(N>1) {
			for(i=0;i<N;i++) {
				for(j=0;j<N;j++) {
					if(dvd[i].AnoLancamento == dvd[j].AnoLancamento && j!=i) {
						x[i]= dvd[i].AnoLancamento;
						indice = i;
						contador++;
					}
				}
			}
		}if(contador == 0){
			System.out.println("Houve apenas um DVD lançado a cada ano.");
		}if(contador>=2)
		System.out.println("Ano com mais lançamentos: "+dvd[indice].AnoLancamento);
		
		
	}
	public int MaiorValor(int N, DVD[] dvd) {
		int maior = dvd[0].valor;
		int i=0;
		for(i=0;i<N;i++) {
			if(maior < dvd[i].valor) {
				maior = dvd[i].valor;
			}
		}
		return maior;
	}
	public int MenorValor(int N, DVD[] dvd) {
		int menor = dvd[0].valor;
		int i=0;
		for(i=0;i<N;i++) {
			if(menor > dvd[i].valor) {
				menor = dvd[i].valor;
			}
		}
		return menor;
	}
	public int somaValor(int N, DVD[]dvd) {
		int i = 0, soma = 0;
		for(i=0;i<N;i++) {
			soma += dvd[i].valor;
		}
		return soma;
	}
	public void GostoMusical(DVD[] dvd, int N) {
		int i=0, j=0,indice =0, contador = 0;
		String [] x;
		x = new String [N];
		if(N>1) {
			for(i=0;i<N;i++) {
				for(j=0;j<N;j++) {
					if(dvd[i].GeneroMusical.equals(dvd[j].GeneroMusical) && j!=i) {
						x[i]= dvd[i].GeneroMusical;
						indice = i;
						contador++;
					}
				}
			}
		}if (contador == 0){
			System.out.println("Não há um genero musical preferido definido pois todos os DVDs são de generos diferentes.");
		}
		if(contador>=2) {
		System.out.println("Genero favorito: "+dvd[indice].GeneroMusical);
		}
		
		
	}
	public void AutorSolo(DVD[] dvd, Autor[] aut, int N) {
		int i=0;
		for(i=0;i<N;i++) {
			if(aut[i].AtuaSolo.equals("Sim") || aut[i].AtuaSolo.equals("sim") ) {
				System.out.println();
				System.out.println("_____Autores Solo_____");
				System.out.println("Titulo: " + dvd[i].Titulo);
				System.out.println("Codigo: " + dvd[i].Codigo);
				System.out.println("Ano de lançamento: " + dvd[i].AnoLancamento);
				System.out.println("Genero musical: " + dvd[i].GeneroMusical);
				System.out.println("Valor pago: " + dvd[i].valor);
				System.out.println("Gravadora: " + dvd[i].Gravadora);
				System.out.println("Autor: " + aut[i].Nome);
				System.out.println("Atuação (Carreira solo ou não): " + aut[i].AtuaSolo);
				System.out.println();
			}
		}
	}
}
