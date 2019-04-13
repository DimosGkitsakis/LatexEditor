package controller;

public class Client {
	DocumentManager manager = new DocumentManager();
	
	//TODO
	public void doWork(String type){
		Document document = manager.getDocument(type);
	}
}
