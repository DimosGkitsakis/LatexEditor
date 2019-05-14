//Onoma		Epwnymo		AM
//Spyridwn	Kaloudis	2447
//Dimos		Gkitsakis	2425
//Mwlos		Ioannis		2500

package controller;

import java.io.IOException;

import model.Document;
import model.DocumentFactory;
import model.Invoker;
import model.VersionsStrategy;
import model.VersionsStrategyFactory;

public class Controller {
	Document document;
	DocumentFactory factory;
	Invoker invoker;
	String fileName;
	String path;
	String strategyVersion;
	VersionsStrategy strategy;
	VersionsStrategyFactory strategyFactory;
	public Controller(){
		document = new Document();
		factory = new DocumentFactory();
	}
	
	//Constructor for save & load (Invoker)
	public Controller(Document document2, DocumentFactory factory2, String fileName2, String path2) {
		fileName=fileName2;
		path=path2;
		document=document2;
		factory=factory2;
	}

	//Setters
	public void setType(String type){
		document.setType(type);
	}
	
	public void setAuthor(String author) {
		document.setAuthor(author);
	}
	
	public void setCopyright(String copyright) {
		document.setCopyright(copyright);
	}

	public void setContents(String text) {
		document.setContents(text);
	}

	public void setFileName(String name){
		fileName=name;
	}
	
	public void setFilePath(String path){
		this.path=path;
	}

	public void setDate(String date) {
		document.setDate(date);
	}

	public void setVersionID(int parseInt) {
		document.setVersionID(parseInt);
		
	}	
	
	//Set up a new Document
	public void factoryMethod() {
		document = factory.factoryMethod(document.getType());
	}

	//Getters
	public String getContents() {
		return document.getContents();
	}
	
	public String getType() {
		return document.getType();
	}

	public String getAuthor() {
		return document.getAuthor();
	}	
	
	public String getFileName(){
		return fileName;
	}
	
	public String getFilePath(){
		return path;
	}
	
	public String getDate() {
		return document.getDate();
	}

	public int getVersionID() {
		return document.getVersionID();
	}

	public String getCopyright() {
		return document.getCopyright();
	}
	
	//Add contents at the end
	public void addContents(String st) {
		document.addContents(st);
	}

	//Get copy of controller to access a clone of all fields
	public Controller getController(){
		return new Controller(this.document,this.factory,this.fileName,this.path);
	}
	
	//Prints for tests
	public void print() {
		document.printContents();
	}
	
	public void test() {
		document.test();
	}

	//Commands (Save & Load)
	public void save() throws IOException {
		invoker = new Invoker(getController());
		invoker.issueCommand("save");
	}


	public void load() throws IOException {
		invoker = new Invoker(getController());
		invoker.issueCommand("load");
		
	}
	
	public void setStrategy(String strategyVersion) {
		strategyFactory = new VersionsStrategyFactory(strategyVersion);
		strategy = strategyFactory.createStrategy();
		strategy.putVersion(document);
	}
}
