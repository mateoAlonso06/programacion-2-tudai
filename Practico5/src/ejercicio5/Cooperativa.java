package ejercicio5;

import java.util.ArrayList;

public class Cooperativa {
	private ArrayList<Cereal> cereales;
	private ArrayList<Lote> lotes;
	
	public Cooperativa() {
		this.cereales = new ArrayList<>();
		this.lotes = new ArrayList<>();
	}
	
	public void obtenerCerealesParaLote(Lote lote) {
		ArrayList<Cereal> cerealesPosibles = new ArrayList<>();
		
		for (Cereal cereal : cereales) {
			if (lote.puedeSembrarse(cereal)) {
				cerealesPosibles.add(cereal);
			}
		}
		
		if (cerealesPosibles.isEmpty()) {
			System.out.println("No se encontraron posibles cereales para este lote");
			return;
		}
		
		for (Cereal cereal : cerealesPosibles)
			System.out.println(cereal);
	}
	
	public void obtenerLotesParaCereal(Cereal cereal) {
		ArrayList<Lote> posiblesLotes = new ArrayList<>();
		
		for (Lote lote : this.lotes) {
			if (lote.puedeSembrarse(cereal))
				posiblesLotes.add(lote);
		}
		
		if (posiblesLotes.isEmpty()) {
			System.out.println("No hay lotes para este cereal");
			return;
		}
		
		for (Lote lote : posiblesLotes) 
			System.out.println(lote);
	}
	
	public void agregarCereal(Cereal cereal) {
		cereales.add(cereal);
	}
	
	public void agregarLote(Lote lote) {
		lotes.add(lote);
	}
	
	public void verLotes() {
		for (Lote lote : this.lotes)
			System.out.println(lote + "\n" + lote.tipoDeLote() + "\n");
	}
	
	public static void main(String[] args) {
        // Crear una cooperativa
        Cooperativa cooperativa = new Cooperativa();
        
        // Crear minerales
        Mineral nitrogeno = new Mineral("Nitrógeno", true);
        Mineral fosforo = new Mineral("Fósforo", true);
        Mineral potasio = new Mineral("Potasio", false);
        Mineral calcio = new Mineral("Calcio", false);
        
        // Crear cereales
        Cereal maiz = new Cereal("Maíz", "Grano de cosecha gruesa");
        maiz.agregarMineral(nitrogeno);
        maiz.agregarMineral(fosforo);
        
        Cereal trigo = new Cereal("Trigo", "Grano de cosecha fina");
        trigo.agregarMineral(fosforo);
        trigo.agregarMineral(potasio);
        
        Cereal alfalfa = new Cereal("Alfalfa", "Pastura");
        alfalfa.agregarMineral(calcio);
        alfalfa.setEsPastura(); // Especificamos que es una pastura
        
        // Agregar cereales a la cooperativa
        cooperativa.agregarCereal(maiz);
        cooperativa.agregarCereal(trigo);
        cooperativa.agregarCereal(alfalfa);
        
        // Crear lotes
        Lote lote1 = new Lote(100, "Zona Norte", "Arcilloso");
        lote1.agregarMineral(nitrogeno);
        lote1.agregarMineral(fosforo);
        
        Lote lote2 = new Lote(30, "Zona Sur", "Arenoso");
        lote2.agregarMineral(fosforo);
        lote2.agregarMineral(potasio);
        
        Lote lote3 = new Lote(60, "Zona Este", "Limoso");
        lote3.agregarMineral(calcio);
        lote3.agregarMineral(potasio);
        
        // Agregar lotes a la cooperativa
        cooperativa.agregarLote(lote1);
        cooperativa.agregarLote(lote2);
        cooperativa.agregarLote(lote3);
        
        cooperativa.verLotes();
        
        System.out.println("Buscando cereales para el lote1:");
        cooperativa.obtenerCerealesParaLote(lote1);
        
        System.out.println();
        
        System.out.println("Buscando lotes para la alfalfa:");
        cooperativa.obtenerLotesParaCereal(alfalfa);
	}
}
