import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Image extends Objects {
	BufferedImage i;

	Image(int x, int y, int width, int height, BufferedImage i) {
		super(x, y, width, height);
		this.i = i;
	}

	public void draw(Graphics g) {
		g.drawImage(i, x, y, width, height, null);

	}
}
