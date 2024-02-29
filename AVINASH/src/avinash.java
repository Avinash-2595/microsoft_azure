import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class avinash {

	private JFrame frame;
	private JPasswordField passwordField;
	private JTextField u1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					avinash window = new avinash();
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
	public avinash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 128, 255));
		frame.setBounds(100, 100, 550, 408);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(41, 71, 166, 36);
		frame.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(191, 30, -23, -5);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(41, 118, 130, 55);
		frame.getContentPane().add(lblNewLabel_1);
		
		u1 = new JTextField();
		u1.setForeground(new Color(0, 0, 0));
		u1.setBounds(238, 81, 145, 20);
		frame.getContentPane().add(u1);
		u1.setColumns(10);
		
		JButton b1 = new JButton("Login");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=u1.getText();
				String password=p1.getText();
				if(user.equals("mahadev")&& password.equals("satwik"))
				JOptionPane.showMessageDialog(b1, "hello "+user);
				else
					JOptionPane.showMessageDialog(b1, "*******Donga Badcow*******");
					
				
				
			}
		});
		b1.setForeground(new Color(0, 0, 0));
		b1.setFont(new Font("Tahoma", Font.BOLD, 19));
		b1.setBackground(new Color(255, 0, 128));
		b1.setBounds(264, 199, 89, 36);
		frame.getContentPane().add(b1);
		
		p1 = new JPasswordField();
		p1.setBounds(238, 141, 145, 20);
		frame.getContentPane().add(p1);
		
		JLabel lblNewLabel_2 = new JLabel("Instagram ");
		lblNewLabel_2.setBackground(new Color(255, 0, 128));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel_2.setBounds(204, 11, 203, 49);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
