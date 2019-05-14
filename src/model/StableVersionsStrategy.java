package model;

import java.util.ArrayList;

public class StableVersionsStrategy implements VersionsStrategy{
	private Document document; 
	private ArrayList <Document> versionsHistory;
	public StableVersionsStrategy() {
		document = new Document();
		versionsHistory = new ArrayList<Document>();
	}
	
	public void putVersion(Document document) {
		this.document=document;
		versionsHistory.add(document);
	}
	public Document getVersion() {
		return versionsHistory.get(versionsHistory.size()-1);
	}
	public void setEntireHistory(ArrayList <Document> versionsHistory) {
		this.versionsHistory = versionsHistory;
	}//Insert document list as paremeter
	public ArrayList<Document> getEntireHistory(){
		return versionsHistory;
	}
	
	public void removeDocument() {
		versionsHistory.remove(versionsHistory.size()-1);
	}
}
