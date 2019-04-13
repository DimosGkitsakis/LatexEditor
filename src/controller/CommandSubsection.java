package controller;

public class CommandSubsection implements Command{

	Subsection subsection = new Subsection();
	public void execute() {
		subsection.dowork();
		
	}

}
