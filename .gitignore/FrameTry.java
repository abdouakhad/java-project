import javax.swing.JFrame;
public class FrameTry extends JFrame{
	public FrameTry(){
		setTitle("Tops day");
		setSize(200,200);
	}
	
	public static void main(String[] args) {
		FrameTry stack = new FrameTry();
		stack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		stack.setVisible(true);
	}
}
