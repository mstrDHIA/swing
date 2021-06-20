package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;

public class Slides extends Welcome{

	public JFrame Slidesframe;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Slides window = new Slides();
					window.Slidesframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Slides() {
		initializeSlides();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initializeSlides() {
		Slidesframe = new JFrame();
		Slidesframe.setBounds(100, 100, 1024, 840);
		Slidesframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Slidesframe.getContentPane().setLayout(null);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bla=buttonGroup.getSelection().getActionCommand();
				String[] trah = bla.split(":");
				double price = Double.parseDouble(trah[1]);
				 slide=new SlideClass(trah[0],price);
				 Slidesframe.dispose();
				 ch.lblNewLabel_4.setText(slide.name);
					ch.lblNone_4.setText(Double.toString(slide.price));
					
					Chooose choose=new Chooose();
					choose.ChooseInitialize();
					choose.ChoooseFrame.setVisible(true);
			}
		});
		btnConfirm.setBounds(640, 740, 168, 46);
		Slidesframe.getContentPane().add(btnConfirm);
		
		JRadioButton rdbtnFrittes = new JRadioButton("Frittes");
		rdbtnFrittes.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnFrittes);
		rdbtnFrittes.setActionCommand("Frittes:1.0");
		rdbtnFrittes.setBounds(102, 175, 183, 41);
		Slidesframe.getContentPane().add(rdbtnFrittes);
		
		JRadioButton rdbtnMayonaise = new JRadioButton("Mayonaise");
		rdbtnMayonaise.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnMayonaise);
		rdbtnMayonaise.setActionCommand("Mayonaise:0.5");
		rdbtnMayonaise.setBounds(102, 281, 183, 41);
		Slidesframe.getContentPane().add(rdbtnMayonaise);
		
		JLabel lblTnd_2 = new JLabel("1.00 TND");
		lblTnd_2.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_2.setBounds(326, 178, 114, 35);
		Slidesframe.getContentPane().add(lblTnd_2);
		
		JLabel lblTnd_1 = new JLabel("0.50 TND");
		lblTnd_1.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_1.setBounds(326, 284, 114, 35);
		Slidesframe.getContentPane().add(lblTnd_1);
		
		JRadioButton rdbtnKetchup = new JRadioButton("Ketchup");
		rdbtnKetchup.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnKetchup);
		rdbtnKetchup.setActionCommand("Ketchup:0.5");
		rdbtnKetchup.setBounds(102, 383, 183, 41);
		Slidesframe.getContentPane().add(rdbtnKetchup);
		
		JLabel lblTnd_4 = new JLabel("0.70 TND");
		lblTnd_4.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_4.setBounds(326, 386, 114, 35);
		Slidesframe.getContentPane().add(lblTnd_4);
		
		JRadioButton rdbtnExtraCheese = new JRadioButton("Extra Cheese");
		rdbtnExtraCheese.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		buttonGroup.add(rdbtnExtraCheese);
		rdbtnExtraCheese.setActionCommand("Extra Cheese:1.0");
		rdbtnExtraCheese.setBounds(102, 487, 183, 41);
		Slidesframe.getContentPane().add(rdbtnExtraCheese);
		
		JLabel lblTnd_5 = new JLabel("1.00 TND");
		lblTnd_5.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		lblTnd_5.setBounds(326, 490, 114, 35);
		Slidesframe.getContentPane().add(lblTnd_5);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		btnNewButton.setBounds(818, 740, 168, 46);
		Slidesframe.getContentPane().add(btnNewButton);
		
		JLabel lblSlides = new JLabel("Slides");
		lblSlides.setForeground(new Color(255, 255, 255));
		lblSlides.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		lblSlides.setBounds(50, 38, 294, 66);
		Slidesframe.getContentPane().add(lblSlides);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Slides.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		Slidesframe.getContentPane().add(lblNewLabel);
	}
}
