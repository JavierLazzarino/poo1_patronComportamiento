package ar.edu.uno.poo1.patos;

public class PatoBlanco extends Pato {
	
	public PatoBlanco() {
		super(new VuelaConAlas(), new Graznar());
	}
	
	public void mostrarse() {
		super.mostrarse();
		System.out.println(" y además soy blanco");
	}

}
