package ar.edu.unlp.info.oo2.Jira;
import java.util.*;

public class ToDoItem {

	private State state;
	private String name;
	private List<String> comments;
	
	public ToDoItem(String aName) {
		state = new Pending(this);
		name = aName;
		comments = new ArrayList<String>();
	}
	
	/**
	* Pasa el ToDoItem a in-progress (siempre y cuando su estado actual sea
	* pending, si se encuentra en otro estado, no hace nada)
	*/
	public void start() {
		this.state.start();
	}
	/**
	* Pasa la tarea a paused si su estado es in-progress, o a in-progress si su
	* estado es paused. Caso contrario (pending o finished) genera un error
	* informando la causa específica del mismo
	*/
	public void togglePause() {
		this.state.togglePause();
	}
	/**
	* Pasa el ToDoItem a finished (siempre y cuando su estado actual sea
	* in-progress o pausada, si se encuentra en otro estado, no hace nada)
	*/
	public void finish() {
		this.state.finish();
	}
	/**
	* Retorna el tiempo que transcurrió desde que se inició la tarea (start)
	* hasta que se finalizó. En caso de que no esté finalizada, el tiempo que
	* haya transcurrido hasta el momento actual. Si la tarea no se inició,
	* genera un error informando la causa específica del mismo.
	*/
	public Duration workedTime() {
		return null;
	}
	/**
	* Agrega un comentario a la tarea siempre y cuando no haya finalizado. Caso
	* contrario no hace nada."
	*/
	public void addComment(String comment) {
		this.state.addComment(comment);
	}
	
	protected void changeState(State aState) {
		this.state = aState;
	}
	
	protected void comment(String aComment) {
		comments.add(aComment);
	}
	
}