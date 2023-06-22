package global_ICT_swing;

import java.awt.Container;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingAccumulator extends JFrame {
	private JTextField tfInput;
	private JTextField tfOutput;
	private int sum = 0;
	
	public SwingAccumulator() {
		Container container = getContentPane();
		container.setLayout(new GridLayout(2,2));
		container.add(new JLabel("Enter an Integer"));
		
		tfInput = new JTextField(10);
		container.add(tfInput);
		tfInput.addActionListener(new TFInputActionListener());
		
		container.add(new JLabel("The Accumulator Sum is"));
		tfOutput = new JTextField(10);
		tfOutput.setEditable(false);
		container.add(tfOutput);
		
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Swing Accumulator Sum");
         
	}
	
	private class TFInputActionListener implements ActionListener{
		@Override
        public void actionPerformed(java.awt.event.ActionEvent evt) {
			int numIn = Integer.parseInt(tfInput.getText());
			sum += numIn;
			tfInput.setText("");
            tfOutput.setText(sum + "");
        }
		
	}
	
	public static void main(String[] args) {
        new SwingAccumulator();
    }
}
