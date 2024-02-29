import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import java.awt.Checkbox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movie {

	private JFrame frame;
	private JTextField n31;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movie window = new movie();
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
	public movie() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1.setBounds(30, 53, 166, 36);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2.setBounds(30, 97, 166, 36);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox cb31 = new JComboBox();
		cb31.setForeground(new Color(0, 0, 0));
		cb31.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "KGF", "DON", "KUSHI"}));
		cb31.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb31.setBackground(new Color(128, 255, 255));
		cb31.setBounds(216, 109, 124, 20);
		frame.getContentPane().add(cb31);
		
		n31 = new JTextField();
		n31.setBounds(216, 67, 124, 20);
		frame.getContentPane().add(n31);
		n31.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Show Time");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(30, 123, 166, 36);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BookMyShow");
		lblNewLabel_1_1.setBackground(new Color(128, 255, 0));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(142, 6, 213, 36);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox cb32 = new JComboBox();
		cb32.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cb32.setFont(new Font("Tahoma", Font.BOLD, 15));
		cb32.setBackground(new Color(128, 255, 255));
		cb32.setBounds(216, 177, 124, 20);
		frame.getContentPane().add(cb32);
		JRadioButton r31 = new JRadioButton("11:00");
		r31.setBackground(new Color(128, 255, 255));
		r31.setBounds(191, 136, 62, 23);
		frame.getContentPane().add(r31);
		
		JRadioButton r312 = new JRadioButton("02:00");
		r312.setBackground(new Color(128, 255, 255));
		r312.setBounds(269, 136, 65, 23);
		frame.getContentPane().add(r312);
		
		JRadioButton r313 = new JRadioButton("06:00");
		r313.setBackground(new Color(128, 255, 255));
		r313.setBounds(346, 136, 62, 23);
		frame.getContentPane().add(r313);
		ButtonGroup rgb = new ButtonGroup();
        rgb.add(r31);
        rgb.add(r312);
        rgb.add(r313);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("No Of Tickets");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(30, 165, 166, 36);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JButton b3 = new JButton("Submit");
		b3.setFont(new Font("Tahoma", Font.BOLD, 25));
		b3.setBounds(216, 219, 125, 31);
		frame.getContentPane().add(b3);
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name =n31.getText();
				String movie =(String) cb31.getSelectedItem();
				String tickets = (String) cb32.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int res=0;
				String stime="";
				 if(r31.isSelected())
	                {
	                	stime="11:00";
	                }
	                if(r312.isSelected())
	                {
	                	stime="12:00";
	                	
	                }
	                if(r313.isSelected())
	                {
	                	stime="2:00";
	                }
	                
	               res= JOptionPane.showConfirmDialog(b3, "Name "+name+"\nShow "+stime+"\nMovie "+movie+"\nTickets "+tickets+"\nBill is "+nt*200);
	               if(res==JOptionPane.YES_OPTION)
	               {
	            	   JOptionPane.showMessageDialog(b3, "Booking Confirmed");
	            	   
	            	   
	               }
	               else
	               {
	            	   JOptionPane.showMessageDialog(b3, "Booking Cancled");
	               }
			}
			
		});
		
		
		
		
		
		JLabel r311 = new JLabel("");
		r311.setIcon(new ImageIcon("C:\\Users\\mrec\\Downloads\\pexels-photo-268415.jpeg"));
		r311.setBounds(0, 11, 434, 261);
		frame.getContentPane().add(r311);
	}
}
