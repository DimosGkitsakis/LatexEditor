package controller;

public class CommandTable implements Command{
	Table table = new Table();

	@Override
	public void execute() {
		table.doWork();
	}
}
