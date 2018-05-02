package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        int x = 0;
        int y = 0;
        int size1 = WIDTH;
        int size2 = HEIGHT;

        Graphics g = graphics;
        g.setColor(Color.pink);
        squareDrawing(g, x, y, size1, size2);

        size1 = size2 = 40;

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                g.setColor(Color.black);
                squareDrawing(g, x, y, size1, size2);
                x = x + 80;
                y = y;


            }
            if (i % 2 == 0) {
                x = 40;
                y = y;

            } else x = 0;{
                y = y + 40;
            }
        }
    }


    public static void squareDrawing(Graphics g, int x, int y, int size, int size2) {

        g.fillRect(x, y, size, size2);
    }


    // Don't touch the code below
    static int WIDTH = 335;
    static int HEIGHT = 359;

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