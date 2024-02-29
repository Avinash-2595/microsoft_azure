import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registration {

	private JFrame frame;
	private JTextField u21;
	private JPasswordField p21;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 591, 377);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(47, 61, 102, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("REGISTRATION");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1_1.setBounds(223, 11, 163, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_2.setBounds(47, 105, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Branch");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_3.setBounds(47, 146, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JComboBox cb21 = new JComboBox();
		cb21.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb21.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "ECE", "AIML", "MECH"}));
		cb21.setBackground(new Color(255, 255, 128));
		cb21.setBounds(255, 155, 114, 22);
		frame.getContentPane().add(cb21);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Gender");
		lblNewLabel_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_2_1.setBounds(47, 212, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		JRadioButton r21 = new JRadioButton("Male");
		r21.setFont(new Font("Tahoma", Font.BOLD, 15));
		r21.setBackground(new Color(255, 255, 255));
		r21.setBounds(255, 221, 109, 23);
		frame.getContentPane().add(r21);
		
		JRadioButton r211 = new JRadioButton("Female");
		r211.setFont(new Font("Tahoma", Font.BOLD, 15));
		r211.setBackground(Color.WHITE);
		r211.setBounds(396, 221, 109, 23);
		frame.getContentPane().add(r211);
		 ButtonGroup rgb = new ButtonGroup();
         rgb.add(r21);
         rgb.add(r211);
         
		JButton b21 = new JButton("Submit");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user =u21.getText();
				String password=p21.getText();
				String branch=(String) cb21.getSelectedItem();
               
                String gender = " ";
                if(r21.isSelected())
                {
                	gender="Male";
                }
                if(r211.isSelected())
                {
                	gender="Female";
                	
                }
                JOptionPane.showMessageDialog(b21, "Name "+user+"\nBranch "+branch+"\nGender "+gender);
                
                
				
			}
		});
		b21.setFont(new Font("Tahoma", Font.BOLD, 20));
		b21.setBounds(255, 286, 114, 23);
		frame.getContentPane().add(b21);
		
		u21 = new JTextField();
		u21.setBounds(255, 71, 114, 22);
		frame.getContentPane().add(u21);
		u21.setColumns(10);
		
		p21 = new JPasswordField();
		p21.setBounds(255, 115, 114, 20);
		frame.getContentPane().add(p21);
		
		JLabel r22 = new JLabel("Select");
		r22.setFont(new Font("Tahoma", Font.BOLD, 20));
		r22.setBackground(new Color(240, 240, 240));
		r22.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\pexels-photo-235985.jpeg"));
		r22.setBounds(-11, -17, 646, 366);
		frame.getContentPane().add(r22);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(439, 74, 46, 14);
		frame.getContentPane().add(lblNewLabel);
	}
}
