package ExerciciosVetorMatrizes;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	int[] vetor = new int[5];
	int maiorvalor = 0;
	double valor;

		System.out.println("Digite 5 valores ");
	for (int v = 0; v < vetor.length; v++) {
		valor = leia.nextInt();
	if (valor > maiorvalor) {
		maiorvalor = (int) valor;

				}

			}
			leia.close();
			System.out.println("O maior valor foi " + maiorvalor);

		}
	}
