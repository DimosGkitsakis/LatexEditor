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
	
	
	public Gui(){
		super("Power Rangers LaTeX Editor");
		
		setLayout(new FlowLayout());
		
		New = new JButton("New Document");
		add(New);
		
		field = new JTextArea(80,80);
		//field.insert("Kwstas dsad", 2);
		add(field);
		

		Action action = new Action();
		New.addActionListener(action);
		System.out.print("msaiodjmasd");
		controller.print();
		/*contents=controller.getContents();
		field.append(contents.get(0));
		System.out.println(contents.size());
		for(int i=0; i<contents.size();i++) {
			System.out.print("hi");
			System.out.println(contents.get(i));
			field.append(contents.get(i));
		}*/
		
		//isws kanei update
        new Thread(workRunner).start();
        SwingUtilities.updateComponentTreeUI(this);


	}
	
	//https://community.oracle.com/thread/2083968
	
	//anti gia append, set
	//kai sunarthsh pou enhmerwnei ta contents an einai diaforetika apo ta yparxo
	
    Runnable workRunner = new Runnable() {
        public void run() {
        	while(true) {
                field.append("geia");
                field.append("\n");
                /*NA TO DIORTHWSW  provlima sto settext sthn for
                 contents=controller.getContents();
        		//field.append(contents.get(0));
        		System.out.println(contents.size());
        		for(int i=0; i<contents.size();i++) {
        			System.out.println(contents.get(i));
        			field.setText(contents.get(i));
                 */
                try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	}
        }
    };
	
	
	
	private class Action implements ActionListener{

		public void actionPerformed(ActionEvent e) {
	        //JFrame newDocumentFrame = new JFrame();
			newDocumentFrame.setDefaultCloseOperation(newDocumentFrame.DISPOSE_ON_CLOSE);
			newDocumentFrame.setLayout(new FlowLayout());
			JButton Article = new JButton("Article");
			JButton Book = new JButton("Book");
			JButton Report = new JButton("Report");
			JButton Letter = new JButton("Letter");
			JButton Empty = new JButton("<Empty>");
			newDocumentFrame.add(Article);
			newDocumentFrame.add(Book);
			newDocumentFrame.add(Report);
			newDocumentFrame.add(Letter);
			newDocumentFrame.add(Empty);
			newDocumentFrame.setSize(250, 250);
			newDocumentFrame.setVisible(true);

			
			
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
		
		
		//Action for Article
		private class ArticleAction implements ActionListener {

			public void actionPerformed(ActionEvent e) {
				controller.setType("article");
				controller.factoryMethod();
				String author = JOptionPane.showInputDialog("Enter author name: ");
				String copyright = JOptionPane.showInputDialog("Enter copyrights: ");

				controller.setAuthor(author);
				controller.setCopyright(copyright);		
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
				controller.print(); //print gia tests
				
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
				newDocumentFrame.dispose();

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
