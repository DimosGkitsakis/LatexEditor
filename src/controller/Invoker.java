package controller;

import java.util.HashMap;

public class Invoker {
	private HashMap<String, Command> commands = new HashMap<String, Command>();
	
	//Creates all default command objects 
	
	CommandSave save = new CommandSave();	
	CommandChapter chapter = new CommandChapter();
	CommandSection section = new CommandSection();
	CommandSubsection subsection = new CommandSubsection();
	CommandSubsubsection subsubsection = new CommandSubsubsection();
	CommandItemize itemize = new CommandItemize();
	CommandEnumerate enumerate = new CommandEnumerate();
	CommandTable table = new CommandTable();
	CommandFigure figure = new CommandFigure();
	
	//Adds all default commands in the Hashmap
	public Invoker(){
		commands.put("save", save);
		commands.put("chapter", chapter);
		commands.put("section", section);
		commands.put("subsection", subsection);
		commands.put("subsubsection", subsubsection);
		commands.put("itemize", itemize);
		commands.put("enumerate",enumerate);
		commands.put("table", table);
		commands.put("figure", figure);
	}
	
	public void addCommand(String commandKey, Command command){
		commands.put(commandKey, command);
	}
	
	public void issueCommand(String commandKey) {
		commands.get(commandKey).execute();
	}

}
