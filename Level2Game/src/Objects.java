import java.awt.Graphics;

public class Objects {
	public int x;
	public int y;
	public int width;
	public int height;

	Objects(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void draw(Graphics g) {
		g.fillRect(x, y, width, height);
	}

	public void update() {
		this.x += 15;
	}
}
