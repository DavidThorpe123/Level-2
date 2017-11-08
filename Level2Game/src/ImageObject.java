import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class ImageObject extends Objects {
	public BufferedImage i;

	ImageObject(int x, int y, int width, int height, BufferedImage i) {
		super(x, y, width, height);
		this.i = i;
	}

	public void draw(Graphics g) {
		Graphics2D g2d = (Graphics2D)g;
		//g2d.translate(x, y);
	g2d.rotate(1);
	g2d.drawImage(i, x, y, (ImageObserver)null);
	System.out.println(x + " " + y);

		//g.drawImage(i, x, y, width, height, null);
	}
}
