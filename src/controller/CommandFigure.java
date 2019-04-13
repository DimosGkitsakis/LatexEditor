package controller;

public class CommandFigure implements Command{
	Figure figure = new Figure();

	@Override
	public void execute() {
		figure.doWork();
		
	}
	
}
