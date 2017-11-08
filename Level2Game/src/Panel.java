import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {
	Timer t;
	int x = 100;
	int y = 100;
	Objects o;
ImageObject ii;

	public void paintComponent(Graphics g) {
		
		g.fillRect(x, y, 100, 100);
		o.draw(g);
		ii.draw(g);
		
	}

	Panel() {
		BufferedImage i = null;
		try {
			i = ImageIO.read(this.getClass().getResourceAsStream("Tree.jpg"));
			
			
		} catch (Exception e) {
			System.err.println("Can't load your image");
		}
		ii = new ImageObject(100, 100, 100, 100, i);
		
		o = new Objects(50, 50, 50, 50);
		t = new Timer(1000, this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
//		o.update();
//		x += 100;
	}
}
