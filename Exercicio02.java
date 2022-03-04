package ExerciciosVetorMatrizes;

import java.util.Random;

public class Exercicio02 {

public static void main(String[] args) {
		
		Random random = new Random();
		
		double media , soma = 0.0;
		int [] valor = new int [10];
		int	maiorvalor = 0;
		
		for (int v = 0 ; v < valor.length ; v++) {
			valor[v]= random.nextInt(6) + 1;
			soma = soma + valor[v];
			
			if(valor[v] == 6) {
				maiorvalor++;
			}
		}
		System.out.println("O valores dos lançamentos foram : ");
		for (int v = 0 ; v < valor.length ; v++ ){
			
			if ( v == 9) {
				System.out.print(valor[v] + ".");
			}else {
				System.out.print(valor[v] + " , ");
			}
		}
		System.out.println("\n");
		
		media = soma / valor.length;
		
		System.out.println("A média dos valores foi " + media);
		System.out.println("\nCaiu na maior pontuação " + maiorvalor + " vezes.");
	}

}