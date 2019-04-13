package controller;

import java.util.ArrayList;

public class Empty extends Document{
	

	public Document setEmpty(String author, String date, String copyright){
		this.author=author;
		this.date=date;
		this.copyright=copyright;
		versionID=0;
		//Maybe contents needed
		return new Document(new String(this.type), new String(this.author), new String(this.date), new String(this.copyright),new Integer(this.versionID),new ArrayList(this.contents));
	}
}
