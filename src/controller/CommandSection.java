package controller;

public class CommandSection implements Command{

	Section section = new Section();
	public void execute() {
		section.dowork();
		
	}

}
