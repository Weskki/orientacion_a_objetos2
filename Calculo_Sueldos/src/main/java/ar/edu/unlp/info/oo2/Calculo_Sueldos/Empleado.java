package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public abstract class Empleado {
	
	protected String nombre;
	protected double sueldoBase;
	protected double horasTrabajadas;
	
	public Empleado() {
		
	}
	
	public double sueldo() {
		return sueldoBase + this.calcularAdicional()
				- this.descuento();
	}
	
	protected abstract double calcularAdicional();
	
	protected double descuento() {
		return (this.sueldoBase * 0.13) 
				+ (this.calcularAdicional() * 0.05);
	}
}
