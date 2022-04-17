package ar.edu.unlp.info.oo2.DecodificadorDePelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Sugerible {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return peliculas
				.stream()
				.filter(p->!reproducidas.contains(p))
				.sorted(Comparator.comparingDouble(Pelicula::getPuntaje))
				.collect(Collectors.toList());
	}

}