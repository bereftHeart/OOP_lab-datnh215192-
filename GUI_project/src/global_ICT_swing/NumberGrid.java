package global_ICT_swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGrid extends JFrame{
	private JButton[] buttons = new JButton[10];
	private JButton deleteButton, resetButton;
	private JTextField tfDisplay;
	
	public NumberGrid(){
		tfDisplay = new JTextField();
		tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
			
		JPanel panel = new JPanel(new GridLayout(4,3));
		ButtonListener buttonListener = new ButtonListener();
		for(int i = 1; i <=9; i++){
            buttons[i] = new JButton(String.valueOf(i));
            panel.add(buttons[i]);
            buttons[i].addActionListener(buttonListener);
        }
        
        deleteButton = new JButton("Delete");
        panel.add(deleteButton);
        deleteButton.addActionListener(buttonListener);
        
        buttons[0] = new JButton("0");
        panel.add(buttons[0]);
        buttons[0].addActionListener(buttonListener);
        
        resetButton = new JButton("Reset");
        panel.add(resetButton);
        resetButton.addActionListener(buttonListener);
        
        Container cp = getContentPane();
        cp.setLayout(new BorderLayout());
        cp.add(tfDisplay, BorderLayout.NORTH);
        cp.add(panel, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Number Grid");
        setSize(300, 300);
        setVisible(true);
	}
	
	private class ButtonListener implements ActionListener{
		@Override
        public void actionPerformed(ActionEvent e) {
			String buttonName = e.getActionCommand();
			
            if(buttonName.equals("Delete")){
            	String text = tfDisplay.getText();
            	tfDisplay.setText(text.substring(0, text.length()-1));
            } else if(buttonName.equals("Reset")) {
            	tfDisplay.setText("");
            } else {
            	tfDisplay.setText(tfDisplay.getText() + buttonName);
            }
		}
		
	}
	
	public static void main(String[] args) {
        new NumberGrid();
    }

}
