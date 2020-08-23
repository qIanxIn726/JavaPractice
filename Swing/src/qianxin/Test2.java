package qianxin;
import javax.swing.*;
import java.awt.*;
import java.net.URL;
public class Test2 extends JFrame {
	public Test2() {
		Container con = getContentPane();
		URL url = Test2.class.getResource("icon_test.png");
		Icon icon = new ImageIcon(url);
		JLabel jl = new JLabel("this is a jlabel widow", icon, SwingConstants.CENTER);
		jl.setOpaque(true);
		con.add(jl);
		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test2();
	}
}
