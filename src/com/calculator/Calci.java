package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci {

	private JFrame frame;
	private JTextField display;
	
	double num1;
	double num2;
	double res;
	String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calci window = new Calci();
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
	public Calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 312, 312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setFont(new Font("Arial", Font.BOLD, 14));
		display.setBackground(new Color(211, 211, 211));
		display.setBounds(10, 11, 276, 52);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"1";
				display.setText(num);
			}
		});
		one.setBackground(new Color(255, 255, 255));
		one.setBounds(10, 75, 67, 23);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"2";
				display.setText(num);
			}
		});
		two.setBackground(Color.WHITE);
		two.setBounds(91, 75, 67, 23);
		frame.getContentPane().add(two);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"3";
				display.setText(num);
			}
		});
		three.setBackground(Color.WHITE);
		three.setBounds(168, 75, 67, 23);
		frame.getContentPane().add(three);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"4";
				display.setText(num);
			}
		});
		four.setBackground(Color.WHITE);
		four.setBounds(10, 117, 67, 23);
		frame.getContentPane().add(four);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"5";
				display.setText(num);
			}
		});
		five.setBackground(Color.WHITE);
		five.setBounds(91, 117, 67, 23);
		frame.getContentPane().add(five);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"6";
				display.setText(num);
			}
		});
		six.setBackground(Color.WHITE);
		six.setBounds(168, 117, 67, 23);
		frame.getContentPane().add(six);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"7";
				display.setText(num);
			}
		});
		seven.setBackground(Color.WHITE);
		seven.setBounds(10, 157, 67, 23);
		frame.getContentPane().add(seven);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"8";
				display.setText(num);
			}
		});
		eight.setBackground(Color.WHITE);
		eight.setBounds(91, 157, 67, 23);
		frame.getContentPane().add(eight);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"9";
				display.setText(num);
			}
		});
		nine.setBackground(Color.WHITE);
		nine.setBounds(168, 157, 67, 23);
		frame.getContentPane().add(nine);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+".";
				display.setText(num);
			}
		});
		dot.setBackground(Color.WHITE);
		dot.setBounds(10, 200, 67, 23);
		frame.getContentPane().add(dot);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String num=display.getText()+"0";
				display.setText(num);
			}
		});
		zero.setBackground(Color.WHITE);
		zero.setBounds(91, 200, 67, 23);
		frame.getContentPane().add(zero);
		
		JButton clear = new JButton("c");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				display.setText("");
			}
		});
		clear.setBackground(Color.WHITE);
		clear.setBounds(168, 200, 67, 23);
		frame.getContentPane().add(clear);
		
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="+";
				
			}
		});
		add.setBounds(245, 75, 41, 23);
		frame.getContentPane().add(add);
		
		JButton sub = new JButton("-");
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="-";
			}
		});
		sub.setBounds(245, 117, 41, 23);
		frame.getContentPane().add(sub);
		
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="*";
			}
		});
		multiply.setBounds(245, 157, 41, 23);
		frame.getContentPane().add(multiply);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(display.getText());
				display.setText("");
				op="/";
			}
		});
		divide.setBounds(245, 200, 41, 23);
		frame.getContentPane().add(divide);
		
		JButton result = new JButton("=");
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2=Double.parseDouble(display.getText());
				if(op.equals("+"))
				{
					res=num1+num2;
			    }
				else if(op.equals("-"))
				{
					res=num1-num2;
				}
				else if(op.equals("*"))
				{
					res=num1*num2;
				}
				else if(op.equals("/"))
				{
					res=num1/num2;
				}
				display.setText(res+"");
			}
		});
		result.setBackground(new Color(211, 211, 211));
		result.setBounds(10, 234, 276, 34);
		frame.getContentPane().add(result);
	}
}
