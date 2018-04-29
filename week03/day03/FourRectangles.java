package week03.day03;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        for (int i = 0; i < 4; i++) {
            Graphics g = graphics;
            int x = (int)(0 + Math.random()*320);
            int y =(int)(0 + Math.random()*343);
            int c = (int)(50 + Math.random()*100);
            Color myColor = new Color(70+c, 1+c, 105+c);
            g.setColor(myColor);
            rectDrawing(g,x,y);
        }

    }
    public static void rectDrawing(Graphics g, int x, int y) {
        g.fillRect(x, y, x+10, y+10);
    }

    //    Don't touch the code below
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
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}