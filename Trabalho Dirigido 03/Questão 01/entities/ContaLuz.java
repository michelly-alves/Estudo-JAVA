package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
	


public void contasNaoPagas(ContaLuz[] conta, int N, String paga) {
	int i=0;
			for(i=0;i<N;i++) {
			if(conta[i].paga.contentEquals("nao")) {
			
			System.out.println();
			System.out.println("Conta de luz não paga:");
			System.out.println("Codigo: "+conta[i].codigoConta);
			System.out.println("Consumo: "+conta[i].consumoKh);
			System.out.println("Valor: "+conta[i].valor);
			System.out.println("Data de leitura: "+conta[i].dialeitura +"/"+conta[i].mesleitura+"/"+conta[i].anoleitura);
			System.out.println("Data de vencimento: "+conta[i].dataVencimento);
			System.out.println();
			}
			}
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
	
	int soma = 0, i;
	for(i=0;i<N;i++) {
		soma+=conta[i].consumoKh;
	}
	int media = soma/N;
	return media;

}

public void PagasAntes(ContaLuz[] conta, String paga, int N) throws ParseException {
	int i = 0;
	for(i=0; i<N;i++) {
		if(conta[i].paga.equals("S") || conta[i].paga.equals("Sim") ||conta[i].paga.equals("sim") ) {
		Date dataInicial, dataFinal;
		String strDataInicial = conta[i].dataPagamento;
		String strDataFinal = conta[i].dataVencimento;

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		dataFinal = sdf1.parse(strDataFinal);
		dataInicial = sdf2.parse(strDataInicial);
			if(dataInicial.after(dataFinal) == false){
				System.out.println();
				System.out.println("Conta paga até o dia de vencimento:");
				System.out.println("Codigo: "+conta[i].codigoConta);
				System.out.println("Consumo: "+conta[i].consumoKh);
				System.out.println("Valor: "+conta[i].valor);
				System.out.println("Data de leitura: "+conta[i].dialeitura +"/"+conta[i].mesleitura+"/"+conta[i].anoleitura);
				System.out.println("Data de vencimento: "+conta[i].dataVencimento);
				System.out.println("Data de pagamento: "+conta[i].dataPagamento);
				System.out.println();
			}else if (dataInicial.after(dataFinal) == true) {
				System.out.println();
				System.out.println("Conta paga depois do dia de vencimento:");
				System.out.println("Codigo: "+conta[i].codigoConta);
				System.out.println("Consumo: "+conta[i].consumoKh);
				System.out.println("Valor: "+conta[i].valor);
				System.out.println("Data de leitura: "+conta[i].dialeitura +"/"+conta[i].mesleitura+"/"+conta[i].anoleitura);
				System.out.println("Data de vencimento: "+conta[i].dataVencimento);
				System.out.println("Data de pagamento: "+conta[i].dataPagamento);
				System.out.println();
			}
		}

	
	}
}


}
