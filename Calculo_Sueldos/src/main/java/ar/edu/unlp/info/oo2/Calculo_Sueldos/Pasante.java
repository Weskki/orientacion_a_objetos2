package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Pasante extends Empleado {

	private int cantExamenes;
	
	public Pasante(int examenes) {
		super();
		sueldoBase = 20000;
		cantExamenes = examenes;
	}
	
	@Override
	protected double calcularAdicional() {
		return 2000 * this.cantExamenes;
	}
	
}
