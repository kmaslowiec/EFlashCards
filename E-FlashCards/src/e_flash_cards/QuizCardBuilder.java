package e_flash_cards;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class QuizCardBuilder extends JFrame {

	private JPanel contentPane;
	private JLabel questionLabel;
	private JLabel answerLabel;
	private JTextArea questionText;
	private JTextArea answerText;
	private JMenuBar menuBar;
	private JMenu menuBarFile;
	private JMenuItem menuItemNew;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizCardBuilder frame = new QuizCardBuilder();
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
	public QuizCardBuilder() {
		gui();
	}

	public void questionArea() {
		questionLabel = new JLabel("Question:");
		questionLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

		questionText = new JTextArea();
		questionText.setBorder(BorderFactory.createLoweredBevelBorder());

	}

	public void answerArea() {
		answerLabel = new JLabel("Answer:");
		answerLabel.setFont(new Font("Tahoma", Font.BOLD, 14));

		answerText = new JTextArea();
		answerText.setBorder(BorderFactory.createLoweredBevelBorder());

	}

	public void menuBar() {
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		menuBarFile = new JMenu("File");
		menuBar.add(menuBarFile);

		menuItemNew = new JMenuItem("New");
		menuBarFile.add(menuItemNew);
	}

	public void gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		menuBar();
		questionArea();
		answerArea();

		JButton btnNewButton = new JButton("NEXT CARD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(questionText,
								GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(278).addComponent(questionLabel))
						.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(answerText,
								GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(279).addComponent(answerLabel)))
				.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap(271, Short.MAX_VALUE)
						.addComponent(btnNewButton).addGap(260)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(5).addComponent(questionLabel)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(questionText, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(answerLabel).addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(answerText, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(btnNewButton).addContainerGap(40, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
