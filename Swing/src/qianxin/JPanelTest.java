package qianxin;
import javax.swing.*;
import java.awt.*;
public class JPanelTest extends JFrame {
	public JPanelTest() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1, 10, 10));
		JPanel jp1 = new JPanel(new GridLayout(1, 3, 10, 10));
		jp1.add(new JButton("1"));
		jp1.add(new JButton("2"));
		jp1.add(new JButton("3"));
		JPanel jp2 = new JPanel(new FlowLayout(1, 10, 10));
		jp2.add(new JLabel("qianxin "));
		jp2.add(new JLabel("is "));
		jp2.add(new JLabel("awsome!"));
		JPanel jp3 = new JPanel(new GridLayout(2, 1, 10, 10));
		jp3.add(new JCheckBox("check"));
		jp3.add(new JCheckBox("box"));
		JPanel jp4 = new JPanel(new FlowLayout(2, 10, 10));
		jp4.add(new JLabel("this is "));
		jp4.add(new JLabel("getting boring"));
		c.add(jp1);
		c.add(jp2);
		c.add(jp3);
		c.add(jp4);
		setVisible(true);
		setSize(400, 400);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JPanelTest();
	}
}
