package ar.edu.uno.poo1.patos;

public class PatoDeGoma extends Pato {
	
	public PatoDeGoma() {
		super(new VuelaQueDaPena(), new Chirrear());
	}
	
	public void mostrarse() {
		super.mostrarse();
		System.out.println(" de plástico y amarillo");
	}

}
