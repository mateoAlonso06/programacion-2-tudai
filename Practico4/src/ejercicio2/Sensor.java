package ejercicio2;

/*Clase sensor, encargada de monitorear una zona de una casa y capaz de devolver un valor de estado*/
public class Sensor {
	private String tipoSensor;
	private String zonaAsignada;
	private boolean detectar;
	
	public Sensor(String tipoSensor, String zonaAsignada) {
		this.detectar = false;
		this.tipoSensor = tipoSensor;
		this.zonaAsignada = zonaAsignada;
	}
	
	public void setDetectar(boolean estado) {
		this.detectar = estado;
	}
	
	public boolean getDetectar() {
		return this.detectar;
	}
	
	public String getZonaAsignada() {
		return this.zonaAsignada;
	}
	
	public String getTipoSensor() {
		return this.tipoSensor;
	}
	
	public void setZonaAsignada(String nuevaZona) {
		this.zonaAsignada = nuevaZona;
	}
	
	public void setTipoSensor(String tipo) {
		this.tipoSensor = tipo;
	}
}
