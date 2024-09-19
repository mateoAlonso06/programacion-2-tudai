package ejercicio1Esteban;

import java.util.ArrayList;

public class Videoclub {
	private String nombre;
	private ArrayList<Cliente> clientes;

	public Videoclub() {
		clientes=new ArrayList<Cliente>();
		this.nombre = nombre;
	}
	public ArrayList<Cliente> clientesConDeudas(){
		ArrayList<Cliente> salida=new ArrayList<Cliente>();
		for (Cliente c:clientes) {
			if (c.poseeAlquilerVencido()) {
				salida.add(c);
			}
		}
		return salida;
	}
	
	
}
