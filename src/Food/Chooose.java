package Food;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Insets;

public class Chooose extends Welcome{

	public JFrame ChoooseFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chooose window = new Chooose();
					window.ChoooseFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Chooose() {
		ChooseInitialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void ChooseInitialize() {
		ChoooseFrame = new JFrame();
		ChoooseFrame.setBounds(100, 100, 1024, 840);
		ChoooseFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ChoooseFrame.getContentPane().setLayout(null);
		
		JButton btnAppetizer = new JButton("Appetizer");
		btnAppetizer.setIcon(new ImageIcon(Chooose.class.getResource("/Food/appetier.png")));
		btnAppetizer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				ListAppetizer applist=new ListAppetizer();
				applist.AppetizerInitialize();
				applist.AppetizerFrame.setVisible(true);
			}
		});
		btnAppetizer.setBounds(60, 180, 915, 100);
		ChoooseFrame.getContentPane().add(btnAppetizer);
		
		JButton btnMaincourse = new JButton("MainCourse");
		btnMaincourse.setIcon(new ImageIcon(Chooose.class.getResource("/Food/maincourse.png")));
		btnMaincourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				ListMain deslist=new ListMain();
				deslist.MainInitialize();
				deslist.MainFrame.setVisible(true);
			}
		});
		btnMaincourse.setBounds(60, 290, 915, 100);
		ChoooseFrame.getContentPane().add(btnMaincourse);
		
		JButton btnDessert = new JButton("Dessert");
		btnDessert.setIcon(new ImageIcon(Chooose.class.getResource("/Food/dessert.png")));
		btnDessert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				ListDessert deslist=new ListDessert();
				deslist.initializeDessert();
				deslist.DessertFrame.setVisible(true);
			}
		});
		btnDessert.setBounds(60, 400, 915, 100);
		ChoooseFrame.getContentPane().add(btnDessert);
		
		JButton btnDrink = new JButton("Drink");
		btnDrink.setAlignmentY(0.0f);
		btnDrink.setHorizontalAlignment(SwingConstants.LEFT);
		btnDrink.setMargin(new Insets(0, 0, 0, 0));
		btnDrink.setIcon(new ImageIcon(Chooose.class.getResource("/Food/drink.png")));
		btnDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				ListDrink drinklist=new ListDrink();
				drinklist.DrinkInitialize();
				drinklist.DrinkFrame.setVisible(true);
	
			}
		});
		btnDrink.setBounds(60, 510, 915, 100);
		ChoooseFrame.getContentPane().add(btnDrink);
		
		JButton btnSlides = new JButton("Slides");
		btnSlides.setIcon(new ImageIcon(Chooose.class.getResource("/Food/slides.png")));
		btnSlides.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				Slides deslist=new Slides();
				deslist.initializeSlides();
				deslist.Slidesframe.setVisible(true);
			}
		});
		btnSlides.setBounds(60, 620, 915, 100);
		ChoooseFrame.getContentPane().add(btnSlides);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.setFont(new Font("Century Gothic", Font.PLAIN, 20));
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChoooseFrame.dispose();
				
				ch.Checkframe.setVisible(true);
				totalcacl();
				
				
			}
		});
		btnConfirm.setBounds(807, 747, 168, 46);
		ChoooseFrame.getContentPane().add(btnConfirm);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Century Gothic", Font.PLAIN, 55));
		lblMenu.setForeground(new Color(255, 255, 255));
		lblMenu.setBounds(39, 25, 267, 116);
		ChoooseFrame.getContentPane().add(lblMenu);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Chooose.class.getResource("/Food/Blue Purple Abstract HD7305414610.jpg")));
		lblNewLabel.setBounds(0, 0, 1010, 803);
		ChoooseFrame.getContentPane().add(lblNewLabel);
	}
	public void totalcacl() {
		if(ch.lblNone.getText() !="None") {
			total+=Double.parseDouble(ch.lblNone.getText());
			//ch.lblNone_5.setText(Double.toString(total));
		}
		if(ch.lblNone_2.getText() !="None") {
			total+=Double.parseDouble(ch.lblNone_2.getText());
			//ch.lblNone_5.setText(Double.toString(total));
		}
		if(ch.lblNone_1.getText() !="None") {
			total+=Double.parseDouble(ch.lblNone_1.getText());
			//ch.lblNone_5.setText(Double.toString(total));
		}
		if(ch.lblNone_3.getText() !="None") {
			total+=Double.parseDouble(ch.lblNone_3.getText());
			//ch.lblNone_5.setText(Double.toString(total));
		}
		if(ch.lblNone_4.getText() !="None") {
			total+=Double.parseDouble(ch.lblNone_4.getText());
			//ch.lblNone_5.setText(Double.toString(total));
		}
		ch.lblNone_5.setText(Double.toString(total));	}

}
