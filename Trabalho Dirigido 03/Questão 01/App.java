import java.text.ParseException;
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
        
        for(i = 0; i < N; i++){
        	
        	conta[i] = new ContaLuz();
        	System.out.println();
        	System.out.print("Codigo da conta: ");
        	conta[i].codigoConta = sc.nextLine();

        	System.out.print("Data de leitura(ex: 01 01 2022): ");
        	conta[i].dialeitura = scan.nextInt();
        	conta[i].mesleitura = scan.nextInt();
        	conta[i].anoleitura = scan.nextInt();

        	System.out.print("Quantidade de KW/H gastos: ");
        	conta[i].consumoKh = scan.nextInt();
	        System.out.print("Valor da conta de energia: ");
	        conta[i].valor = scan.nextInt();

	        System.out.print("Dia, mês e ano de vencimento(dd/mm/aaaa): ");
	        conta[i].dataVencimento = sc.nextLine();
        
	        System.out.print("Conta paga ou não(Sim ou Não): ");
	        conta[i].paga = sc.nextLine();
	        
	         if(conta[i].paga.equals("S") || conta[i].paga.equals("Sim") ||conta[i].paga.equals("sim") ){
	             System.out.print("Dia, mês e ano de pagamento(dd/mm/aaaa): ");
	             conta[i].dataPagamento = sc.nextLine();
        
	         }
        }
        	
        	conta[0].contasNaoPagas(conta, N, conta[0].paga);	
    		conta[0].PagasAntes(conta, conta[0].paga, N);
        	/// MENOR E MAIOR CONSUMO
          	System.out.println();
           	System.out.println("Mês de menor consumo: "+conta[0].mesconsumo(conta, conta[0].consumoKh, N ));
        	System.out.println("Mês de maior consumo: "+conta[0].mesMaiorConsumo(conta, conta[0].consumoKh, N ));
        	System.out.println("Media de consumo: "+conta[0].mediaConsumo(conta, conta[0].consumoKh, N ));
        	System.out.println();
        	/// DATAS
            
        	
	        sc.close();
	        scan.close();	
	}

}

