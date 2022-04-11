package ar.edu.unlp.info.oo2.Jira;

public class Finished extends State {

	public Finished(ToDoItem anItem) {
		super(anItem);
	}

	@Override
	protected void start() {
		throw new RuntimeException("This Item was already finished");
	}

	@Override
	protected void togglePause() {
		throw new RuntimeException("This Item was already finished");
	}

	@Override
	protected void finish() {
		throw new RuntimeException("This Item was already finished");
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
