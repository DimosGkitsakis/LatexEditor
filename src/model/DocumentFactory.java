package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DocumentFactory {
	
	String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
	Article article = new Article();
	Report report = new Report();
	Book book = new Book();
	Letter letter = new Letter();
	Empty empty = new Empty();

	public Document factoryMethod(String type){
		if (type.equals("article")){
			return article.setArticle(date);
		}else if (type.equals("report")){
			return report.setReport(date);
		}else if (type.equals("book")){
			return book.setBook(date);
		}else if (type.equals("letter")){
			return letter.setLetter(date);
		}else{
			return empty.setEmpty(date);
		}
	}
}
