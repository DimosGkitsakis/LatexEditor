package model;

import java.io.IOException;
import java.util.HashMap;

import controller.Controller;

public class Invoker {
	
	private HashMap<String, Command> commands = new HashMap<String, Command>();
	Controller controller;
			
	public Invoker(Controller controller){
		//Get a copy of the current controller
		this.controller=controller;
		//Creates all default command objects &	adds all default commands in the Hashmap
		SaveCommand save = new SaveCommand(controller);	
		commands.put("save", save);
		LoadCommand load = new LoadCommand(controller);
		commands.put("load", load);
	}
	
	public void addCommand(String commandKey, Command command){
		commands.put(commandKey, command);
	}
	
	public void issueCommand(String commandKey) throws IOException {
		commands.get(commandKey).execute();
	}

}
