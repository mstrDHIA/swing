package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class ListDrink extends Welcome{

	public JFrame DrinkFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListDrink window = new ListDrink();
					window.DrinkFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListDrink() {
		DrinkInitialize();
	}

	/**
	 * Initialize the contents of the DrinkFrame.
	 */
	public void DrinkInitialize() {
		DrinkFrame = new JFrame();
		DrinkFrame.setBounds(100, 100, 1024, 840);
		DrinkFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DrinkFrame.getContentPane().setLayout(null);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bla=buttonGroup.getSelection().getActionCommand();
				String[] trah = bla.split(":");
				double price = Double.parseDouble(trah[1]);
				 drink=new Drink(trah[0],price);
				 DrinkFrame.dispose();
				 ch.lblNewLabel_3.setText(drink.name);
					ch.lblNone_3.setText(Double.toString(drink.price));
					
					Chooose choose=new Chooose();
					choose.ChooseInitialize();
					choose.ChoooseFrame.setVisible(true);
			}
		});
		btnConfirm.setBounds(630, 734, 168, 46);
		DrinkFrame.getContentPane().add(btnConfirm);
		
		JRadioButton rdbtnCoffee = new JRadioButton("Coffee");
		rdbtnCoffee.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnCoffee);
		rdbtnCoffee.setActionCommand("Coffee:2.0");
		rdbtnCoffee.setBounds(49, 154, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnCoffee);
		
		JRadioButton rdbtnTea = new JRadioButton("Tea");
		rdbtnTea.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnTea);
		rdbtnTea.setActionCommand("Tea:1.0");
		rdbtnTea.setBounds(49, 285, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnTea);
		
		JRadioButton rdbtnHotChocolate = new JRadioButton("Hot Chocolate\r\n");
		rdbtnHotChocolate.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnHotChocolate);
		rdbtnHotChocolate.setActionCommand("Hot Chocolate :3.5");
		rdbtnHotChocolate.setBounds(49, 404, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnHotChocolate);
		
		JRadioButton rdbtnWater = new JRadioButton("Water");
		rdbtnWater.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnWater);
		rdbtnWater.setActionCommand("Water:1.0");
		rdbtnWater.setBounds(575, 525, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnWater);
		
		JRadioButton rdbtnSoda = new JRadioButton("Soda");
		rdbtnSoda.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnSoda);
		rdbtnSoda.setActionCommand("Soda:1.50");
		rdbtnSoda.setBounds(575, 159, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnSoda);
		
		JRadioButton rdbtnMilkshake = new JRadioButton("MilkShake");
		rdbtnMilkshake.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnMilkshake);
		rdbtnMilkshake.setActionCommand("MilkShake:4.0");
		rdbtnMilkshake.setBounds(575, 288, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnMilkshake);
		
		JRadioButton rdbtnMojito = new JRadioButton("Mojito");
		rdbtnMojito.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnMojito);
		rdbtnMojito.setActionCommand("Mojito:5.0");
		rdbtnMojito.setBounds(575, 407, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnMojito);
		
		JRadioButton rdbtnCappucino = new JRadioButton("Cappucino");
		rdbtnCappucino.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnCappucino);
		rdbtnCappucino.setActionCommand("Cappucino:3.0");
		rdbtnCappucino.setBounds(49, 525, 203, 41);
		DrinkFrame.getContentPane().add(rdbtnCappucino);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(820, 734, 168, 46);
		DrinkFrame.getContentPane().add(btnNewButton);
		
		JLabel lblHot = new JLabel("Hot :");
		lblHot.setForeground(Color.WHITE);
		lblHot.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblHot.setBounds(21, 37, 268, 69);
		DrinkFrame.getContentPane().add(lblHot);
		
		JLabel lblCold = new JLabel("Cold :");
		lblCold.setForeground(Color.WHITE);
		lblCold.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblCold.setBounds(504, 37, 269, 69);
		DrinkFrame.getContentPane().add(lblCold);
		
		JLabel lblTnd_9 = new JLabel("2.00 TND");
		lblTnd_9.setForeground(Color.WHITE);
		lblTnd_9.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_9.setBounds(339, 156, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_9);
		
		JLabel lblTnd_2_1 = new JLabel("1.00 TND");
		lblTnd_2_1.setForeground(Color.WHITE);
		lblTnd_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2_1.setBounds(339, 288, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_2_1);
		
		JLabel lblTnd_4_1 = new JLabel("1.50 TND");
		lblTnd_4_1.setForeground(Color.WHITE);
		lblTnd_4_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_4_1.setBounds(856, 162, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_4_1);
		
		JLabel lblTnd_6_1 = new JLabel("4.00 TND");
		lblTnd_6_1.setForeground(Color.WHITE);
		lblTnd_6_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_6_1.setBounds(856, 288, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_6_1);
		
		JLabel lblTnd_1_1 = new JLabel("3.50 TND");
		lblTnd_1_1.setForeground(Color.WHITE);
		lblTnd_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1_1.setBounds(339, 407, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_1_1);
		
		JLabel lblTnd_7_1 = new JLabel("3.00 TND");
		lblTnd_7_1.setForeground(Color.WHITE);
		lblTnd_7_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_7_1.setBounds(339, 528, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_7_1);
		
		JLabel lblTnd_5_1 = new JLabel("5.00 TND");
		lblTnd_5_1.setForeground(Color.WHITE);
		lblTnd_5_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_5_1.setBounds(856, 413, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_5_1);
		
		JLabel lblTnd_3_1 = new JLabel("1.00 TND");
		lblTnd_3_1.setForeground(Color.WHITE);
		lblTnd_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_3_1.setBounds(856, 531, 118, 35);
		DrinkFrame.getContentPane().add(lblTnd_3_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(ListDrink.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		DrinkFrame.getContentPane().add(lblNewLabel);
	}
}
