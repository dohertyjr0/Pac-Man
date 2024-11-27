package ie.jr.project;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.HashSet;
import javax.swing.*;

public class PanMac extends JPanel {
   private int rowCount = 21;
   private int columnCount = 19;
   private int tileSize = 32;
   private int boardWidth = columnCount * tileSize;
   private int boardHeight = rowCount * tileSize;

   private Image wallImage;
   private Image blueGhostImage;
   private Image redGhostImage;
   private Image orangeGhostImage;
   private Image pinkGhostImage;

   private Image pacmanUpImage;
    private Image pacmanDownImage;
    private Image pacmanLeftImage;
    private Image pacmanRightImage;


    PanMac(){
        setPreferredSize(new Dimension(boardWidth, boardHeight));
        setBackground(Color.BLACK);

        wallImage = new ImageIcon(getClass().getResource("./wall.png")).getImage();
        blueGhostImage = new ImageIcon(getClass().getResource("./blueGhost.png")).getImage();
        redGhostImage = new ImageIcon(getClass().getResource("./redGhost.png")).getImage();
        orangeGhostImage = new ImageIcon(getClass().getResource("./orangeGhost.png")).getImage();
        pinkGhostImage = new ImageIcon(getClass().getResource("./pinkGhost.png")).getImage();

        pacmanUpImage = new ImageIcon(getClass().getResource("./pacmanUp.png")).getImage();
        pacmanDownImage = new ImageIcon(getClass().getResource("./pacmanDown.png")).getImage();
        pacmanLeftImage = new ImageIcon(getClass().getResource("./pacmanLeft.png")).getImage();
        pacmanRightImage = new ImageIcon(getClass().getResource("./pacmanRight.png")).getImage();
    }
}
