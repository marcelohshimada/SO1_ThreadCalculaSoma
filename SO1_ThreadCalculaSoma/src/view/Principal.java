package view;

import controller.ThreadSoma;

public class Principal {

	public static void main(String[] args) {
		
		// Criação do vetor 3x5
		int[][] vetor = new int [5][3];
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				int num = (int) (Math.random() * 100);
				vetor[i][j] = num ;
			}
		
		
		}
		
		Thread tCalc1 = new ThreadSoma(vetor[0]);
		tCalc1.start();
		
		Thread tCalc2 = new ThreadSoma(vetor[1]);
		tCalc2.start();

		Thread tCalc3 = new ThreadSoma(vetor[2]);
		tCalc3.start();
		
	
	}
	
}
