package ar.edu.uno.poo1.patos;

public class PatoDeMadera extends Pato {
	
	public PatoDeMadera() {
		super(new VuelaQueDaPena(), new Mudear());
	}
	
	public void mostrarse() {
		super.mostrarse();
		System.out.println(" de madera. Pero soy un señuelo así que sssshhhh");
	}

}
