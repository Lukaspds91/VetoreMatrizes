package ExerciciosVetorMatrizes;

import java.util.Random;

public class Exercicio03 {

public static void main(String[] args) {
		
		Random random = new Random();
		
		
		
		int [][] n1 = new int [4][6];
		int [][] n2 = new int [4][6];
		int [][] m1 = new int [4][6];
		int [][] m2 = new int [4][6];
		
		
		System.out.println("========N1========");
		for(int l = 0 ; l < n1.length ; l++) {
			System.out.println();
			for(int c = 0 ; c < n1[l].length ; c++) {
				n1 [l][c] = random.nextInt(5);
				n2 [l][c] = random.nextInt(5);
				m1 [l][c] = n1 [l][c] + n2 [l][c];	
				m2 [l][c] = n1 [l][c] - n2 [l][c];
				
				System.out.print(n1 [l][c] +  " | ");
			}
			
		}
		System.out.println("\n");
		System.out.println("========N2========");
		for( int l = 0 ; l < n2.length ; l++) {
			System.out.println();
			for(int c = 0; c < n2[l].length ; c++) {
				System.out.print(n2 [l][c] +  " | ");
			}
		}
		

		
		System.out.println("\n");
		System.out.println("========M1========");
		for(int l = 0; l <m1.length ; l++) {
			System.out.println();
			for(int c = 0 ; c < m1[l].length ; c++) {
				System.out.print(m1 [l][c] + " | ");
			}
		}
		System.out.println("\n");
		System.out.println("========M2========");
		
		for(int l = 0; l < m2.length ; l++) {
			System.out.println();
			for(int c = 0 ; c < m2[l].length ; c++) {
				System.out.print(m2 [l][c] + " | ");
			}
		}
		
	}
}