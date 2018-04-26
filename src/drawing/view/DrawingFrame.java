package drawing.view;

import javax.swing.*;
import drawing.controller.*;

public class DrawingFrame extends JFrame {
	private DrawingPanel appPanel;
	
	public DrawingFrame(DrawingController app) {
		super();
		appPanel = new DrawingPanel(app);
		setupFrame();
	}
	private void setupFrame() {
		this.setSize(1200, 700);
		this.setContentPane(appPanel);
		this.setTitle("Art in Java");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
