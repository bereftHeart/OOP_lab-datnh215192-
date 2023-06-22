package Aims_Screen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.util.List;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import aims.store;
import media.media;

public class View_Store extends JFrame{
	public store Store;

	JPanel createNorthPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(createMenuBar());
		panel.add(createHeader());
		return panel;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Oprions");
		JMenu smUpdateStore = new JMenu("Update Store");
		
		smUpdateStore.add(new JMenuItem("Add book"));
		smUpdateStore.add(new JMenuItem("Add DVD"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		
		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View Cart"));
		menu.add(new JMenuItem("View Store"));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);
		
		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel,BoxLayout.X_AXIS));
        
        JLabel title = new JLabel("AIMS");
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN,50));
        title.setForeground(Color.PINK);
        
        JButton cart = new JButton("Cart");
        cart.setPreferredSize(new Dimension(100,50));
        cart.setMaximumSize(new Dimension(100,50));
        
        panel.add(Box.createRigidArea(new Dimension(10,10)));
        panel.add(title);
        panel.add(Box.createHorizontalGlue());
        panel.add(cart);
        panel.add(Box.createRigidArea(new Dimension(10,10)));
        
        return panel;
	}
	
	JPanel createCenter() {
		JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3,2,2));
        
        List<media> mediaInStore = Store.getItemsInStore();
        for (int i = 0; i< mediaInStore.size(); i++) {
        	MediaStore cell = new MediaStore(mediaInStore.get(i));
        	panel.add(cell);
        }
        
        return panel;
	}
//	-----------------------------------
	public View_Store(store Store) {
		this.Store = Store;
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(createNorthPanel(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		this.setVisible(true);
        this.setTitle("STORE");
        this.setSize(1366,768);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ;
	}
}
