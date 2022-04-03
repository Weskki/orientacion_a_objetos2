package ar.edu.unlp.info.oo2.Topografia;

public class Parte extends Topografia{
	private int proporcionAgua;

	@Override
	public boolean compararTopografia(Topografia topografia) {
		return false;
	}
	
	public int getProporcionAgua() {
		return proporcionAgua;
	}

	public void setProporcionAgua(int proporcionAgua) {
		this.proporcionAgua = proporcionAgua;
	}
}
