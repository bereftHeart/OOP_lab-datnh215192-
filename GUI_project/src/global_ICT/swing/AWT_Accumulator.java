package global_ICT.swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWT_Accumulator extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWT_Accumulator() {
		setLayout(new GridLayout(2,2));
		
		add(new Label("Enter an integer:"));
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(new TFInputListener());
		
		add(new Label("THe accumulator sum is:"));
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(640,400);
		setVisible(true);
	}
	
	private class TFInputListener implements ActionListener{
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			sum += numberIn;
			tfInput.setText("");
			tfOutput.setText(sum+"");
		}
	}
	
	public static void main(String[] args) {
		new AWT_Accumulator();
		System.exit(0);
	}
}
