package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.
        int x = 0;
        int y = 0;

        while (x <= WIDTH) {
            Graphics g = graphics;
            lineDrawing(g, x, y);
            x = x + 20;
        }

        while (y <= HEIGHT) {
            Graphics g = graphics;
            lineDrawing(g, x, y);
            y = y + 20;
        }

        while (x >=0) {
            Graphics g = graphics;
            lineDrawing(g, x, y);
            x = x -20;
        }

        while (y>=0) {
            Graphics g = graphics;
            lineDrawing(g, x, y);
            y = y - 20;
        }




    }

    public static void lineDrawing(Graphics g, int x, int y) {
        g.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
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