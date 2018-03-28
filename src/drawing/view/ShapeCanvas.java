package drawing.view;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import drawing.controller.*;

public class ShapeCanvas extends JPanel {
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	
	private DrawingController app;
	private BufferedImage canvasImage;
	
	public ShapeCanvas(DrawingController app) {
		super();
		
	}
}
