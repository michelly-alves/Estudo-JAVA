import java.util.Scanner;

public class jogo {
	public static Boolean checkWinX(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 1; j++) {
				if ((matriz[0][0] == 'X' && matriz[0][1] == 'X' && matriz[0][ 2] == 'X')) {
					return true;
				} else if ((matriz[0][0] == 'X' && matriz[ 1][0] == 'X' && matriz[2][0] == 'X')) {
					return true;
				} else if ((matriz[0][0] == 'X' && matriz[1][1] == 'X' && matriz[2][2] == 'X')) {
					return true;
				} else if ((matriz[2][0] == 'X' && matriz[1][1] == 'X' && matriz[0][2] == 'X')) {
					return true;
				}
			}

		}
		return false;
	}

	public static Boolean checkWinO(char matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < 1; j++) {
				if ((matriz[0][0] == 'O' && matriz[0][1] == 'O' && matriz[0][2] == 'O')) {
					return true;
				} else if ((matriz[0][0] == 'O' && matriz[1][0] == 'O' && matriz[2][0] == 'O')) {
					return true;
				} else if ((matriz[0][0] == 'O' && matriz[1][1] == 'O' && matriz[2][2] == 'O')) {
					return true;
				} else if ((matriz[2][0] == 'O' && matriz[1][1] == 'O' && matriz[0][2] == 'O')) {
					return true;
				}
			}

		}
		return false;
	}

	public static Boolean jogadasX(char matriz[][], int linha, int coluna) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				matriz[linha][coluna] = 'X';
				System.out.print("     "+matriz[i][j]);
				System.out.print("\t");
			}

		}
		if (checkWinX(matriz) == true) {
			System.out.println();
			System.out.println("     X WIN!!");
		}
		return false;
	}

	public static Boolean jogadasO(char matriz[][], int linha, int coluna) {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			for (int j = 0; j < matriz.length; j++) {
				matriz[linha][coluna] = 'O';
				System.out.print("     " + matriz[i][j]);
				System.out.print("\t");
			}

		}
		if (checkWinO(matriz) == true) {
			System.out.println();
			System.out.println("    O WIN!!");

		}
		return false;
	}

	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in)) {
			char matriz[][];
			matriz = new char[3][3];

			System.out.println("____________BEM VINDO AO JOGO DA VELHA!___________");
			System.out.println("Primeiro participante escolha o local de inserir o X!");
			for (int i = 0; i < matriz.length; i++) {
				System.out.println();
				for (int j = 0; j < matriz.length; j++) {
					matriz[i][j] = '?';
					System.out.print("      "+matriz[i][j]);
					System.out.print("\t");
				}
			}

			for (int i = 0; i < 10; i++) {
				if (i % 2 == 0) {
					System.out.println("\n");
					System.out.print("      _____JOGADOR X_______");
					System.out.println();
					System.out.print("        COLUNA:");
					int coluna = scan.nextInt();
					System.out.print("        LINHA:");
					int linha = scan.nextInt();
					jogadasX(matriz, linha, coluna);
					checkWinX(matriz);
				} else {
					System.out.println("\n");
					System.out.print("    ______JOGADOR O________ ");
					System.out.println();
					System.out.print("        COLUNA:");
					int coluna = scan.nextInt();
					System.out.print("        LINHA:");
					int linha = scan.nextInt();
					jogadasO(matriz, linha, coluna);
					checkWinO(matriz);
				}
				if (checkWinX(matriz) == true || checkWinO(matriz) == true) {
					break;
				}
				if ((i > 9) && (checkWinX(matriz) == false || checkWinO(matriz) == false)) {
					System.out.println("deu velha, meu bom amigo");
				}
			}
		}

	}
}
