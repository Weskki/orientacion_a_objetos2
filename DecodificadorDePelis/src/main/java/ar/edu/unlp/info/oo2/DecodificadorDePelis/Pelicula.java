package ar.edu.unlp.info.oo2.DecodificadorDePelis;
import java.util.*;

public class Pelicula {
	
	private String titulo;
	private int anoEstreno;
	private double puntaje;
	private List<Pelicula> similares;
	
	public Pelicula(String unTitulo, int unAñoEstreno, double unPuntaje, List<Pelicula> unaLista) {
		titulo = unTitulo; 
		anoEstreno = unAñoEstreno; 
		puntaje = unPuntaje;
		similares = unaLista;
		
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getAnoEstreno() {
		return anoEstreno;
	}

	public double getPuntaje() {
		return puntaje;
	}
	
	public List<Pelicula> getSimilares(){
		return similares;
	}
	
	public void agregarASimilares(Pelicula unaPeliSimilar) {
		similares.add(unaPeliSimilar);
	}


	
	

}
