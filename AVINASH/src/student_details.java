import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class student_details {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					student_details window = new student_details();
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
	public student_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 608, 402);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("STUDENT DETAILS");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(218, 11, 187, 33);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1.setBounds(71, 62, 102, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("ID");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_2.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_2.setBounds(71, 106, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("ADDRESS");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_3.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_3.setBounds(71, 150, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("MARKS");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1_4.setBackground(UIManager.getColor("Button.background"));
		lblNewLabel_1_4.setBounds(71, 194, 102, 33);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		t1 = new JTextField();
		t1.setColumns(10);
		t1.setBounds(218, 71, 114, 22);
		frame.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(218, 115, 114, 22);
		frame.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(218, 159, 114, 22);
		frame.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(218, 203, 114, 22);
		frame.getContentPane().add(t4);
		
		JButton b21 = new JButton("SUBMIT");
		b21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = t1.getText();
				String id = t2.getText();
				String address = t3.getText();
				String marks = t4.getText();
				int m = Integer.parseInt(marks);
				
				try {
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MREC");
					String q="insert into students values('"+name+"','"+id+"','"+address+"','"+m+"')";
					Statement sta= con.createStatement();  //from java.sql import
					sta.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(b21, "successful");
					}
				catch(SQLException e1)
				{
					e1.printStackTrace();
				}
				
				
			}
		});
		b21.setFont(new Font("Tahoma", Font.BOLD, 20));
		b21.setBounds(218, 267, 114, 23);
		frame.getContentPane().add(b21);
		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\pexels-photo-235985.jpeg"));
		lblNewLabel.setBounds(0, 11, 582, 341);
		frame.getContentPane().add(lblNewLabel);
	}
}
