package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;



public class DocumentManager {
	Document document = new Document();

	HashMap <String, Document> map = new HashMap <String, Document>();
	
	public DocumentManager(){
		//fillHashMap();
	}
	
	//get date
	String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	
	
	/*public void fillHashMap() {
		map.put("article", document.setArticle("author name", date, "contents"));
		map.put("report", document.setReport("author name",date,"contents"));
		map.put("book", document.setBook("author name",date,"contents"));
		map.put("letter", document.setReport(date,"copyrights","contents"));

	}*/

	public Document getDocument(String type){
		Document document = map.get(type);
		return document;
	}
}
