package qianxin;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyJDialog extends JDialog{
	public MyJDialog(Test1 frame) {
		super(frame, "第一个JDialog窗体", true);
		Container container = getContentPane();
		container.add(new JLabel("this is a jdialog"));
		setBounds(120, 120, 100, 100);
	}
}
public class Test1 extends JFrame{
	public static void main(String[] args) {
		new Test1();
	}
	public Test1() {
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("this is a JFrame window");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton jb = new JButton("click out a dialog");
		jb.setBounds(10, 10, 100, 21);
		jb.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(Test1.this).setVisible(true);
			}
		});
		container.add(jb);
		
	}
}
