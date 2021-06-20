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

public class ListMain extends Welcome{

	public JFrame MainFrame;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListMain window = new ListMain();
					window.MainFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ListMain() {
		MainInitialize();
	}

	/**
	 * Initialize the contents of the MainFrame.
	 */
	public void MainInitialize() {
		MainFrame = new JFrame();
		MainFrame.setBounds(100, 100, 1024, 840);
		MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainFrame.getContentPane().setLayout(null);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bla=buttonGroup.getSelection().getActionCommand();
				String[] trah = bla.split(":");
				double price = Double.parseDouble(trah[1]);
				 main=new MainCourse(trah[0],price);
				 MainFrame.dispose();
				 ch.lblNewLabel_1.setText(main.name);
					ch.lblNone_1.setText(Double.toString(main.price));
					
					Chooose choose=new Chooose();
					choose.ChooseInitialize();
					choose.ChoooseFrame.setVisible(true);
			}
		});
		
		JLabel lblMainCourse = new JLabel("Main Course :");
		lblMainCourse.setForeground(new Color(255, 255, 255));
		lblMainCourse.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblMainCourse.setBounds(33, 34, 347, 49);
		MainFrame.getContentPane().add(lblMainCourse);
		btnConfirm.setBounds(624, 710, 168, 64);
		MainFrame.getContentPane().add(btnConfirm);
		
		JRadioButton rdbtnGreenSalad = new JRadioButton("Couscous");
		rdbtnGreenSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnGreenSalad);
		rdbtnGreenSalad.setActionCommand("Couscous:10.0");
		rdbtnGreenSalad.setBounds(43, 137, 196, 41);
		MainFrame.getContentPane().add(rdbtnGreenSalad);
		
		JRadioButton rdbtnGrilledSalad = new JRadioButton("Lablebi");
		rdbtnGrilledSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnGrilledSalad);
		rdbtnGrilledSalad.setActionCommand("Lablebi:6.0");
		rdbtnGrilledSalad.setBounds(43, 248, 196, 41);
		MainFrame.getContentPane().add(rdbtnGrilledSalad);
		
		JRadioButton rdbtnOmekHoureya = new JRadioButton("Kafteji");
		rdbtnOmekHoureya.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnOmekHoureya);
		rdbtnOmekHoureya.setActionCommand("Kafteji:3.0");
		rdbtnOmekHoureya.setBounds(43, 575, 196, 41);
		MainFrame.getContentPane().add(rdbtnOmekHoureya);
		
		JRadioButton rdbtnVegetablesSoup = new JRadioButton("Pizza");
		rdbtnVegetablesSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnVegetablesSoup);
		rdbtnVegetablesSoup.setActionCommand("Pizza:9.0");
		rdbtnVegetablesSoup.setBounds(505, 359, 196, 41);
		MainFrame.getContentPane().add(rdbtnVegetablesSoup);
		
		JRadioButton rdbtnFishSoup = new JRadioButton("Spagetti");
		rdbtnFishSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnFishSoup);
		rdbtnFishSoup.setActionCommand("Spagetti:5.0");
		rdbtnFishSoup.setBounds(43, 359, 196, 41);
		MainFrame.getContentPane().add(rdbtnFishSoup);
		
		JRadioButton rdbtnChickenSoup = new JRadioButton("Kammouniya");
		rdbtnChickenSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnChickenSoup);
		rdbtnChickenSoup.setActionCommand("Kammouniya:7.0");
		rdbtnChickenSoup.setBounds(43, 468, 196, 41);
		MainFrame.getContentPane().add(rdbtnChickenSoup);
		
		JRadioButton rdbtnSeaFoodSoup = new JRadioButton("Lasagna");
		rdbtnSeaFoodSoup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnSeaFoodSoup);
		rdbtnSeaFoodSoup.setActionCommand("Lasagna:8.0");
		rdbtnSeaFoodSoup.setBounds(505, 247, 196, 41);
		MainFrame.getContentPane().add(rdbtnSeaFoodSoup);
		
		JRadioButton rdbtnCeasarSalad = new JRadioButton("Mloukhiya");
		rdbtnCeasarSalad.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnCeasarSalad);
		rdbtnCeasarSalad.setActionCommand("Mloukhiya:8.0");
		rdbtnCeasarSalad.setBounds(505, 137, 196, 41);
		MainFrame.getContentPane().add(rdbtnCeasarSalad);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(820, 710, 168, 64);
		MainFrame.getContentPane().add(btnNewButton);
		
		JLabel lblTnd_9 = new JLabel("10.00 TND");
		lblTnd_9.setForeground(Color.WHITE);
		lblTnd_9.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_9.setBounds(290, 137, 118, 35);
		MainFrame.getContentPane().add(lblTnd_9);
		
		JLabel lblTnd_2_1 = new JLabel("6.00 TND");
		lblTnd_2_1.setForeground(Color.WHITE);
		lblTnd_2_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2_1.setBounds(290, 254, 118, 35);
		MainFrame.getContentPane().add(lblTnd_2_1);
		
		JLabel lblTnd_4_1 = new JLabel("3.00 TND");
		lblTnd_4_1.setForeground(Color.WHITE);
		lblTnd_4_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_4_1.setBounds(290, 572, 118, 35);
		MainFrame.getContentPane().add(lblTnd_4_1);
		
		JLabel lblTnd_6_1 = new JLabel("6.00 TND");
		lblTnd_6_1.setForeground(Color.WHITE);
		lblTnd_6_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_6_1.setBounds(782, 137, 118, 35);
		MainFrame.getContentPane().add(lblTnd_6_1);
		
		JLabel lblTnd_1_1 = new JLabel("5.00 TND");
		lblTnd_1_1.setForeground(Color.WHITE);
		lblTnd_1_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1_1.setBounds(290, 365, 118, 35);
		MainFrame.getContentPane().add(lblTnd_1_1);
		
		JLabel lblTnd_7_1 = new JLabel("7.00 TND");
		lblTnd_7_1.setForeground(Color.WHITE);
		lblTnd_7_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_7_1.setBounds(290, 465, 118, 35);
		MainFrame.getContentPane().add(lblTnd_7_1);
		
		JLabel lblTnd_5_1 = new JLabel("4.00 TND");
		lblTnd_5_1.setForeground(Color.WHITE);
		lblTnd_5_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_5_1.setBounds(782, 250, 118, 35);
		MainFrame.getContentPane().add(lblTnd_5_1);
		
		JLabel lblTnd_3_1 = new JLabel("3.00 TND");
		lblTnd_3_1.setForeground(Color.WHITE);
		lblTnd_3_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_3_1.setBounds(782, 362, 118, 35);
		MainFrame.getContentPane().add(lblTnd_3_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblNewLabel.setIcon(new ImageIcon(ListMain.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		MainFrame.getContentPane().add(lblNewLabel);
	}
}
