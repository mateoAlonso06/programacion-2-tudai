package ejercicio8;

import java.util.ArrayList;

public class SistemaOrganizador {
	private ArrayList<Evaluador> evaluadores;
	private ArrayList<Trabajo> trabajos;
	
	public SistemaOrganizador() {
		this.evaluadores = new ArrayList<>();
		this.trabajos = new ArrayList<>();
	}
	
	public void buscarEvaluadores(Trabajo trabajo) {
		ArrayList<Evaluador> posiblesEvaluadores = new ArrayList<>();
		ArrayList<String> temasTrabajo = trabajo.getTemas();

		/*Si el trabajo es poster con que se cumpla que una de los temas
		 del poster sea conocido por el evaluador es suficiente*/
		if (trabajo.getCategoria().equalsIgnoreCase("poster")) {
			for (Evaluador evaluador : this.evaluadores) {
				int i = 0;
				boolean sabeAlmenosUnTema = false;
				while (i < temasTrabajo.size() && !sabeAlmenosUnTema) {
					if (evaluador.getConocimientos().contains(temasTrabajo.get(i))) {
						posiblesEvaluadores.add(evaluador);
						sabeAlmenosUnTema = true;
					}
					i++;
				}
			}
		}
		else {
			// Si el evaluador no sabe un tema sabe toma un valor falso y no es agregado
			for (Evaluador evaluador : this.evaluadores) {
				boolean sabe = true;
				for (String tema : temasTrabajo) {
					if (!evaluador.getConocimientos().contains(tema))
						sabe = false;
				}
				if (sabe)
					posiblesEvaluadores.add(evaluador);
			}
		}
		
		if (!posiblesEvaluadores.isEmpty())
			for (Evaluador posibleEvaluador : posiblesEvaluadores) {
				posibleEvaluador.agregarTrabajo(trabajo);
				trabajo.agregarEvaluador(posibleEvaluador);
				System.out.println(posibleEvaluador);
			}
		else 
			System.out.println("No se encontraron evaluadores con los requesitos esperados");
	}
	
	public void buscarTrabajos(Evaluador evaluador) {
		ArrayList<Trabajo> posiblesTrabajos = new ArrayList<>();
		ArrayList<String> evaluadorConocimientos = evaluador.getConocimientos();
		
		for (Trabajo trabajo : this.trabajos) {
			// si el trabajo es de categoria poster hago n =>:
			if (trabajo.getCategoria().equalsIgnoreCase("poster")) {
				int i = 0;
				boolean sabe = false;
				while (i < evaluadorConocimientos.size() && !sabe) {
					if (trabajo.getTemas().contains(evaluadorConocimientos.get(i))) {
						posiblesTrabajos.add(trabajo);
						sabe = true;
					}
					i++;
				}
			}
			// si el trabajo NO es de categoria poster hago m =>:
			else {
				int contador = 0;
				for (String evaluadorConocimiento : evaluadorConocimientos) {
					if (trabajo.getTemas().contains(evaluadorConocimiento))
						contador++;
				}
				if (contador == trabajo.getTemas().size()) {
					posiblesTrabajos.add(trabajo);
				}
			}
		}
		
		for (Trabajo posibleTrabajo : posiblesTrabajos) {
			evaluador.agregarTrabajo(posibleTrabajo);
			posibleTrabajo.agregarEvaluador(evaluador);
		}
	}
	
	public void agregarTrabajos(Trabajo trabajo) {
		trabajos.add(trabajo);
	}
	
	public void agregarEvaluador(Evaluador evaluador) {
		evaluadores.add(evaluador);
	}
	
	public void verTrabajos() {
		if (!trabajos.isEmpty()) {
			for (int i = 0; i < trabajos.size(); i++) {
				System.out.println(trabajos.get(i));
			}
		}
	}
	
	public void verEvaluadores() {
		if (!evaluadores.isEmpty())
			for (int i = 0; i < evaluadores.size(); i++)
				System.out.println(evaluadores.get(i));
	}
	
    public static void main(String[] args) {
    }
}
