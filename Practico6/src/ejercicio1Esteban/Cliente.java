package ejercicio1Esteban;

import java.util.ArrayList;

public class Cliente {
	private ArrayList<Item> itemsAlquilados=new ArrayList<>();
	
	public void alquilar(Item i) {
		itemsAlquilados.add(i);
	}
	public boolean poseeAlquilerVencido () {
		for (Item i:itemsAlquilados) {
			if (i.vencio())
				return true;
		}
		return false;
	}
}
