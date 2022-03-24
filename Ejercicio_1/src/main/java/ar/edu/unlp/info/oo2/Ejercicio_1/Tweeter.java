package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.*;

public class Tweeter {
	private Set<Usuario> usuarios;
	private Set<Tweet> tweets;
	
	public Tweeter() {
		usuarios = new HashSet<Usuario>();
		tweets = new HashSet<Tweet>();
	}
	
	public void crearUsuario(String unNombre) {
		this.usuarios.add(new Usuario(unNombre));
	}
	
	public Retweet retweetear() {
		
	}
	
	
}
