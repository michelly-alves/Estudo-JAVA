import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.ContaLuz;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner (System.in);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de contas de luz: ");
        int N = scan.nextInt();
        ContaLuz conta[] = new ContaLuz[N];
        
        int i = 0;
        int contador = 0;
        
        for(i = 0; i < N; i++){
        conta[i] = new ContaLuz();
        System.out.println();
        System.out.print("Codigo da conta:");
        conta[i].codigoConta = sc.nextLine();

        System.out.print("Data de leitura(ex: 01 01 2022): ");
        conta[i].dialeitura = scan.nextInt();
        conta[i].mesleitura = scan.nextInt();
        conta[i].anoleitura = scan.nextInt();

        System.out.print("Quantidade de KW/H gastos: ");
        conta[i].consumoKh = scan.nextInt();
        System.out.print("Valor da conta de energia: ");
        conta[i].valor = scan.nextInt();

        System.out.print("Dia mês e ano de vencimento(dd/mm/aaaa): ");
        conta[i].dataVencimento = sc.nextLine();
        
        System.out.print("conta paga ou não(S/N): ");
        conta[i].paga = sc.nextLine();
        
         if(conta[i].paga.equals("S")){
             System.out.print("Dia mes e ano de pagamento(dd/mm/aaaa): ");
             conta[i].dataPagamento = sc.nextLine();
         }else if (conta[i].paga.equals("N")) {
        	 contador++;
         }
    }
       i=0;
        /// MENOR E MAIOR CONSUMO
        	System.out.println("Mes de menor consumo: "+conta[i].mesconsumo(conta, conta[i].consumoKh, N ));
        	System.out.println("mes de maior consumo: "+conta[i].mesMaiorConsumo(conta, conta[i].consumoKh, N ));
        	System.out.println("Media de consumo: "+conta[i].mediaConsumo(conta, conta[i].consumoKh, N ));
        
        	/// datas
        	
        		for(i=0; i<N;i++) {
        			if(conta[i].paga.equals("S")) {
        			Date dataInicial, dataFinal;
        			String strDataInicial = conta[i].dataPagamento;
        			String strDataFinal = conta[i].dataVencimento;

        			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

        			dataFinal = sdf1.parse(strDataFinal);
        			dataInicial = sdf2.parse(strDataInicial);
        				if(dataInicial.after(dataFinal) == false){
        					System.out.println("Conta paga antes do vencimento: "+conta[i].codigoConta);
        				}else if (dataInicial.after(dataFinal) == true) {
        					System.out.println("Conta paga depois do vencimento: "+conta[i].codigoConta);
        				}
        		}
        	}
        	i = 0;
        /// Contas não pagas
        while( contador > i) {
        	
        	conta[i].contasNaoPagas(conta, N, i);
        	i++;
        }
        scan.close();
        sc.close();
	}

}

