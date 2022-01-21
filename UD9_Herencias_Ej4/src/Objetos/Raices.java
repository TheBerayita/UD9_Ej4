package Objetos;
/*
 * Autores: 
 * Pau Robuste
 * Jordi Ribellas
 * Albert Perez
 */
public class Raices {
	
	//Variables
	private double a;
	private double b;
	private double c;
	
	//Constructor
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		double raiz1 = (-b + Math.sqrt(getDiscriminate())) / (2*a);
		double raiz2 = (-b - Math.sqrt(getDiscriminate())) / (2*a);
		
		System.out.println("La primera soluci�n es: " + raiz1);
		System.out.println("La segunda soluci�n es: " + raiz2);
	}
	
	public void obtenerRaiz() {
		double raiz = (-b) / (2*a);
		
		System.out.println("La soluci�n es: " + raiz);
	}
	
	public double getDiscriminate() {
		return Math.pow(b, 2) - (4*a*c);
	}
	
	public boolean tieneRaices() {
		return getDiscriminate() > 0;
	}
	
	public boolean tieneRaiz() {
		return getDiscriminate() == 0;
	}
	
	public void calcular() {
		if (tieneRaices()) {
			obtenerRaices();
		} else if (tieneRaiz()) {
			obtenerRaiz();
		} else {
			System.out.println("No es posible sacar una soluci�n");
		}
	}
}
