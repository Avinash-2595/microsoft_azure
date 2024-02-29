import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class newlogin {

	private JFrame frame;
	private JTextField tb1;
	private JTextField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newlogin window = new newlogin();
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
	public newlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(new Color(64, 128, 128));
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsername.setBounds(96, 92, 166, 36);
		frame.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(64, 128, 128));
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblPassword.setBounds(96, 152, 166, 36);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblLoginPage = new JLabel("LOGIN PAGE");
		lblLoginPage.setForeground(new Color(255, 128, 0));
		lblLoginPage.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblLoginPage.setBounds(263, 25, 190, 36);
		frame.getContentPane().add(lblLoginPage);
		
		tb1 = new JTextField();
		tb1.setBackground(new Color(192, 192, 192));
		tb1.setForeground(new Color(0, 0, 0));
		tb1.setColumns(10);
		tb1.setBounds(322, 106, 145, 20);
		frame.getContentPane().add(tb1);
		
		p1 = new JTextField();
		p1.setBackground(new Color(192, 192, 192));
		p1.setForeground(Color.BLACK);
		p1.setColumns(10);
		p1.setBounds(322, 166, 145, 20);
		frame.getContentPane().add(p1);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=tb1.getText();
			String password=p1.getText();
			try {
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/avinash","root","MREC");
				PreparedStatement stn = con.prepareStatement("select name,password from users where name=? and password=?");
				stn.setString(1, name);
				stn.setString(2, password);
				ResultSet rs = stn.executeQuery();
				if(rs.next())
				{
					JOptionPane.showMessageDialog(btnlogin,"vaild user");
				}
				else
				{
					JOptionPane.showMessageDialog(btnlogin,"invaild user");
				}
				
			}
			catch(SQLException e1)
			{
				e1.printStackTrace();
			}
			
			
			}
			
		});
		btnlogin.setForeground(Color.BLACK);
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 19));
		btnlogin.setBackground(new Color(255, 255, 0));
		btnlogin.setBounds(348, 222, 89, 36);
		frame.getContentPane().add(btnlogin);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\pexels-photo-952670.jpeg"));
		lblNewLabel.setBounds(0, 0, 699, 331);
		frame.getContentPane().add(lblNewLabel);
	}
}
