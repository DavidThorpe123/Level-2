import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener {
	Timer t;
	int x = 20;
	int y = 20;
	Objects o;
	Image ii;

	public void paintComponent(Graphics g) {
		g.fillRect(x, y, 100, 100);
		o.draw(g);
		ii.draw(g);
	}

	Panel() {
		BufferedImage i = null;
		try {
			i = ImageIO.read(this.getClass().getResourceAsStream("carr2.png"));
		} catch (Exception e) {
			System.err.println("Can't load your image");
		}
		ii = new Image(30, 30, 30, 30, i);
		o = new Objects(50, 50, 50, 50);
		t = new Timer(1000, this);
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		o.update();
		x += 100;
	}
}
