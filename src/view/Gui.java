package view;
import controller.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Gui extends JFrame{
	
	private JButton New;
	private JFrame newDocumentFrame = new JFrame();
	private JTextArea field;
	Controller controller = new Controller();
	protected ArrayList<String> contents = new ArrayList<String>();
	private JButton Article;
	private JButton Report;
	private JButton Book;
	private JButton Letter;
	private JButton Empty;
	private Action action;
	private JButton Chapter;
	
	public Gui(){
		super("Power Rangers LaTeX Editor");
		
		setLayout(new FlowLayout());
		
		New = new JButton("New Document");
		add(New);
		
		//actions and new document buttons
		action = new Action();
		New.addActionListener(action);
		Article = new JButton("Article");
		Report = new JButton("Report");
		Book = new JButton("Book");
		Letter = new JButton("Letter");
		Empty = new JButton("<Empty>");
		
		//Command buttons

		Chapter = new JButton("Add Chapter");
		add(Chapter);
		ChapterAction chapterAction = new ChapterAction();
		Chapter.addActionListener(chapterAction);

		ArticleAction articleAction = new ArticleAction();
		Article.addActionListener(articleAction);
		BookAction bookAction = new BookAction();
		Book.addActionListener(bookAction);
		ReportAction reportAction = new ReportAction();
		Report.addActionListener(reportAction);
		LetterAction letterAction = new LetterAction();
		Letter.addActionListener(letterAction);
		EmptyAction emptyAction = new EmptyAction();
		Empty.addActionListener(emptyAction);

		//text area 
		field = new JTextArea(80,80);
		
		//field.insert("Kwstas dsad", 2);
		add(field);
		
		


	}	
	
	private class ChapterAction implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			System.out.println(field.getCaretPosition());
			field.insert("\n\\chapter\n", field.getCaretPosition());
		}
	
	}
	
	private class Action implements ActionListener{

		public void actionPerformed(ActionEvent e) {
	        //JFrame newDocumentFrame = new JFrame();
			newDocumentFrame.setDefaultCloseOperation(newDocumentFrame.DISPOSE_ON_CLOSE);
			newDocumentFrame.setLayout(new FlowLayout());
			newDocumentFrame.setSize(250, 250);
			newDocumentFrame.setVisible(true);
			

			newDocumentFrame.add(Article);
			newDocumentFrame.add(Book);
			newDocumentFrame.add(Report);
			newDocumentFrame.add(Letter);
			newDocumentFrame.add(Empty);

			//actions

		}
		
	}	
		//Action for Article
		private class ArticleAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("article");
				controller.factoryMethod();

				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);

				//field.selectAll();
				field.setText(controller.getStringContents());
				
				newDocumentFrame.dispose();
			}
			
		}
		
		//Action for Book
		private class BookAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("book");
				controller.factoryMethod();
				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);	
				
				field.setText(controller.getStringContents());

				newDocumentFrame.dispose();

			}
			
		}
		
		//Action for Report
		private class ReportAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("report");
				controller.factoryMethod();
				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);	
				
				field.setText(controller.getStringContents());
				
				newDocumentFrame.dispose();

			}
			
		}
		
		//Action for Letter
		private class LetterAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("letter");
				controller.factoryMethod();
				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);	
				
				field.setText(controller.getStringContents());
				
				newDocumentFrame.dispose();

			}
			
		}
		
		//Action for Empty
		private class EmptyAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("empty");
				controller.factoryMethod();
				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);

				field.setText(controller.getStringContents());

				newDocumentFrame.dispose();

			}
			
		}

		

	
	public static void main(String[] args) {
		Gui g = new Gui();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(900,900);
		g.setVisible(true);
	}
}
