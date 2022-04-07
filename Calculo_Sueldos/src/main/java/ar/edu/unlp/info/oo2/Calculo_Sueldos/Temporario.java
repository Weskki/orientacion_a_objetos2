package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Temporario extends Empleado {

	private boolean casado;
	private int cantHijos;
	
	public Temporario(int hijos, boolean estaCasado) {
		super();
		casado = estaCasado;
		cantHijos = hijos;
	}
	
	@Override
	protected double calcularAdicional() {
		double adicional = 0;
		
		if (casado) {
			adicional += 5000;
		}
		adicional += 2000 * cantHijos;
		return adicional;
	}

}
