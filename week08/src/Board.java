import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Board extends JComponent implements KeyListener {

    int heroX = 0;
    int heroY = 0;
    int increment = 72;
    int boardSize = 720;
    int tileSize = 72;
    int row = 0;
    int column = 0;
    int skelPoz1x = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int skelPoz1y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int skelPoz2x = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int skelPoz2y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int skelPoz3x = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int skelPoz3y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int bossPozX = ((int)(Math.random() * (9 - 3 + 1)) + 3);
    int bossPozY = ((int)(Math.random() * (9 - 3 + 1)) + 3);

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


        PositionedImage image = new PositionedImage("img/hero-down.png", heroX, heroY);
        image.draw(graphics);


        while (map [skelPoz1y][skelPoz1x] !=1 ) {
            skelPoz1x =((int)(Math.random() * (9 - 3 + 1)) + 3);
            skelPoz1y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
        }
        PositionedImage skeleton1 = new PositionedImage("img/skeleton.png", skelPoz1x*tileSize, skelPoz1y*tileSize);
        skeleton1.draw(graphics);

        while ((map [skelPoz2y][skelPoz2x] !=1)  ) {
            skelPoz2x =((int)(Math.random() * (9 - 3 + 1)) + 3);
            skelPoz2y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
        }
        PositionedImage skeleton2 = new PositionedImage("img/skeleton.png", skelPoz2x*tileSize, skelPoz2y*tileSize);
        skeleton2.draw(graphics);

        while (map [skelPoz3y][skelPoz3x] !=1 ) {
            skelPoz3x =((int)(Math.random() * (9 - 3 + 1)) + 3);
            skelPoz3y = ((int)(Math.random() * (9 - 3 + 1)) + 3);
        }
        PositionedImage skeleton3 = new PositionedImage("img/skeleton.png", skelPoz3x*tileSize, skelPoz3y*tileSize);
        skeleton3.draw(graphics);

        while (map [bossPozY][bossPozX] !=1 ) {
            bossPozX =((int)(Math.random() * (9 - 3 + 1)) + 3);
            bossPozX = ((int)(Math.random() * (9 - 3 + 1)) + 3);
        }
        PositionedImage boss = new PositionedImage("img/boss.png", bossPozX*tileSize, bossPozY*tileSize);
        boss.draw(graphics);

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
        if (e.getKeyCode() == KeyEvent.VK_DOWN && heroY < boardSize - tileSize && map[row + 1][column] == 1) {
            heroY += increment;
            row += 1;
        } else if (e.getKeyCode() == KeyEvent.VK_UP && heroY > 0 && map[row - 1][column] == 1 && row != 0) {
            heroY -= increment;
            row -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT && heroX > 0 && map[row][column - 1] == 1 && column != 0) {
            heroX -= increment;
            column -= 1;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT && heroX < boardSize - tileSize && map[row][column + 1] == 1 && (column + 1) != 0) {
            heroX += increment;
            column += 1;
        }

        // and redraw to have a new picture with the new coordinate
        repaint();
    }


}