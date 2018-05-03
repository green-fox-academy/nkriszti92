package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Graphics g = graphics;
        g.setColor(Color.black);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        for (int i = 0; i < 90; i++) {
            int x = (int) (0 + Math.random() * 320);
            int y = (int) (0 + Math.random() * 343);
            int rand = (int) (0 + Math.random() * 20);
            Color color = new Color(128 + rand, 128, 128 );
            g.setColor(color);
            squareDrawing(g, x, y, color);
        }
    }

    public static void squareDrawing(Graphics g, int x, int y, Color color) {
        g.fillRect(x, y, 5, 5);
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