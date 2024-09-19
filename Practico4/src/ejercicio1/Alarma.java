package ejercicio1;

import java.util.ArrayList;

class Alarma {
	private ArrayList<Sensor> sensores;
	private Timbre timbre;
	
	public Alarma(Timbre timbre) {
		this.timbre = timbre;
		this.sensores = new ArrayList<>();
	}
	
	public void agregarSensor(Sensor sensor) {
		sensores.add(sensor);
	}
	
	public ArrayList<Sensor> getSensor() {
		return this.sensores;
	}
	
	public void comprobar() {
		for (Sensor sensor : sensores) {
			if (sensor.getDetectar()) {
				System.out.println("El sensor de " + sensor.getTipoSensor() + " se ha activado, se encendera la alarma!");
				System.out.println(this.timbre.hacerSonar());			
				return;
			}
		}
		
		System.out.println("Los sensores no detectaron nada inusual");
	}
	
	public Timbre getTimbre() {
		return this.timbre;
	}
	
	public void apagarAlarma() {
		timbre.apagar();
		System.out.println("La alarma ha sido apagada");
	}
	
	public static void main(String[] args) {
		Timbre timbre1 = new Timbre();
		Alarma alarma1 = new Alarma(timbre1);
		
		Sensor sensor1 = new Sensor("verificación de vidrios rotos");
		Sensor sensor2 = new Sensor("detector de movimientos");
		Sensor sensor3 = new Sensor("apertura de puertas o ventanas");
		
		alarma1.agregarSensor(sensor1);
		alarma1.agregarSensor(sensor2);
		alarma1.agregarSensor(sensor3);
		
		alarma1.comprobar();
		sensor1.setDetectar(true);
		alarma1.comprobar();
	}
}
