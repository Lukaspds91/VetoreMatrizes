package ExerciciosVetorMatrizes;

import java.util.Scanner;

public class Exercicio04 {

public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int [][] usuario = new int [3][3];
		int soma = 0 , somadiagonal = 0;
		
		System.out.println("Preencha a tabela 3x3");
		for(int l = 0 ; l < usuario.length ; l++) {
			for (int c = 0 ; c < usuario[l].length ; c++) {
		
				System.out.printf("Digite os Valores : [%d] [%d] ", l, c);
				usuario[l][c] = leia.nextInt();
				
			}
		}
		System.out.println("\n== TABELA ==");
		for ( int l = 0 ; l < usuario.length; l++ ) {
			System.out.println();
			for( int c = 0 ; c < usuario[l].length ; c++) {
				System.out.print(usuario[l][c] + " | ");
				soma = soma + usuario [l][c];
				
				if (l == 0 && c==0 || l==1 && c==1 || l==2 && c==2) {
					somadiagonal = somadiagonal + usuario [l][c];
					
				}
			}
		}
		
		leia.close();
		System.out.println("\n");
		
		System.out.println("O resultado da soma dos valores é " + soma);
		System.out.println("\nA soma da diagonal principal é " + somadiagonal );
		
		

	}

}