package week03.day03;

import javax.swing.*;

import java.awt.*;

import static java.awt.Component.CENTER_ALIGNMENT;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        for (int i = 0; i < 100; i++) {
            int rval =(int) Math.floor(Math.random()*256);
            int gval =(int) Math.floor(Math.random()*256);
            int bval =(int) Math.floor(Math.random()*256);
            Graphics g = graphics;
            int size = (int)(0 + Math.random()*320);
            int rand = (int)(50 + Math.random()*60);
            Color color = new Color(rval,gval,bval);
            g.setColor(color);
            squareDrawing(g,size,color);
        }


    }
    public static void squareDrawing(Graphics g, int size, Color color) {
        g.fillRect(WIDTH/2-size/2, HEIGHT/2-size/2, size, size);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}