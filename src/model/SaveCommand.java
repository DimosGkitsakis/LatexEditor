package model;

import java.io.IOException;

import controller.Controller;

public class SaveCommand implements Command{
	private Save save = new Save();
	Controller controller;
	public SaveCommand(Controller controller) {
		this.controller=controller;
	}
	public void execute() throws IOException{
		save.saveFile(controller.getFileName(),controller.getFilePath(),controller.getContents());
		save.saveInfo(controller.getAuthor(),controller.getDate(),controller.getVersionID(),controller.getCopyright(),controller.getFileName(),controller.getFilePath());
	}
}
