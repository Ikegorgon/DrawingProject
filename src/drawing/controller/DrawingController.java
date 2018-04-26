package drawing.controller;

import java.awt.Component;
import java.io.IOException;

import javax.swing.JOptionPane;

import drawing.view.*;
import drawing.model.*;

public class DrawingController {
	private DrawingFrame frame;
	public DrawingController() {
		frame = new DrawingFrame(this);
	}
	public void start() {
		JOptionPane.showMessageDialog(frame, "Welcome to Art!");
	}
	public DrawingFrame getFrame() {
		return frame;
	}

	public void handleErrors(IOException error) {
		JOptionPane.showMessageDialog(frame, error.getMessage());
	}
}
