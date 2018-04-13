
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
public class	Firstmygui extends JFrame
{
	public static void main(String[] args) 
	{	EventQueue.invokeLater(new Runnable(){
		public void run()	{
			Firstmygui window = new Firstmygui();
			window.setVisible(true);
			}
		});
	}
	public Firstmygui()	{
		setTitle("First GUI");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JLabel welcome = new JLabel("Welcome");
		welcome.setBounds(600,10,150,20);
		getContentPane().add(welcome);

		JButton button1 = new JButton("First");
		button1.setBounds(674,10,90,20);

		JButton library = new JButton("Library");
		library.setBounds(100,10,150,30);
		
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev){
				JTextField name = new JTextField();
				JTextField username = new JTextField();
				JPasswordField password = new JPasswordField();
		final JComponent[] inputs = new JComponent[]{
				new JLabel ("Name"),
					name,
				new JLabel("Username"),
					username,
				new JLabel("Password"),
					password,
			};
		JOptionPane.showMessageDialog(null,inputs,"Login",JOptionPane.PLAIN_MESSAGE);
		System.out.println("You entrie "+
			name.getText()+", "+
			username.getText()+", "+
			password.getText());
			}
	});
		library.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ev)	{
				libraryActionPerformed(ev);
			}
		});
		getContentPane().add(button1);
		getContentPane().add(library);
	}
	
		
	
	private void libraryActionPerformed(ActionEvent ev)	{
		Myform1 form1 = new Myform1();
		form1.setVisible(true);

		setVisible(false);
	}
}
