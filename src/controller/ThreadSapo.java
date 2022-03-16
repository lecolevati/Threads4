package controller;

public class ThreadSapo extends Thread {

	private int idSapo;
	private int distanciaTotal = 200;
	private int puloSapo;
	private static int posicao;

	public ThreadSapo(int idSapo) {
		this.idSapo = idSapo;
	}

	@Override
	public void run() {
		corrida();
	}

	private void corrida() {
		int distanciaPercorrida = 0;
		while (distanciaPercorrida < distanciaTotal) {
			puloSapo = (int) (Math.random() * 6);
			distanciaPercorrida += puloSapo;
			System.out.println(
					"Sapo #" + idSapo + " pulou " + puloSapo + "m. e já percorreu " + distanciaPercorrida + "m.");
			try {
				sleep(75);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		posicao++;

		System.out.println("O sapo #" + idSapo + " foi o " + posicao + "o. a chegar");

	}

}
