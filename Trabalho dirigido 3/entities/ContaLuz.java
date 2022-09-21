package entities;
public class ContaLuz {

	    public String codigoConta;
	    
	    public int consumoKh;
	    public int valor;
	    public String paga;

	    public int dialeitura;
	    public int mesleitura;
	    public int anoleitura;
	    public String dataVencimento;
	    public String dataPagamento;
	


public void contasNaoPagas(ContaLuz[] conta, int N, int i) {
		
			if(conta[i].paga.equals("N"))
			
			System.out.println("Conta não paga codigo: "+conta[i].codigoConta);
		}
	


public int mesconsumo(ContaLuz[] conta, int consumoKh, int N){
	 int menorConsumo = conta[0].consumoKh;
	 int i = 0, mes = 0 ;
	 for(i=0;i<N;i++) {
		 if(conta[i].consumoKh < menorConsumo) {
			 menorConsumo = conta[i].consumoKh;
			 mes = i;
		 }
	 }
	return conta[mes].mesleitura;
 }

public int mesMaiorConsumo(ContaLuz[] conta, int consumoKh, int N){
	 int maiorConsumo = conta[0].consumoKh;
	 int i = 0, mes = 0 ;
	 for(i=0;i<N;i++) {
		 if(conta[i].consumoKh > maiorConsumo) {
			 maiorConsumo = conta[i].consumoKh;
			 mes = i;
		 }
	 }
	return conta[mes].mesleitura;
}

public double mediaConsumo(ContaLuz[] conta, int consumoKh, int N) {
	double media;
	int soma = 0, i;
	for(i=0;i<N;i++) {
		soma+=conta[i].consumoKh;
	}
	return media = soma/N;

}

public void PagasAntes() {
	
}





}