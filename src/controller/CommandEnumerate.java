package controller;

public class CommandEnumerate implements Command{
	Enumerate enumerate = new Enumerate();

	@Override
	public void execute() {
		enumerate.doWork();
		
	}
}
