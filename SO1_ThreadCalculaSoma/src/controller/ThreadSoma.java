package controller;

public class ThreadSoma extends Thread {

	private int[] vetor;
	
	public ThreadSoma(int[] vetor) {
		this.vetor = vetor;
	}
	
	@Override // Obrigatoriedade de executar m�todo run()
	public void run() {
		somaLinha(); 
	}
	
	private void somaLinha() { // M�todo que Calcula a soma dos n�meros na linha
		int somatoria = 0; // Inicia a vari�vel com valor de 0
		
		for (int i = 0; i < vetor.length; i++) {
			somatoria += vetor[i];
		}
		System.out.println("Somat�ria da linha referente a Thread ID " + getId() + " = " + somatoria);
	}
}
