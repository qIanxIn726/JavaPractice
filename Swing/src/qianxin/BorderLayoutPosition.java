package qianxin;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutPosition extends JFrame {
	String[] border = {
			BorderLayout.CENTER, BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.WEST, BorderLayout.EAST
	};
	String[] buttonName = {
			"center", "north", "south", "west", "east"
	};
	public BorderLayoutPosition() {
		setTitle("this is a borderlayout window with five buttons locates in center,north,south,west,east of the window");
		Container c = getContentPane();
		setLayout(new BorderLayout());
		for (int i = 0; i < 5; i ++) {
			c.add(border[i], new JButton(buttonName[i]));
		}
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new BorderLayoutPosition();
	}
	
}
