import java.util.Scanner;

public class questãoPoo05 {

	public static void main(String[] args) {
		
		int v[];
		int N;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Quantidade de numeros");
		N = scan.nextInt();
		v = new int [N];
		
		int i, soma = 0;
		
		for(i=0;i<N;i++)
		{
			System.out.println("Valor 0" + i);
			v[i] = scan.nextInt();
			soma += v[i];
		}
		
		float media = 0;
		media = (float) (soma/N);
		double somaFinal =0;
		
		for(i=0;i<N;i++)
		{
			v[i] = (int) (v[i]- media);
			v[i] = (int) Math.pow(v[i], 2);
			somaFinal += v[i];
		}
		
		double desvioPadrao = 0, variancia =0;
		variancia = somaFinal/(N);
		desvioPadrao = Math.sqrt(variancia);		
		
		System.out.println("Desvio padrão "+ desvioPadrao);
		scan.close();

	}

}
