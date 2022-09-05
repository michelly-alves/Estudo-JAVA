import java.util.Scanner;

public class questaoPoo01 {

	public static void main(String[] args) {
		/* 2. Dado um array A, com N elementos inteiros, obter quantos são pares,
		impares, positivos, negativos e neutros. */
		
		int [] A ;
		Scanner scan = new Scanner(System.in);
		
		int N;
		System.out.println("Quantidade de elementos da array:");
		N = scan.nextInt();
		
		A = new int [N];
		int i, par = 0, impar = 0, positivo = 0, negativo = 0, neutro =0;
		
		for(i=0;i<N;i++)
		{
			System.out.println("Elemento "+ i);
			A[i] = scan.nextInt();
		}
			
		for(i=0;i<N;i++)
		{
			if( A[i] %2 == 0)
			{
				par++;
			}else 
			{impar++;}

			if(A[i] > 0)
			{
				positivo++;
			}
			else if (A[i]< 0)
			{
				negativo++;
			}
			else
			{
				neutro++;
			}	
		}
		
		System.out.println("Quantidade de numeros pares:" + par);
		System.out.println("Quantidade de numeros impares:" + impar);
		System.out.println("Quantidade de numeros positivos:" + positivo);
		System.out.println("Quantidade de numeros negativos:" + negativo);
		System.out.println("Quantidade de numeros neutros:" + neutro);
		scan.close();
		
	}

}
