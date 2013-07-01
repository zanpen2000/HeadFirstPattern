package TemplateMethod.swing;

import java.awt.Graphics;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MyFrame(String title) throws HeadlessException {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
	
	public void paint(Graphics graphics)
	{
		super.paint(graphics);
		String msg = "I love that girl which on 14 bus.";
		graphics.drawString(msg, 100, 100);
		
	}

	public static void main(String[] args) {
		new MyFrame("Fuck GFW!");
	}

}
