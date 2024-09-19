package ejercicio3;

public class Personaje {
	// atributos personales
	private final static int MAX_HP = 500;
	private int hpActual;
	private String nombreReal;
	private String tipo;
	private float peso;
	private float altura;
	private int edad;
	// atributos de super
	private String alias;
	private boolean visionNoctura;
	private float velocidad;
	private float fuerza;
	
	public Personaje(String nombreReal, String tipo, float peso, float altura, int edad, String alias, boolean visionNoctura, float velocidad, float fuerza) {
		this.nombreReal = nombreReal;
		this.tipo = tipo;
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
		this.alias = alias;
		this.visionNoctura = visionNoctura;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.hpActual = MAX_HP;
	}
	
	// En el parametro uso "Personaje" porque esto aplica tanto para heroes como para villanos
	public void atacar(Personaje enemigo) {
		// el danio del personaje esta dado por un 30% de su fuerza más un valor aleatorio entre 1 y 100
		float danio = (this.fuerza * 1.30f) + (float)(Math.random() * 99) + 1;
		System.out.println("El " + this.tipo + " ha atacado, " + enemigo.getAlias() + " ha perdido " + danio + " puntos de vida");
		enemigo.recibirDanio(danio);
	}
	
	public int getHpActual() {
		return this.hpActual;
	}
	
	public void recibirDanio(float danio) {
		if (this.hpActual > 0) 
			this.hpActual -= danio;
	}
	
	public boolean estaVivo() {
		return this.hpActual > 0;
	}
	

	public String getTipoPersonaje() {
		return this.tipo;
	}
	
	public String getNombreReal() {
		return nombreReal;
	}

	public float getPeso() {
		return peso;
	}

	public String toString() {
		return "Personaje [hpActual=" + hpActual + ", nombreReal=" + nombreReal + ", tipo=" + tipo + ", peso=" + peso
				+ ", altura=" + altura + ", edad=" + edad + ", alias=" + alias + ", visionNoctura=" + visionNoctura
				+ ", velocidad=" + velocidad + ", fuerza=" + fuerza + "]";
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public boolean isVisionNoctura() {
		return visionNoctura;
	}

	public void setVisionNoctura(boolean visionNoctura) {
		this.visionNoctura = visionNoctura;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public float getFuerza() {
		return fuerza;
	}

	public void setFuerza(float fuerza) {
		this.fuerza = fuerza;
	}
}
