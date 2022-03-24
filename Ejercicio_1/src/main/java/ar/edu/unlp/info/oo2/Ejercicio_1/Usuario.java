package ar.edu.unlp.info.oo2.Ejercicio_1;
import java.util.*;

public class Usuario {
	
	private String screenName;
	private String eMail;
	private Set<Tweet> tweets;
	
	public Usuario(String unNombre) {
		this.screenName = unNombre;
	}
	
	public boolean  crearTweet(String text) {
		Tweet nuevoTweet = new Tweet(text, this);
		return tweets.add(nuevoTweet);
	}
	
}
