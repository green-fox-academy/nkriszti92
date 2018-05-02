package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps3d {
    public static void mainDraw(Graphics graphics) {
        int x = 10;
        int y = 10;
        int size = 10;

        for (int i = 0; i < WIDTH/10; i++) {
            Graphics g = graphics;
            squareDrawing(g, x, y, size);

            x = x + size;
            y = y + size;
            size = size + 10;
        }
    }


    public static void squareDrawing(Graphics g, int x, int y, int size) {
        g.setColor(Color.pink);
        g.fillRect(x, y, size, size);
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