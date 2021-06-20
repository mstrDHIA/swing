package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Window;

import javax.swing.JTextField;
import java.awt.Canvas;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Welcome{
	public double total=0;
	public Appetizer app;
	public Dessert des;
	public MainCourse main;
	public SlideClass slide;
	public Drink drink;
	public static Check ch;
	public JFrame WelcomeFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {ch=new Check();
				ch.CheckInitialize();
				 
					Welcome window = new Welcome();
					window.WelcomeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		Welcomeinitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void Welcomeinitialize() {
		WelcomeFrame = new JFrame();
		WelcomeFrame.setBounds(100, 100, 1024, 840);
		WelcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WelcomeFrame.getContentPane().setLayout(null);
		
		JLabel lblABigVariety = new JLabel("a big variety of delicious and rich food ");
		lblABigVariety.setBounds(41, 291, 585, 55);
		WelcomeFrame.getContentPane().add(lblABigVariety);
		lblABigVariety.setForeground(Color.WHITE);
		lblABigVariety.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		
		JLabel lblWelcomeToOur = new JLabel("Welcome to our Restaurant ");
		lblWelcomeToOur.setForeground(Color.WHITE);
		lblWelcomeToOur.setFont(new Font("Century Gothic", Font.BOLD, 48));
		lblWelcomeToOur.setBounds(30, 22, 867, 180);
		WelcomeFrame.getContentPane().add(lblWelcomeToOur);
		
		JLabel lblInThisApplication = new JLabel("In this application you'll be able to choose your meal from");
		lblInThisApplication.setForeground(Color.WHITE);
		lblInThisApplication.setFont(new Font("Century Gothic", Font.PLAIN, 28));
		lblInThisApplication.setBounds(41, 235, 957, 46);
		WelcomeFrame.getContentPane().add(lblInThisApplication);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1010, 803);
		WelcomeFrame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNoThanks = new JButton("No thanks");
		btnNoThanks.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnNoThanks.setBackground(Color.WHITE);
		btnNoThanks.setBounds(785, 724, 171, 54);
		panel.add(btnNoThanks);
		
		JButton btnOk = new JButton("Ok");
		btnOk.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnOk.setBackground(new Color(255, 255, 255));
		btnOk.setBounds(604, 724, 171, 54);
		panel.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WelcomeFrame.dispose();
				Chooose choose=new Chooose();
				choose.ChooseInitialize();
				choose.ChoooseFrame.setVisible(true);
				
			}
		});
		
		JLabel lblBonApetit = new JLabel("Bon Apetit ");
		lblBonApetit.setForeground(Color.WHITE);
		lblBonApetit.setBounds(43, 391, 206, 77);
		panel.add(lblBonApetit);
		lblBonApetit.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Welcome.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		panel.add(lblNewLabel);
		
		
		
	}
}
