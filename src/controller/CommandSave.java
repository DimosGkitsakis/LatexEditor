package controller;


public class CommandSave implements Command{
	private Save save = new Save();
	
	public void execute(){
		save.doWork();
	}

}
