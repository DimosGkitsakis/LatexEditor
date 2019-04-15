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
		type = " ";
		author = " ";
		date = " ";
		copyright = " ";
		versionID = 0;
	}
	
	
	public Document(String type, String author, String date, String copyright, int versionID, ArrayList contents){
		this.type=type;
		this.author=author;
		this.date=date;
		this.copyright=copyright;
		this.versionID=versionID;
		this.contents=contents;
	}
	
	public void clear() {
		type = " ";
		author = " ";
		date = " ";
		copyright = " ";
		contents.clear();
		versionID = 0;
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

	public String getStringContents() {
		String cont = "";
		for(int i=0; i<contents.size(); i++) {
			cont += contents.get(i);
		}
		return cont;
	}
	
	
	//TEST GIA PRINT
	public void printContents() {
		for(String i: contents) {
			System.out.println(i);
		}
		System.out.println(author);
		System.out.println(copyright);
		System.out.println(date);
		System.out.println(versionID);
		System.out.println(type);

	}
	
	public void test() {
		System.out.println(author);
		System.out.println(copyright);
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
