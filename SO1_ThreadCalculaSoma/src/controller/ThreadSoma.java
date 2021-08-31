package controller;

public class ThreadSoma extends Thread {

	private int[] vetor;
	
	
	public ThreadSoma(int[] vetor) {
		this.vetor = vetor;
	}
	
	@Override
	public void run() {
		somaLinha();
	}
	
	private void somaLinha() {
		int somatoria = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			somatoria += vetor[i];
		}
		System.out.println("ID Thread #" + getId() + " ==> Somatória = " + somatoria);
	}
}
