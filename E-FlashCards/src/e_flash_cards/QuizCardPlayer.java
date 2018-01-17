package e_flash_cards;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

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
	
	public void labels() {
		questionLabel = new JLabel("Question");
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		answerLabel = new JLabel("Answer");
		answerLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
	}
	
	public void menuBar() {
		
	}
	
	public void button() {
		checkButton = new JButton("CHECK");
		checkButton.setFont(new Font("Tahoma", Font.BOLD, 14));
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		{
			menuBar = new JMenuBar();
			setJMenuBar(menuBar);
			{
				menuBarFile = new JMenu("File");
				menuBar.add(menuBarFile);
				{
					menuItemOpen = new JMenuItem("Open");
					menuBarFile.add(menuItemOpen);
				}
			}
		}
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		labels();
		button();
		
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
}
