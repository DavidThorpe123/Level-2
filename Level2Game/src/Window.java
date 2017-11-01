import javax.swing.JFrame;

public class Window {
	JFrame frame;
	public static int height = 2000;
	public static int width = 2000;
	Panel p;

	public static void main(String[] args) {
		Window w = new Window();
	}

	Window() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(width, height);
		p = new Panel();
		frame.add(p);

	}
}
