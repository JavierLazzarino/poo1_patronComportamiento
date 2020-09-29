package ar.edu.uno.poo1.patos;

public class SimuladorDePatos {
	public static void main(String[] args) {
		Pato arrayDePatos[] = { new PatoBlanco(), new PatoDeGoma(), new PatoDeMadera(), new PatoManija() };
		
		for (Pato pato : arrayDePatos) {
			System.out.println(pato.getClass().getName());
			pato.flotar();
			pato.hacerRuido();
			pato.volar();
			pato.mostrarse();
			System.out.println();
		}
	}
}
