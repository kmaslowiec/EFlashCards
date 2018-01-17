package e_flash_cards;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizCardPlayer extends JFrame {

	private JPanel contentPane;
	private JLabel answerLabel;
	private JLabel questionLabel;
	private JButton checkButton;
	private JMenuBar menuBar;
	private JMenu menuBarFile;
	private JMenuItem menuItemOpen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizCardPlayer frame = new QuizCardPlayer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QuizCardPlayer() {
		setTitle("Flash Cards");
		initComponents();
		
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		labels();
		button();
		menuBar();
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(answerLabel)
								.addComponent(questionLabel)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(239)
							.addComponent(checkButton)))
					.addContainerGap(296, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(questionLabel)
					.addGap(223)
					.addComponent(checkButton)
					.addGap(19)
					.addComponent(answerLabel)
					.addContainerGap(312, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void labels() {
		questionLabel = new JLabel("Question");
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		answerLabel = new JLabel("Answer");
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
	
	public void menuBar() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		menuBarFile = new JMenu("File");
		menuBar.add(menuBarFile);
			
		menuItemOpen = new JMenuItem("Open");
		menuItemOpen.addActionListener(new OpenListener());
		menuBarFile.add(menuItemOpen);
			
		
	}
	
	public void button() {
		checkButton = new JButton("CHECK");
		checkButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
	
	//Logic:
	
	public void readFile() {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Kondzik\\Desktop\\EFlashCardsSaves\\Hello.txt"))){
			
			String line = null;
			
			while((line = reader.readLine()) != null) {
				
				questionLabel.setText(line);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	
	//End of Logic
	
	// Action Listeners Inner Classes
	
	public class OpenListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			readFile();
			
			
		}
		
	}
	
}
