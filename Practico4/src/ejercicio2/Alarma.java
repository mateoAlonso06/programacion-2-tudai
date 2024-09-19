package ejercicio2;

import java.util.ArrayList;

public class Alarma {
	private ArrayList<Sensor> sensores;
	private Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.timbre = timbre;
		sensores = new ArrayList<>();
	}
	
	public void agregarSensor(Sensor sensor) {
		sensores.add(sensor);
	}
	
	// Este metodo recorre todos mis sensores en busqueda de alguno que haya detectado algo, en caso de serlo activara la alarma
	public void comprobar() {
		for (Sensor sensor : sensores) {
			if (sensor.getDetectar()) {
				System.out.println("El sensor " + sensor.getTipoSensor() + ", se ha activado en la zona: " + sensor.getZonaAsignada()); 
				System.out.println(this.timbre.hacerSonar());
			}
			else
				System.out.println("No se encontro nada inusual en el sensor " + sensor.getTipoSensor() + " de la zona " + sensor.getZonaAsignada());
		}
	}
	
	public static void main(String[] args) {		
		Alarma alarma1 = new Alarma(new Timbre());
		
		Sensor sensor1 = new Sensor("Detector de vidrios rotos", "Quincho");
		Sensor sensor2 = new Sensor("Detector de movimientos", "Patio trasero");
		Sensor sensor3 = new Sensor("Detector de puerta/ventanas abiertas", "Cocina");
		Sensor sensor4 = new Sensor("Detector de movimientos", "Frente");
		Sensor sensor5 = new Sensor("Detector de vidrios rotos", "Lavadero");
		
		alarma1.agregarSensor(sensor1);
		alarma1.agregarSensor(sensor2);
		alarma1.agregarSensor(sensor3);
		alarma1.agregarSensor(sensor4);
		alarma1.agregarSensor(sensor5);
		
//		alarma1.comprobar();
		
		sensor1.setDetectar(true);
		sensor4.setDetectar(true);
		
		alarma1.comprobar();
	}
}
