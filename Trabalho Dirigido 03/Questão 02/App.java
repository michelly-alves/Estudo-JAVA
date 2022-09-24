import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantidade de DVD´s:");
		int N = sc.nextInt();
		
		DVD[] dvd = new DVD[N];
		Autor[] aut = new Autor[N];
		
		int i=0;
		for(i=0;i<N;i++) {
			 dvd[i] = new DVD();
			 aut[i] = new Autor();
			 System.out.println();
			 System.out.print("Titulo do DVD: ");
			 dvd[i].Titulo = scan.nextLine();
			 System.out.print("Codigo do DVD: ");
			 dvd[i].Codigo = scan.nextLine();
			 System.out.print("Ano de Lançamento: ");
			 dvd[i].AnoLancamento = sc.nextInt();
			 System.out.print("Genero musical: ");
			 dvd[i].GeneroMusical = scan.nextLine();
			 System.out.print("Valor pago: ");
			 dvd[i].valor = sc.nextInt();
			 System.out.print("Gravadora: ");
			 dvd[i].Gravadora = scan.nextLine();
			 System.out.print("Autor: ");
			 aut[i].Nome = scan.nextLine();
			 System.out.print("Atua Solo? (Sim ou Não): ");
			 aut[i].AtuaSolo = scan.nextLine();
			 System.out.println();
		}
		
			dvd[0].informações(dvd, N, aut);
			
			dvd[0].AnoLancamentos(dvd, N);
			dvd[0].GostoMusical(dvd, N);
			
			System.out.println("Maior valor pago: "+ dvd[0].MaiorValor(N, dvd) );
			System.out.println("Menor valor pago: " + dvd[0].MenorValor(N, dvd));
			System.out.println("Valor total de todos os DVD´s: "+ dvd[0].somaValor(N, dvd));
			
			dvd[0].AutorSolo(dvd, aut, N);
			
		
		
		
		scan.close();

	}

}
