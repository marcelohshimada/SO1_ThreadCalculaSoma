package view;

import controller.ThreadSoma;

public class Principal {

	public static void main(String[] args) {

		// Cria��o do vetor 3 x 5 ==> 3 linhas e 5 colunas
		int[][] vetor = new int[3][5];

		for (int i = 0; i < vetor.length ; i++) {
			// Quebra de linha quando encerrar o primeiro la�o da linha
			System.out.println();
			
			for (int j = 0; j < vetor[i].length ; j++) {
				
				// Gerar n�meros aleat�rios
				// Math.random() gera n�meros entre 0 e 0,999 portanto multiplica por 100 para ter entre 0 e 99
				// Soma +1 para ter a possibilidade do n�mero 100 e eliminar a possibilidade de 0
				int num = (int) ((Math.random() * 100) + 1);
				
				vetor[i][j] = num; // o numero � armazenado no vetor de acordo com a posicao [i][j]
				
				System.out.print(vetor[i][j] + "\t"); // Imprime o numero refente a posi��o com espa�amento para o pr�ximo
			}
		}
		
		System.out.println();
		
		Thread tCalc1 = new ThreadSoma(vetor[0],0); // Inicia a Thread na primeira linha
		Thread tCalc2 = new ThreadSoma(vetor[1],1); // Inicia a Thread na segunda linha
		Thread tCalc3 = new ThreadSoma(vetor[2],2); // Inicia a Thread na terceira linha

		tCalc1.start();
		tCalc2.start();
		tCalc3.start();
	}
}
