package com.calculator;

import java.awt.*;
import java.awt.event.*;
public class Calc extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	TextField op1;
	Button sum;
	TextField op2;
	Button diff;
	Button mul;
	Button div;
	Label equal;
	Label Error;
	TextField result;
	
	public Calc()
	{
		initialize();
		addComponentsToFrame();
		addListeners();
	}
	
	private void addListeners() {
		addWindowListener(new WindowClosingAdapter());
		sum.addActionListener(new CalciActionListener());
		div.addActionListener(new CalciActionListener());
		diff.addActionListener(new CalciActionListener());
		mul.addActionListener(new CalciActionListener());

	}
	
	private void addComponentsToFrame() {
		setLayout(new FlowLayout());
		add(op1);
		add(sum);
		add(diff);
		add(mul);
		add(div);
		add(op2);
		add(equal);
		add(result);
	} 
	
	private void initialize() {
		op1=new TextField(10);
		sum = new Button("+");
		diff = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		op2=new TextField(10);
		result=new TextField(10);
		equal=new Label("=");
		result.setEditable(false);

	}
	private class WindowClosingAdapter extends WindowAdapter
	{
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}
	
	private class CalciActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			CalcOperators op=new CalcOperators();
			try{
				int o1=Integer.parseInt(op1.getText());
				int o2=Integer.parseInt(op2.getText());
				op.setOper1(o1);
				op.setOper2(o2);
				if(e.getSource()==sum) {
					op.setRes(o1+o2);
				}
				else if(e.getSource()==diff) {
					op.setRes(o1-o2);
				}
				if(e.getSource()==mul) {
					op.setRes(o1*o2);
				}
				if(e.getSource()==div) {
					op.setRes(o1/o2);
				}
				
			}
			catch(Exception E) {
				Error=new Label("Invalid");
				add(Error);
			}
			result.setText(String.valueOf(op.getRes()));

			
		}
		
	}
}
