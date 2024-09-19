package ejercicio3;

public class Pila {
	private Object[] elementos;
	private int cantidadElementos;
	
	public Pila() {
		this.elementos = new Object[10];
		this.cantidadElementos = 0;
	}
	
	public Pila reverse() {
		Pila newPila = new Pila();
		
		int i = this.cantidadElementos - 1;
		while (i >= 0) {
			newPila.push(this.elementos[i--]);
		}
		
		return newPila;
	}
	
	public Pila copy() {
		Pila newPila = new Pila();
		
		for (int i = 0; i < this.cantidadElementos; i++) {
			newPila.push(this.elementos[i]);
		}
		
		return newPila;
	}

	
	public Object top() {
		if (this.cantidadElementos > 0)
			return this.elementos[this.cantidadElementos - 1];
		
		return null;
	}
	
	public void show() {
		int i = 0;
		while (i < this.cantidadElementos) {
			System.out.println(this.elementos[i]);
			i++;
		}
	}
	
	public void push(Object object) {
		if (cantidadElementos >= elementos.length) {
			Object[] newElementos = new Object[cantidadElementos * 2];
			copiarElementos(newElementos);
			elementos = newElementos;
		}
		
		this.elementos[this.cantidadElementos++] = object;
	}
	
	public Object pop() {
		Object elementoRetirado = null;
		if (this.cantidadElementos != 0) {
			elementoRetirado = this.elementos[this.cantidadElementos - 1];
			elementos[this.cantidadElementos - 1] = null;
			this.cantidadElementos--;
		}
		
		return elementoRetirado;
	}
	
	public int size() {
		return this.cantidadElementos;
	}
	
	
	private void copiarElementos(Object[] object) {
		for (int i = 0; i < cantidadElementos; i++) {
			object[i] = this.elementos[i];
		}
	}
	
//	private void invertirArray(Object[] object) {
//		int i = this.cantidadElementos;
//		int j = 0;
//		while (i >= 0) {
//			object[j--] = this.elementos[i++];
//		}
//	}	

	
	public static void main(String[] args) {
		Pila pila1 = new Pila();
		pila1.push(Integer.valueOf(10));
		pila1.push(Integer.valueOf(20));
		pila1.push(Integer.valueOf(30));
		pila1.push(Integer.valueOf(40));
		pila1.push(Integer.valueOf(50));

		// ver elementos de la pila
		pila1.show();
		// ver tamanio de la pila
		System.out.println("Tamaño de la pila: " + pila1.size());
		// retirar ultimo elemento de la pila
		int valorRetirado = (int)pila1.pop();
		System.out.println("\nVer pila con elemento retirado");
		System.out.println("Tamaño de la pila: " + pila1.size());
		pila1.show();
		
		System.out.println("\nPila 2");
		Pila pila2 = pila1.copy();
		pila2.push(200);
		pila2.show();
		
		System.out.println("\nPila 3");
		Pila pila3 = pila2.reverse();
		pila3.show();
		
		System.out.println("Consultar ultimo elemento del array: ");
		System.out.println("El ultimo elemento de la pila3 es " + pila3.top());
	}
}
