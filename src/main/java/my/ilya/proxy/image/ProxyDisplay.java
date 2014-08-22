package my.ilya.proxy.image;

import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProxyDisplay extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public ProxyDisplay(){
		
		super("Display proxied image");
		
		addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);				
			}
		});
		System.out.println("fesf");
		
		JPanel p = new JPanel();
		getContentPane().add(p);
		p.setLayout(new BorderLayout());
		ImageProxy image = new ImageProxy("ellliot.jpg", 321, 271);
		p.add("Center", image);
		p.add("North", new Label("  s   "));
		p.add("West", new Label("  "));
		setSize(370, 350);		
		
		
	}
	
	public static void main(String[] argv){
		ProxyDisplay proxy = new ProxyDisplay();
		proxy.setVisible(true);
	}
}
