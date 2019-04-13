package controller;

import java.util.ArrayList;

public class Document {
	
	protected String type = " ";
	protected String author = " ";
	protected String date = " ";
	protected String copyright = " ";
	protected int versionID = 0;
	//private String contents;
	protected ArrayList<String> contents = new ArrayList<String>();
	
	public Document(){
		//default construtor
	}
	
	
	public Document(String type, String author, String date, String copyright, int versionID, ArrayList contents){
		this.type=type;
		this.author=author;
		this.date=date;
		this.copyright=copyright;
		this.versionID=versionID;
		this.contents=contents;
	}

	
	public void setType(String type) {
		this.type=type;
	}
	
	public void addContents(String content){
		contents.add(content);
	}
	
	public ArrayList getContents(){
		return contents;
	}
	
	public void setAuthor(String author){
		this.author=author;
	}
	
	public void setCopyright(String copyright){
		this.copyright=copyright;
	}

	//TEST GIA PRINT
	public void printContents() {
		for(String i: contents) {
			System.out.println(i);
		}
	}
	
	
	public void save(){
		//TODO
	}
	/*
	public Document deepCopy(){
		return new Document(new String(this.type), new String(this.author), new String(this.date), new String(this.copyright),new String(this.versionID),new String(this.contents));
	}*/


	public String getType() {
		return type;
	}
	
}