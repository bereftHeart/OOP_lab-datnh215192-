package Aims_Screen;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import media.Playable;
import media.media;

public class MediaStore extends JPanel {
	private media media;
	
    public MediaStore(media media) {
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        JLabel title = new JLabel(media.getTitle());
        title.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        title.setFont(new Font("Arial",Font.BOLD,20));
        
        JLabel cost = new JLabel(""+ media.getCost() + "$");
        cost.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));
        container.add(new JButton("Add to cart"));
        if (media instanceof Playable) {
        	container.add(new JButton("Play"));
        }
        
        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);
        
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
