package controller;

public class ThreadSoma extends Thread {

	private int[] vetor;
	private int idLinha;
	
	public ThreadSoma(int[] vetor, int idLinha) {
		this.vetor = vetor;
		this.idLinha = idLinha;
	}
	
	@Override // Obrigatoriedade de executar método run()
	public void run() {
		somaLinha(); 
	}
	
	private void somaLinha() { // Método que Calcula a soma dos números na linha
		int somatoria = 0; // Inicia a variável com valor de 0
		
		for (int i = 0; i < vetor.length; i++) {
			somatoria += vetor[i];
		}
		System.out.println("Somatória da linha #" + idLinha + " = " + somatoria);
	}
}
