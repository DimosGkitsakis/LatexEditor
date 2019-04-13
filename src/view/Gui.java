package view;
import controller.*;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Gui extends JFrame{
	
	private JButton New;
	Controller controller = new Controller();
	
	public Gui(){
		super("Power Rangers LaTeX Editor");
		
		setLayout(new FlowLayout());
		
		New = new JButton("New Document");
		add(New);
		
		JTextArea field = new JTextArea(80,80);
		//field.insert("Kwstas dsad", 2);
		add(field);
		
		Action action = new Action();
		New.addActionListener(action);
	}
	
	private class Action implements ActionListener{

		public void actionPerformed(ActionEvent e) {
	        JFrame myFrame = new JFrame();
			myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
			myFrame.setLayout(new FlowLayout());
			JButton Article = new JButton("Article");
			JButton Book = new JButton("Book");
			JButton Report = new JButton("Report");
			JButton Letter = new JButton("Letter");
			JButton Empty = new JButton("<Empty>");
			myFrame.add(Article);
			myFrame.add(Book);
			myFrame.add(Report);
			myFrame.add(Letter);
			myFrame.add(Empty);
			myFrame.setSize(250, 250);
			myFrame.setVisible(true);
			
			//actions
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

		}
		
		private class ArticleAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("article");
				controller.factoryMethod();
				
				//AXRHSTA PANEL
		        JFrame myFrame = new JFrame();
				myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
				myFrame.setSize(250, 250);
				myFrame.setVisible(true);
			}
			
		}
		private class BookAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("book");
				controller.factoryMethod();

		        JFrame myFrame = new JFrame();
				myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
				myFrame.setSize(250, 250);

				myFrame.setVisible(true);

			}
			
		}
		private class ReportAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("report");
				controller.factoryMethod();
				System.out.println("geia");
				controller.print();
				System.out.println("geia2");
		        JFrame myFrame = new JFrame();
				myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
				myFrame.setSize(250, 250);

				myFrame.setVisible(true);

			}
			
		}
		private class LetterAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("letter");
				controller.factoryMethod();

		        JFrame myFrame = new JFrame();
				myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
				myFrame.setSize(250, 250);

				myFrame.setVisible(true);

			}
			
		}
		private class EmptyAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("empty");
		        JFrame myFrame = new JFrame();
				myFrame.setDefaultCloseOperation(myFrame.DISPOSE_ON_CLOSE);
				myFrame.setSize(250, 250);

				myFrame.setVisible(true);

			}
			
		}

		
	}	
	
	public static void main(String[] args) {
		Gui g = new Gui();
		g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		g.setSize(900,900);
		
		g.setVisible(true);
	}
}
