import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends JComponent implements KeyListener {

    int bossX = 0;
    int bossY = 0;
    int increment = 72;
    int boardSize = 720;
    int tileSize = 72;
    int row = 0;
    int coulumn = 0;
    int skelPoz1x = ((int)(Math.random() * (9 - 1 + 1)) + 1);
    int skelPoz1y = ((int)(Math.random() * (9 - 1 + 1)) + 1);
    int skelPoz2x = ((int)(Math.random() * (9 - 1 + 1)) + 1);
    int skelPoz2y = ((int)(Math.random() * (9 - 1 + 1)) + 1);
    int skelPoz3x = ((int)(Math.random() * (9 - 1 + 1)) + 1);
    int skelPoz3y = ((int)(Math.random() * (9 - 1 + 1)) + 1);

    int[][] map = {
            {1, 1, 1, 0, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0, 0, 1},
            {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
            {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
            {1, 1, 1, 1, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 0, 1, 0, 0, 1, 0, 1},
    };


    public Board() {


        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
       /* graphics.fillRect(testBoxX, testBoxY, 100, 100);
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g. */


        int x = 0;
        int y = 0;

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] == 1) {

                    PositionedImage image = new PositionedImage("img/floor.png", x, y);
                    image.draw(graphics);

                    x += 72;

                }

                if (map[i][j] == 0) {
                    PositionedImage image = new PositionedImage("img/wall.png", x, y);
                    image.draw(graphics);
                    x += 72;


                }

            }
            x = 0;
            y += 72;

        }

        PositionedImage image = new PositionedImage("img/hero-down.png", bossX, bossY);
        image.draw(graphics);


        while (map [skelPoz1y][skelPoz1x]== 0 ) {
            skelPoz1x =((int)(Math.random() * (9 - 1 + 1)) + 1);
            skelPoz1y = ((int)(Math.random() * (9 - 1 + 1)) + 1);
        }
        PositionedImage skeleton1 = new PositionedImage("img/skeleton.png", skelPoz1x*72, skelPoz1y*72);
        skeleton1.draw(graphics);

        while (map [skelPoz2y][skelPoz2x]== 0 ) {
            skelPoz2x =((int)(Math.random() * (9 - 1 + 1)) + 1);
            skelPoz2y = ((int)(Math.random() * (9 - 1 + 1)) + 1);
        }
        PositionedImage skeleton2 = new PositionedImage("img/skeleton.png", skelPoz2x*72, skelPoz2y*72);
        skeleton2.draw(graphics);

        while (map [skelPoz3y][skelPoz3x]== 0 ) {
            skelPoz3x =((int)(Math.random() * (9 - 1 + 1)) + 1);
            skelPoz3y = ((int)(Math.random() * (9 - 1 + 1)) + 1);
        }
        PositionedImage skeleton3 = new PositionedImage("img/skeleton.png", skelPoz3x*72, skelPoz3y*72);
        skeleton3.draw(graphics);

    }

    public static void main(String[] args) {
        // Here is how you set up a new window and adding our board to it
        JFrame frame = new JFrame("RPG Game");
        Board board = new Board();
        frame.add(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
        // Here is how you can add a key event listener
        // The board object will be notified when hitting any key
        // with the system calling one of the below 3 methods
        frame.addKeyListener(board);
        // Notice (at the top) that we can only do this
        // because this Board class (the type of the board object) is also a KeyListener
    }

    // To be a KeyListener the class needs to have these 3 methods in it
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    // But actually we can use just this one for our goals here
    @Override

    public void keyReleased(KeyEvent e) {
        // When the up or down keys hit, we change the position of our box
        if (e.getKeyCode() == KeyEvent.VK_DOWN && bossY < boardSize - tileSize && map[row + 1][coulumn] == 1) {
            bossY += increment;
            row += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_UP && bossY > 0 && map[row - 1][coulumn] == 1 && row != 0) {
            bossY -= increment;
            row -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && bossX > 0 && map[row][coulumn - 1] == 1 && coulumn != 0) {
            bossX -= increment;
            coulumn -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && bossX < boardSize - tileSize && map[row][coulumn + 1] == 1 && (coulumn + 1) != 0) {
            bossX += increment;
            coulumn += 1;
        }


        // and redraw to have a new picture with the new coordinates
        repaint();
    }


}