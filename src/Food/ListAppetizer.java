package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class ListAppetizer extends Welcome{

	public JFrame AppetizerFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListAppetizer window = new ListAppetizer();
					window.AppetizerFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListAppetizer() {
		AppetizerInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	void AppetizerInitialize() {
		
		AppetizerFrame = new JFrame();
		//frame2.setVisible(true);
		AppetizerFrame.setBounds(100, 100, 1024, 840);
		AppetizerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AppetizerFrame.getContentPane().setLayout(null);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String bla=buttonGroup.getSelection().getActionCommand();
				String[] trah = bla.split(":");
				double price = Double.parseDouble(trah[1]);
				 app=new Appetizer(trah[0],price);
				 AppetizerFrame.dispose();
				 ch.lblNewLabel.setText(app.name);
					ch.lblNone.setText(Double.toString(app.price));
					
					Chooose choose=new Chooose();
					choose.ChooseInitialize();
					choose.ChoooseFrame.setVisible(true);
			}
		});
		btnConfirm.setBounds(635, 747, 168, 46);
		AppetizerFrame.getContentPane().add(btnConfirm);
		
		JRadioButton rdbtnGreenSalad = new JRadioButton("Green Salad");
		rdbtnGreenSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		rdbtnGreenSalad.setBackground(new Color(255, 255, 255));
		buttonGroup.add(rdbtnGreenSalad);
		rdbtnGreenSalad.setActionCommand("Green Salad:3.0");
		rdbtnGreenSalad.setBounds(60, 167, 243, 41);
		AppetizerFrame.getContentPane().add(rdbtnGreenSalad);
		
		JRadioButton rdbtnGrilledSalad = new JRadioButton("Grilled Salad");
		rdbtnGrilledSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnGrilledSalad);
		rdbtnGrilledSalad.setActionCommand("Grilled Salad:3.0");
		rdbtnGrilledSalad.setBounds(60, 418, 243, 41);
		AppetizerFrame.getContentPane().add(rdbtnGrilledSalad);
		
		JRadioButton rdbtnOmekHoureya = new JRadioButton("Omek houreya");
		rdbtnOmekHoureya.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnOmekHoureya);
		rdbtnOmekHoureya.setBounds(60, 293, 243, 41);
		rdbtnOmekHoureya.setActionCommand("Omek Houreya:3.0");

		AppetizerFrame.getContentPane().add(rdbtnOmekHoureya);
		
		JLabel lblTnd = new JLabel("3.00 TND");
		lblTnd.setForeground(new Color(255, 255, 255));
		lblTnd.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd.setBounds(348, 167, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd);
		
		JLabel lblTnd_1 = new JLabel("3.00 TND");
		lblTnd_1.setForeground(new Color(255, 255, 255));
		lblTnd_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1.setBounds(348, 418, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_1);
		
		JLabel lblTnd_2 = new JLabel("3.00 TND");
		lblTnd_2.setForeground(new Color(255, 255, 255));
		lblTnd_2.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2.setBounds(348, 299, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_2);
		
		JRadioButton rdbtnVegetablesSoup = new JRadioButton("Vegetables Soup");
		rdbtnVegetablesSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnVegetablesSoup);
		rdbtnVegetablesSoup.setBounds(545, 536, 242, 41);
		rdbtnVegetablesSoup.setActionCommand("Vegetables Soup:3.0");

		AppetizerFrame.getContentPane().add(rdbtnVegetablesSoup);
		
		JLabel lblTnd_3 = new JLabel("3.00 TND");
		lblTnd_3.setForeground(new Color(255, 255, 255));
		lblTnd_3.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_3.setBounds(818, 539, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_3);
		
		JRadioButton rdbtnFishSoup = new JRadioButton("Fish Soup");
		rdbtnFishSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnFishSoup);
		rdbtnFishSoup.setBounds(545, 167, 242, 41);
		rdbtnFishSoup.setActionCommand("Fish Soup:5.0");

		AppetizerFrame.getContentPane().add(rdbtnFishSoup);
		
		JLabel lblTnd_4 = new JLabel("5.00 TND");
		lblTnd_4.setForeground(new Color(255, 255, 255));
		lblTnd_4.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_4.setBounds(818, 170, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_4);
		
		JRadioButton rdbtnChickenSoup = new JRadioButton("Chicken Soup");
		rdbtnChickenSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChickenSoup);
		rdbtnChickenSoup.setBounds(545, 418, 242, 41);
		rdbtnChickenSoup.setActionCommand("Chiken Soup:4.0");

		AppetizerFrame.getContentPane().add(rdbtnChickenSoup);
		
		JLabel lblTnd_5 = new JLabel("4.00 TND");
		lblTnd_5.setForeground(new Color(255, 255, 255));
		lblTnd_5.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_5.setBounds(818, 421, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_5);
		
		JRadioButton rdbtnSeaFoodSoup = new JRadioButton("Sea Food Soup");
		rdbtnSeaFoodSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnSeaFoodSoup);
		rdbtnSeaFoodSoup.setBounds(545, 293, 242, 41);
		rdbtnSeaFoodSoup.setActionCommand("Sea Food Soup:6.0");

		AppetizerFrame.getContentPane().add(rdbtnSeaFoodSoup);
		
		JLabel lblSalades = new JLabel("Salades :");
		lblSalades.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblSalades.setForeground(new Color(255, 255, 255));
		lblSalades.setBounds(35, 57, 268, 66);
		AppetizerFrame.getContentPane().add(lblSalades);
		
		JLabel lblTnd_6 = new JLabel("6.00 TND");
		lblTnd_6.setForeground(new Color(255, 255, 255));
		lblTnd_6.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_6.setBounds(818, 296, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_6);
		
		JLabel lblTnd_7 = new JLabel("4.00 TND");
		lblTnd_7.setForeground(new Color(255, 255, 255));
		lblTnd_7.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_7.setBounds(348, 539, 118, 35);
		AppetizerFrame.getContentPane().add(lblTnd_7);
		
		JRadioButton rdbtnCeasarSalad = new JRadioButton("Ceasar Salad");
		rdbtnCeasarSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnCeasarSalad);
		rdbtnCeasarSalad.setBounds(60, 539, 243, 41);
		rdbtnCeasarSalad.setActionCommand("Ceasar Salad:4.0");

		AppetizerFrame.getContentPane().add(rdbtnCeasarSalad);
		
		JLabel lblSoupes = new JLabel("Soupes :");
		lblSoupes.setForeground(new Color(255, 255, 255));
		lblSoupes.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblSoupes.setBounds(518, 15, 269, 151);
		AppetizerFrame.getContentPane().add(lblSoupes);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(818, 747, 168, 46);
		AppetizerFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setIcon(new ImageIcon(ListAppetizer.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		AppetizerFrame.getContentPane().add(lblNewLabel);
	}
}
