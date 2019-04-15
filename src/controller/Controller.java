package controller;

import java.util.ArrayList;

public class Controller {
	Document document;
	DocumentFactory factory;
	Invoker invoker;
	public Controller(){
		document = new Document();
		factory = new DocumentFactory();
		invoker = new Invoker();
	}
	
	public void setType(String type){
		document.setType(type);
	}
	
	public void factoryMethod() {
		document = factory.factoryMethod(document.getType());
	}
	
	public void print() {
		document.printContents();
	}
	
	public void setAuthor(String author) {
		document.setAuthor(author);
	}
	
	public void setCopyright(String copyright) {
		document.setCopyright(copyright);
	}
	
	public void test() {
		document.test();
	}
	
	public String getContents() {
		return document.getContents();
	}
	
	/*public String getStringContents() {
		return document.getStringContents();
	}*/

	public String getType() {
		return document.getType();
	}

	public String getAuthor() {
		return document.getAuthor();
	}

	public void setContents(String text) {
		document.setContents(text);
		
	}
		
}
