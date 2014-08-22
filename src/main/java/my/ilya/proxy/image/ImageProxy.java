package my.ilya.proxy.image;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ImageProxy extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	private int height;
	private int width;
	private MediaTracker tracker;
	private Image img;
	private JFrame frame;
	private Thread imageCheck; // to monitor loading

	public ImageProxy(String filename, int w, int h) {
		height = h;
		width = w;

		tracker = new MediaTracker(this);
		img = Toolkit.getDefaultToolkit().getImage(filename);
		tracker.addImage(img, 0); // watch for image loading

		imageCheck = new Thread(this);
		imageCheck.start(); // start 2nd thread monitor

		// this begins actual image loading
		try {
			tracker.waitForID(0, 1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void paint(Graphics g) {
		if (tracker.checkID(0)) {
			height = img.getHeight(frame);// get height
			width = img.getWidth(frame);// and width

			g.setColor(Color.lightGray);// erase box
			g.fillRect(0, 0, width, height);
			g.drawImage(img, 0, 0, this);
		} else {
			// draw box outlining image if not loaded yet
			g.setColor(Color.black);
			g.drawRect(1, 1, width - 2, height - 2);
		}
	}
	
	public Dimension getPrefferedSize(){
		return new Dimension(width, height);
	}

	public void run() {
		//this thread monitors image loading
		//and repaints when done 
		//the 1000 msec is artifically long
		//to allow demo to display with delay
		try{
			Thread.sleep(1000);
			while(!tracker.checkID(0)){
				Thread.sleep(1000);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
		repaint();
	}

}
