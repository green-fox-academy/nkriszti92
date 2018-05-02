package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < WIDTH/10; i++) {
            Graphics g = graphics;
            squareDrawing(g, x, y);

            x = x + 10;
            y = y + 10;
        }
    }


    public static void squareDrawing(Graphics g, int x, int y) {
        g.setColor(Color.pink);
        g.fillRect(x, y, 10, 10);
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