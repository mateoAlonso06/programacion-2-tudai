package ejercicio1;

class Sensor {
	private String tipo;
	private boolean detectar;
	
	public Sensor(String tipo) {
		this.tipo = tipo;
		this.detectar = false;
	}
	
	public boolean getDetectar() {
		return this.detectar;
	}
	
	public void setDetectar(boolean valor) {
		this.detectar = valor;
	}
	
	public String getTipoSensor() {
		return this.tipo;
	}
}
