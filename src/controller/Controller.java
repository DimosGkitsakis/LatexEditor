//Onoma		Epwnymo		AM
//Spyridwn	Kaloudis	2447
//Dimos		Gkitsakis	2425
//Mwlos		Ioannis		2500

package controller;

import java.io.IOException;
import java.util.HashMap;

import model.ChangeVersionsStrategyCommand;
import model.Command;
import model.DisableVersionsManagementCommand;
import model.Document;
import model.DocumentFactory;
import model.EnableVersionsManagementCommand;
import model.LoadCommand;
import model.RollbackToPreviousVersionCommand;
import model.SaveCommand;
import model.VersionsStrategy;
import model.VersionsStrategyFactory;

public class Controller {
	private Document document;
	private DocumentFactory factory;
	private String fileName;
	private String path;
	private String strategyVersion;
	private VersionsStrategy strategy;
	private VersionsStrategyFactory strategyFactory;
	private EnableVersionsManagementCommand enableVersions;
	private DisableVersionsManagementCommand disableVersions;
	private ChangeVersionsStrategyCommand changeStrategy;
	private int rollbackNum;
	
	public Controller(){
		document = new Document();
		factory = new DocumentFactory();
	}
	
	//Constructor for save & load (Invoker)
	public Controller(Document document2, DocumentFactory factory2, String fileName2, String path2, String strategyVersion) {
		fileName=fileName2;
		path=path2;
		document=document2;
		factory=factory2;
		this.strategyVersion=strategyVersion;
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
		return new Controller(this.document,this.factory,this.fileName,this.path,this.strategyVersion);
	}
	
	private HashMap<String, Command> commandsMap = new HashMap<String, Command>();

	public void commands() {
		SaveCommand save = new SaveCommand(document,fileName,path);
		commandsMap.put("save", save);
		LoadCommand load = new LoadCommand(getController());
		commandsMap.put("load", load);
		enableVersions = new EnableVersionsManagementCommand(strategyVersion);
		commandsMap.put("enableVersions", enableVersions);
		disableVersions = new DisableVersionsManagementCommand(strategy);
		commandsMap.put("disableVersions", disableVersions);
		changeStrategy = new ChangeVersionsStrategyCommand(strategy, strategyVersion);
		commandsMap.put("changeStrategy", changeStrategy);
		RollbackToPreviousVersionCommand rollback = new RollbackToPreviousVersionCommand(strategy, rollbackNum);
		commandsMap.put("rollback", rollback);
	}
	
	//Prints for tests
	public void print() {
		document.printContents();
	}
	
	public void test() {
		document.test();
	}
	
	public void issueCommand(String commandKey) throws IOException {
		commandsMap.get(commandKey).execute();
	}

	//Commands
	public void save() throws IOException {
		commands();
		issueCommand("save");
	}

	public void load() throws IOException {
		commands();
		issueCommand("load");
	}
	
	public void EnableVersions() throws IOException {
		commands();
		issueCommand("enableVersions");
		setStrategy(enableVersions.getStrategy());
	}
	
	public void DisableVersions() throws IOException {
		commands();
		issueCommand("disableVersions");
		setVersionID(0);
	}
	
	public void ChangeVersions() throws IOException {//TODO
		commands();
		issueCommand("changeStrategy");
		setStrategy(changeStrategy.getStrategy());
	}

	public void RollbackToPrevious() throws IOException {
		commands();
		issueCommand("rollback");
		document = strategy.getVersion();
	}

	//commands end here
	
	public void setRollback(int num) {
		rollbackNum=num;
	}
	
	public void setStrategyType(String strategyVersion) {
		this.strategyVersion = strategyVersion;
	}
	
	public void setStrategy(VersionsStrategy strategy) {
		this.strategy = strategy;
	}
	
	public String getStrategyType() {
		return strategyVersion;
	}

	public VersionsStrategy getStrategy() {
		return strategy;
	}

	
	public Document getDocument() {
		return document;
	}
	
}
