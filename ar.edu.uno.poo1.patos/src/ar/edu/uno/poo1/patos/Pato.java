package ar.edu.uno.poo1.patos;

public abstract class Pato {
	private ComportamientoDeVuelo comportamientoDeVuelo;
	private ComportamientoDeRuido comportamientoDeRuido;

	public Pato(ComportamientoDeVuelo comportamientoDeVuelo, ComportamientoDeRuido comportamientoDeRuido) {
		if (comportamientoDeVuelo == null) throw new Error("El comportamiento de vuelo no puede ser null");
		if (comportamientoDeRuido == null) throw new Error("El comportamiento de ruido no puede ser null");
		this.comportamientoDeVuelo = comportamientoDeVuelo;
		this.comportamientoDeRuido = comportamientoDeRuido;
	}

	public void volar() {
		this.comportamientoDeVuelo.volar();
	}
	
	public void hacerRuido() {
		this.comportamientoDeRuido.hacerAlgunRuido();
	}
	
	public void mostrarse() {
		System.out.print("Mirame, soy un pato");
	}
	
	public void flotar() {
		System.out.println("Soy un pato y estoy flotandooooo!!!");
	}
	

}
