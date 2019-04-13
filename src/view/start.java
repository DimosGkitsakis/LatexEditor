package view;
import controller.*;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class start {

	private JFrame frame;
	Document document = new Document();
	String type = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				try {
					start window = new start();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the Application.
	 */
	public start() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 968, 732);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 125, 932, 558);
		frame.getContentPane().add(textArea);
		
		JButton btnCreateDocument = new JButton("New Document");
		btnCreateDocument.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DocumentSelection docSel = new DocumentSelection();
				docSel.setVisible(true);
				//TODO TO X NA BGAZEI EMPTY
			}
		});
		btnCreateDocument.setBounds(10, 11, 136, 23);
		frame.getContentPane().add(btnCreateDocument);
	}
	
	private void setType(String type){
		this.type=type;
	}
}
