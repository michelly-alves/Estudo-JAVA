package questao02;

import java.util.Random;
import java.util.Scanner;

public class questaoPoo02 {

	public static void main(String[] args) {
		
		
		/*Dado um array A, com N elementos gerados aleatoriamente, obter o
		valor do maior elemento. Se houver empate, considerar o conteúdo da
		primeira ocorrência.*/
		
		int [] A;
		int N;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de elementos da array:");
		N = scan.nextInt();
		Random gerador = new Random();
		
		A = new int [N];
		int i, maiorElemento = 0;
		
		for(i=0;i<N;i++)
		{
			A[i] = gerador.nextInt();
			System.out.println(A[i]);
		}
		
		for(i=0;i<N;i++)
		{
			maiorElemento = A[i];
			if(A[i] > maiorElemento)
			{
				maiorElemento = A[i];
			}
		}
		System.out.println("Maior Elemento é:" + maiorElemento);

	}

}
