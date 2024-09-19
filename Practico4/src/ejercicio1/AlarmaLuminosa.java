package ejercicio1;

public class AlarmaLuminosa extends Alarma {
	private Luz luz;
	
	public AlarmaLuminosa(Timbre timbre, Luz luz) {
		super(timbre);
		this.luz = luz;
	}
	
	@Override
	public void comprobar() {
		for (Sensor sensor : getSensor()) {
			if (sensor.getDetectar()) {
				System.out.println("El sensor de " + sensor.getTipoSensor() + " se ha activado, se encendera la alarma!");
				System.out.println(getTimbre().hacerSonar());		
				this.luz.encender();
				return;
			}
		}
		
		System.out.println("Los sensores no detectaron nada inusual");
	}
}
