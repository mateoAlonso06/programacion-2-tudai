package ejercicio1Esteban;

import java.time.LocalDate;

public class Pelicula extends Item {
	private String nombre;
	private String sinopsis;
	private int cantidadCopias;
	
	public Pelicula(String nombre, String sinopsis, int cantidadCopias,LocalDate fecha) {
		super(fecha); 
		this.nombre = nombre;
		this.sinopsis = sinopsis;
		this.cantidadCopias = cantidadCopias;
	}
	
	protected boolean sePuedeAlquilar() {
		return (cantidadCopias>0);
	}
	@Override
	public void alquilar(Cliente c) {
		if (this.sePuedeAlquilar()) {
			c.alquilar(this);
			cantidadCopias--;
		}else {
			System.out.println("no se puede alquilar");
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getSinopsis() {
		return sinopsis;
	}


	public int getCantidadCopias() {
		return cantidadCopias;
	}

}
