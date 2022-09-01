package aula01;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double x = 0, y=0, resultado = 0;
		int z=0;
		System.out.print("Digite o primeiro valor: ");
		x = scan.nextDouble();
		System.out.print("Digite o Segundo valor: ");
		y = scan.nextDouble();
		System.out.print("Digite o operador: ");
		z = scan.next().charAt(z);
		
		switch(z)
		{
		case '+' :
			resultado = x+y;
			System.out.print("Seu resultado é " + resultado);
			break;
		case '-':
			resultado = x-y;
			System.out.print("Seu resultado é " + resultado);
			break;
		case '/' :
			while(y == 0)
			{
				System.out.print("Digite o Segundo diferente de 0: ");
				y = scan.nextDouble();
			}
			resultado = x/y;
			System.out.print("Seu resultado é " + resultado);
			break;
		case '*':
			resultado = x * y;
			System.out.print("Seu resultado é " + resultado);
			break;
		default: System.out.print("Operador invalido");
		
		}
		scan.close();
		

	}

}
