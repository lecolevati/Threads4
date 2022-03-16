package view;

import controller.ThreadSapo;

public class Principal {

	public static void main(String[] args) {
		
		for (int idSapo = 1; idSapo <= 5; idSapo++) {
			Thread t = new ThreadSapo(idSapo);
			t.start();
		}
		
	}

}
