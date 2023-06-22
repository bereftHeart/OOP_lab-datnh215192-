package global_ICT_swing;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;

public class AWTAccumulator extends Frame{
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 0;
	
	public AWTAccumulator(){
        setLayout(new GridLayout(2,2));
        add(new Label("Enter an integer"));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputActionListener());
        
        add(new Label("The Accumulaor Sum is:" ));
        
        tfOutput = new TextField(10);
        tfOutput.setEditable(false);
        add(tfOutput);
        
        setTitle("Accumulator");
        setSize(300,300);
        setVisible(true);
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
        new AWTAccumulator();
    }

}
