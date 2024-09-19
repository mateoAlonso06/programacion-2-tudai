package ejercicio1;
/* Clase que permite informatizar un sistema de encuestas de una consultora
 * - Cada encuesta se compone de un conjunto de preguntas, de un encuestador y un encuestado
 * - Las encuestas REALIZADAS son guardadas (posible array)
 * - Por encuesta realizada los empleados cobran un plus (la empresa desea conocer la cantidad de encuestas realizdas)
 * - La encuesta contiene un DNI, una persona NO puede llenar dos veces la misma encuesta
 * 
 *  Diferenciar entre formulario respondido y a responder.
 */
public class Consultora {
	// vamos a suponer que todas las encuestas son las mismas
	private Encuesta[] encuestasRealizadas; // 4
	private Empleado[] empleados;
	
	/*Hay que terminar de escribir la parte de las encuestas con su respectiva verificacion*/
	
	private static final int nroEmpleados = 3;
	
	public Consultora(int nroEncuestas) {
		// hardcodeo el nro por ahora.
		encuestasRealizadas = new Encuesta[nroEncuestas];
		empleados = new Empleado[nroEmpleados];
		
		// CAMBIAR 
		for (int i = 0; i < encuestasRealizadas.length; i++) {
			encuestasRealizadas[i] = new Encuesta(new Empleado("Martin", 423), new Persona("Tomas", 434));
		}
	}

	public void guardarEncuestas(Encuesta en1, Encuesta en2, Encuesta en3, Encuesta en4) {
		// nro total de encuestas en 4
		encuestasRealizadas[0] = en1;
		encuestasRealizadas[1] = en2;
		encuestasRealizadas[2] = en3;
		encuestasRealizadas[3] = en4;
	}
	
	public void agregarEmpleados(Empleado emp1, Empleado emp2, Empleado emp3) {
		// Estructuras dinamicas serian mas convenientes =>
		empleados[0] = emp1;
		empleados[1] = emp2;
		empleados[2] = emp3;
	}
	
	public int getCantidadEncuestasRealizadas() {
		return encuestasRealizadas.length;
	}
	
	public void encuestasRealizadasPorEmpleado() {
		for (Empleado empleado : empleados) {
			if (empleado.getEncuestasRealizadas() > 0)
				System.out.println("El empleado " + empleado.getNombre() + " realizo " + empleado.getEncuestasRealizadas() + " encuestas, recibra un bonus!");
			else
				System.out.println("El empleado " + empleado.getNombre() + " no realizo ninguna encuesta");
		}
	}
	
	public void obtenerDatosDeLasEncuestas() {
		// Busco e imprimo los datos de cada encuesta realizada
		for (Encuesta encuesta : encuestasRealizadas) 
			System.out.println(encuesta.getDatos());
	}
	
	public void comenzarEncuesta(Empleado empleado, Persona encuestado) {
		if (!yaFueEncuestado(encuestado)) {
			Encuesta nuevaEncuesta = new Encuesta(empleado, encuestado);
			empleado.sumarEncuestaRealizada();
		} else
			System.out.println("La persona ya fue encuestada");
	}
	
	private boolean yaFueEncuestado(Persona encuestado) {
		int i = 0;
		boolean flag = false;
		while (i < encuestasRealizadas.length && !flag) {
			if (encuestado.getDni() == encuestasRealizadas[i].getDniEncuestado())
				flag = true;
			i++;
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Consultora consultora = new Consultora(5);
		
		Empleado empleado1 = new Empleado("José", 439555);
		Empleado empleado2 = new Empleado("Hernan", 435435435);
		Empleado empleado3 = new Empleado("Tomas", 23423423);
	
		consultora.agregarEmpleados(empleado1, empleado2, empleado3);
		
		// podria modularizar mucho más esto creando un bucle que me permita cargar por teclado los valores
		Persona usuario1 = new Persona("Mateo", 43855104);
		Persona usuario2 = new Persona("Leonel", 4566644);
		Persona usuario3 = new Persona("Jazmin", 24234234);
		Persona usuario4 = new Persona("Dolores", 23432423);
		
		consultora.comenzarEncuesta(empleado1, usuario1);
		
		consultora.obtenerDatosDeLasEncuestas();
		consultora.encuestasRealizadasPorEmpleado();
	}
}
