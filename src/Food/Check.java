package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Check extends Welcome{

	public JFrame Checkframe;
	public JLabel lblAppetizer;
	public JLabel lblMaincourse;
	public JLabel lblDessert;
	public JLabel lblDrinks;
	public JLabel lblSlides;
	public JLabel lblTotal;
	public JLabel lblNewLabel;
	public JLabel lblNone;
	public JLabel lblNewLabel_1;
	public JLabel lblNone_1;
	public JLabel lblNewLabel_2;
	public JLabel lblNone_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNone_3;
	public JLabel lblNewLabel_4;
	public JLabel lblNone_4;
	public JLabel lblNone_5;
	private JButton btnDone;
	private JLabel lblNewLabel_5;
	private JLabel lblBill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check window = new Check();
					window.Checkframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Check() {
		CheckInitialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void CheckInitialize() {
		Checkframe = new JFrame();
		//frame.setVisible(true);
		Checkframe.setBounds(100, 100, 1024, 840);
		Checkframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Checkframe.getContentPane().setLayout(null);
		
		lblAppetizer = new JLabel("Appetizer :");
		lblAppetizer.setForeground(new Color(255, 255, 255));
		lblAppetizer.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblAppetizer.setBounds(164, 179, 185, 46);
		Checkframe.getContentPane().add(lblAppetizer);
		
		lblMaincourse = new JLabel("MainCourse :");
		lblMaincourse.setForeground(new Color(255, 255, 255));
		lblMaincourse.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblMaincourse.setBounds(164, 251, 204, 37);
		Checkframe.getContentPane().add(lblMaincourse);
		
		lblDessert = new JLabel("Dessert :\r\n");
		lblDessert.setForeground(new Color(255, 255, 255));
		lblDessert.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblDessert.setBounds(164, 321, 204, 27);
		Checkframe.getContentPane().add(lblDessert);
		
		lblDrinks = new JLabel("Drinks :\r\n");
		lblDrinks.setForeground(new Color(255, 255, 255));
		lblDrinks.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblDrinks.setBounds(164, 389, 204, 29);
		Checkframe.getContentPane().add(lblDrinks);
		
		lblSlides = new JLabel("Slides :");
		lblSlides.setForeground(new Color(255, 255, 255));
		lblSlides.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblSlides.setBounds(164, 462, 204, 37);
		Checkframe.getContentPane().add(lblSlides);
		
		lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(255, 255, 255));
		lblTotal.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblTotal.setBounds(172, 583, 177, 61);
		Checkframe.getContentPane().add(lblTotal);
		
		lblNewLabel = new JLabel("None\r\n");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(396, 183, 275, 38);
		Checkframe.getContentPane().add(lblNewLabel);
		
		lblNone = new JLabel("None");
		lblNone.setForeground(new Color(255, 255, 255));
		lblNone.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone.setBounds(706, 189, 120, 27);
		Checkframe.getContentPane().add(lblNone);
		
		lblNewLabel_1 = new JLabel("None\r\n");
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(396, 256, 275, 27);
		Checkframe.getContentPane().add(lblNewLabel_1);
		
		lblNone_1 = new JLabel("None");
		lblNone_1.setForeground(new Color(255, 255, 255));
		lblNone_1.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone_1.setBounds(706, 252, 92, 35);
		Checkframe.getContentPane().add(lblNone_1);
		
		lblNewLabel_2 = new JLabel("None\r\n");
		lblNewLabel_2.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(396, 320, 275, 28);
		Checkframe.getContentPane().add(lblNewLabel_2);
		
		lblNone_2 = new JLabel("None");
		lblNone_2.setForeground(new Color(255, 255, 255));
		lblNone_2.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone_2.setBounds(706, 321, 92, 27);
		Checkframe.getContentPane().add(lblNone_2);
		
		lblNewLabel_3 = new JLabel("None\r\n");
		lblNewLabel_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(396, 389, 275, 29);
		Checkframe.getContentPane().add(lblNewLabel_3);
		
		lblNone_3 = new JLabel("None");
		lblNone_3.setForeground(new Color(255, 255, 255));
		lblNone_3.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone_3.setBounds(706, 389, 82, 29);
		Checkframe.getContentPane().add(lblNone_3);
		
		lblNewLabel_4 = new JLabel("None\r\n");
		lblNewLabel_4.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(396, 464, 275, 33);
		Checkframe.getContentPane().add(lblNewLabel_4);
		
		lblNone_4 = new JLabel("None");
		lblNone_4.setForeground(new Color(255, 255, 255));
		lblNone_4.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone_4.setBounds(706, 462, 82, 29);
		Checkframe.getContentPane().add(lblNone_4);
		
		lblNone_5 = new JLabel("None");
		lblNone_5.setForeground(new Color(255, 255, 255));
		lblNone_5.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		lblNone_5.setBounds(706, 601, 92, 27);
		Checkframe.getContentPane().add(lblNone_5);
		
		btnDone = new JButton("Done");
		btnDone.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnDone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			   Checkframe.dispose() ; 
			   Welcome window = new Welcome();
			   window.Welcomeinitialize();
			   window.WelcomeFrame.setVisible(true) ; 
			}
		});
		btnDone.setBounds(814, 747, 168, 46);
		Checkframe.getContentPane().add(btnDone);
		
		lblBill = new JLabel("Check");
		lblBill.setForeground(new Color(255, 255, 255));
		lblBill.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblBill.setBounds(61, 39, 235, 78);
		Checkframe.getContentPane().add(lblBill);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Check.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel_5.setBounds(0, 0, 1010, 803);
		Checkframe.getContentPane().add(lblNewLabel_5);
	}
}
