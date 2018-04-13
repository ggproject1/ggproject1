import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

public class Myform1 extends JFrame
{	
	private JTextField txtName;
	private JLabel good,name;
	private JButton back,sub,exit;
	public static void main(String[] args) 
	{	EventQueue.invokeLater(new Runnable(){
		public void run()	{
		Myform1 form1 = new Myform1();
		form1.setVisible(true);
		}
	});
	}

	public Myform1()	{
		initialize();
	}
	private void initialize()	{
		setTitle("Myforem 1");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		/**
		*Label
		*/
		good = new JLabel("Good Job");
		good.setBounds(243,45,76,50);
		name = new JLabel("Input Name");
		name.setBounds(50,150,150,30);
		getContentPane().add(good);
		getContentPane().add(name);
		/**
		*Button
		*/
		back = new JButton("Back");
		back.setBounds(0,0,70,30);
		sub = new JButton("Submit");
		sub.setBounds(403,150,80,30);
		exit = new JButton("Exit");
		exit.setBounds(500,300,80,30);
		/**
		*TextField
		*/
		txtName = new JTextField();
		txtName.setBounds(120,150,280,30);
		getContentPane().add(txtName);
		txtName.setColumns(10);

		/**
		*ActioonEvent
		*/
		back.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ev)	{
				backActionPerformed(ev);
			}
		});	
		sub.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent arg0)	{
				subActionPerformed(arg0);
			}
		});
		exit.addActionListener(new ActionListener()	{
			public void actionPerformed(ActionEvent ev)	{
				System.exit(0);
			}
		});
		getContentPane().add(back);
		getContentPane().add(sub);
		getContentPane().add(exit);
		}
		private void subActionPerformed(ActionEvent arg0)	{
			JOptionPane.showMessageDialog(null,"Welcome : "+txtName.getText());
			Firstmygui window = new Firstmygui();
			window.setVisible(true);
			setVisible(false);
			
		}
		private void backActionPerformed(ActionEvent ev)	{
		Firstmygui window = new Firstmygui();
		window.setVisible(true);

		setVisible(false);

	}
}
