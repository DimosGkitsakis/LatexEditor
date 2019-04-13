package controller;

public class CommandSubsubsection implements Command {
	Subsubsection subsubsection = new Subsubsection();

	@Override
	public void execute() {
		subsubsection.doWork();
		
	}
	
}
