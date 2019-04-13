package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentFactory {
	
	String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	Article article = new Article();
	Report report = new Report();
	Book book = new Book();
	Letter letter = new Letter();
	Empty empty = new Empty();

	public Document factoryMethod(String type){ //isws 8elei static
		// TODO  document.setAuthor(orisma);
		// TODO  document.setCopyright(orisma);
		if (type.equals("article")){
			return article.setArticle("author", date, "copyright");
		}else if (type.equals("report")){
			return report.setReport("author", date, "copyright");
		}else if (type.equals("book")){
			return book.setBook("author", date, "copyright");
		}else if (type.equals("letter")){
			return letter.setLetter("author", date, "copyright");
		}else{
			return empty.setEmpty("author", date, "copyright");
		}
	}
}
