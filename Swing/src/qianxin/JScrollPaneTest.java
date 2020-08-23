package qianxin;
import javax.swing.*;
import java.awt.*;
public class JScrollPaneTest extends JFrame {
	public JScrollPaneTest() {
		Container c = getContentPane();
		JTextArea jta = new JTextArea(20, 50);
		JScrollPane jsp = new JScrollPane(jta);
		//JPanel jp = new JPanel();
		//jp.add(new JButton("aha this is a button!"));
		c.add(jsp);
		//c.add(jp);
		setSize(400, 400);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JScrollPaneTest();
	}
}
