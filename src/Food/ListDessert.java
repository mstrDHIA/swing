package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class ListDessert extends Welcome{

	public JFrame DessertFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDessert window = new ListDessert();
					window.DessertFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListDessert() {
		initializeDessert();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initializeDessert() {
		DessertFrame = new JFrame();
		DessertFrame.setBounds(100, 100, 1024, 840);
		DessertFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DessertFrame.getContentPane().setLayout(null);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bla=buttonGroup.getSelection().getActionCommand();
				String[] trah = bla.split(":");
				double price = Double.parseDouble(trah[1]);
				 des=new Dessert(trah[0],price);
				 DessertFrame.dispose();
				 ch.lblNewLabel_2.setText(des.name);
					ch.lblNone_2.setText(Double.toString(des.price));
					
					Chooose choose=new Chooose();
					choose.ChooseInitialize();
					choose.ChoooseFrame.setVisible(true);
			}
		});
		btnConfirm.setBounds(640, 747, 168, 46);
		DessertFrame.getContentPane().add(btnConfirm);
		
		JRadioButton rdbtnJwejem = new JRadioButton("Jwejem");
		rdbtnJwejem.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnJwejem);
		rdbtnJwejem.setActionCommand("Jwejem:9.0");
		rdbtnJwejem.setBounds(50, 178, 232, 41);
		DessertFrame.getContentPane().add(rdbtnJwejem);
		
		JRadioButton rdbtnFruitSalad = new JRadioButton("Fruit salad\r\n");
		rdbtnFruitSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnFruitSalad);
		rdbtnFruitSalad.setActionCommand("Fruit Salad:6.0");
		rdbtnFruitSalad.setBounds(50, 307, 232, 41);
		DessertFrame.getContentPane().add(rdbtnFruitSalad);
		
		JRadioButton rdbtnChocolateCrepe = new JRadioButton("Chocolate Crepe\r\n");
		rdbtnChocolateCrepe.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChocolateCrepe);
		rdbtnChocolateCrepe.setActionCommand("Chocolate Crepe:3.5");
		rdbtnChocolateCrepe.setBounds(50, 660, 239, 41);
		DessertFrame.getContentPane().add(rdbtnChocolateCrepe);
		
		JRadioButton rdbtnIceCream = new JRadioButton("Ice Cream ");
		rdbtnIceCream.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnIceCream);
		rdbtnIceCream.setActionCommand("Ice Cream:3.0");
		rdbtnIceCream.setBounds(527, 426, 261, 41);
		DessertFrame.getContentPane().add(rdbtnIceCream);
		
		JRadioButton rdbtnCheesseCake = new JRadioButton("Cheese Cake");
		rdbtnCheesseCake.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnCheesseCake);
		rdbtnCheesseCake.setActionCommand("Cheese Cake:5.0");
		rdbtnCheesseCake.setBounds(50, 426, 232, 41);
		DessertFrame.getContentPane().add(rdbtnCheesseCake);
		
		JRadioButton rdbtnChocolateCake = new JRadioButton("Chocolate Cake");
		rdbtnChocolateCake.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChocolateCake);
		rdbtnChocolateCake.setActionCommand("Chocolate Cake:4.0");
		rdbtnChocolateCake.setBounds(50, 547, 232, 41);
		DessertFrame.getContentPane().add(rdbtnChocolateCake);
		
		JRadioButton rdbtnChocolateWaffle = new JRadioButton("Chocolate Waffle\r\n");
		rdbtnChocolateWaffle.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChocolateWaffle);
		rdbtnChocolateWaffle.setActionCommand("Chocolate Waffle:6.0");
		rdbtnChocolateWaffle.setBounds(527, 307, 261, 41);
		DessertFrame.getContentPane().add(rdbtnChocolateWaffle);
		
		JRadioButton rdbtnChocolateGauffre = new JRadioButton("Chocolate Gauffre");
		rdbtnChocolateGauffre.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChocolateGauffre);
		rdbtnChocolateGauffre.setActionCommand("Chocolate Gauffre:4.0");
		rdbtnChocolateGauffre.setBounds(527, 178, 261, 41);
		DessertFrame.getContentPane().add(rdbtnChocolateGauffre);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(818, 747, 168, 46);
		DessertFrame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Dessert");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblNewLabel_1.setBounds(43, 34, 261, 81);
		DessertFrame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblTnd_8 = new JLabel("9.00 TND");
		lblTnd_8.setForeground(Color.WHITE);
		lblTnd_8.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_8.setBounds(327, 178, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_8);
		
		JLabel lblTnd_1_1 = new JLabel("5.00 TND");
		lblTnd_1_1.setForeground(Color.WHITE);
		lblTnd_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1_1.setBounds(327, 429, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_1_1);
		
		JLabel lblTnd_2_1 = new JLabel("6.00 TND");
		lblTnd_2_1.setForeground(Color.WHITE);
		lblTnd_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2_1.setBounds(327, 310, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_2_1);
		
		JLabel lblTnd_7_1 = new JLabel("4.00 TND");
		lblTnd_7_1.setForeground(Color.WHITE);
		lblTnd_7_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_7_1.setBounds(327, 550, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_7_1);
		
		JLabel lblTnd_7_1_1 = new JLabel("3.5 TND");
		lblTnd_7_1_1.setForeground(Color.WHITE);
		lblTnd_7_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_7_1_1.setBounds(327, 660, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_7_1_1);
		
		JLabel lblTnd_8_1 = new JLabel("4.00 TND");
		lblTnd_8_1.setForeground(Color.WHITE);
		lblTnd_8_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_8_1.setBounds(845, 178, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_8_1);
		
		JLabel lblTnd_2_1_1 = new JLabel("6.00 TND");
		lblTnd_2_1_1.setForeground(Color.WHITE);
		lblTnd_2_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2_1_1.setBounds(845, 310, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_2_1_1);
		
		JLabel lblTnd_1_1_1 = new JLabel("3.00 TND");
		lblTnd_1_1_1.setForeground(Color.WHITE);
		lblTnd_1_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1_1_1.setBounds(845, 429, 118, 35);
		DessertFrame.getContentPane().add(lblTnd_1_1_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setIcon(new ImageIcon(ListDessert.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		DessertFrame.getContentPane().add(lblNewLabel);
	}

}
