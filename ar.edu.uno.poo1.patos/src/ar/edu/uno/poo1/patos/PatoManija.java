package ar.edu.uno.poo1.patos;

public class PatoManija extends Pato {

	public PatoManija() {
		super(new VuelaConCohete(), new Graznar());
	}
	
	public void mostrarse() {
		super.mostrarse();
		System.out.println(" rojo y con antiparras pero no me podés ver!!!!!");
	}

}
