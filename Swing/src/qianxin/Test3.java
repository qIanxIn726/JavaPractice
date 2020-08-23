package qianxin;
import java.awt.*;

import javax.swing.*;

public class Test3 extends JFrame {
	public Test3() {
		setTitle("this window adopted flowlayout, with conponents center alignment and 10pixels gap each");
		Container c = getContentPane();
		setLayout(new FlowLayout(1, 10, 10));
		for (int i = 0; i < 10; i ++) {
			c.add(new JButton("button" + i));
		}
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Test3();
	}
}
