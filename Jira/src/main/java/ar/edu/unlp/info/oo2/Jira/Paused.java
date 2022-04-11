package ar.edu.unlp.info.oo2.Jira;

public class Paused extends State {

	public Paused(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void start() {
		throw new RuntimeException("This Item was already started");
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("This Item was already paused");
	}

	@Override
	protected void finish() {
		this.item.changeState(new Finished(item));
	}

	@Override
	protected void workedTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void addComment(String aComment) {
		this.item.comment(aComment);
	}

}
