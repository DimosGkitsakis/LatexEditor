package controller;

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
}
