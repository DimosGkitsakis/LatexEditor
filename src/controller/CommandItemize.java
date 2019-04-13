package controller;

public class CommandItemize implements Command{

	Itemize itemize = new Itemize();
	public void execute() {
		itemize.doWork();
		
	}

}
