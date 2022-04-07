package ar.edu.unlp.info.oo2.Calculo_Sueldos;

public class Planta extends Empleado {

	private boolean casado;
	private int cantHijos;
	private int antiguedadEnAnios;
	
	public Planta(boolean estaCasado, int hijos, int antiguedad) {
		super();
		casado = estaCasado;
		cantHijos = hijos;
		antiguedadEnAnios = antiguedad;
	}

	@Override
	protected double calcularAdicional() {
		double adicional = 0;
		
		if (casado) {
			adicional += 5000;
		}
		adicional += (2000 * cantHijos) + 
						(2000 * antiguedadEnAnios);
		return adicional;
	}
	
	
	
}
