import java.util.Scanner;

public class questaoPoo03 {

	public static void main(String[] args) {
		/*Construa um algoritmo que repita a leitura de uma senha até que ela seja
válida. Para cada senha incorreta escrever a mensagem “SENHA
INVÁLIDA”. Quando a senha for informada corretamente deve ser
impressa a mensagem “ACESSO PERMITIDO” e o algoritmo encerrado.
Considere que a senha correta é “a76dk09”*/
		Scanner scan = new Scanner(System.in);
		
		String senha = new String ("a76dk09");
		String senhaB;
		
		System.out.println("Digite sua senha:");
		senhaB = scan.nextLine();
		
		while (!senha.equals(senhaB))
		{
			System.out.println("ACESSO NEGADO TENTE NOVAMENTE:");
			senhaB = scan.nextLine();
		}
			System.out.println("ACESSO PERMITIDO");
		
			scan.close();
	}

}
