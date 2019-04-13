package controller;

public class CommandChapter implements Command{
	Chapter chapter = new Chapter();
	public void execute() {
		chapter.doWork();
		
	}

}
