/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package space_crawl;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Sean
 */
public class Space_Crawl extends JFrame {

    private ImageIcon farmIcon = new ImageIcon("barn.png");
    private Image farm = farmIcon.getImage();
    private GamePane gamePane = new GamePane();
    private static Player player = new Player();
    private static Room fRoom = new Room();

    public Space_Crawl() {

        add(gamePane);
        ControlListener controls = new ControlListener();
        addKeyListener(controls);

    }

    public static void main(String[] args) {
        // TODO code application logic here
        player.setRoom(fRoom);
        player.setPosition(0, 0);
        Space_Crawl game = new Space_Crawl();
        game.setSize(800, 600);
        game.setVisible(true);
    }

    public class GamePane extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.red);
            Polygon roof = new Polygon();
            Polygon lwall = new Polygon();
            Polygon rwall = new Polygon();
            roof.addPoint(0, 0);
            roof.addPoint(150, 100);
            roof.addPoint(650, 100);
            roof.addPoint(800, 0);
            lwall.addPoint(0, 0);
            lwall.addPoint(150, 100);
            lwall.addPoint(150, 500);
            lwall.addPoint(0, 600);
            rwall.addPoint(800, 0);
            rwall.addPoint(650, 100);
            rwall.addPoint(650, 500);
            rwall.addPoint(800, 600);

            Space walls = player.getRoom().getWalls(player.getPosition().x, player.getPosition().y);
            switch (walls.getEast()) {
                case 'w':
                    g.setColor(Color.blue);
                    break;
                case 'd':
                    g.setColor(Color.yellow);
                    break;
                case ' ':
                    g.setColor(Color.black);
                    break;
            }            
            g.fillPolygon(rwall);
            
            switch (walls.getWest()) {
                case 'w':
                    g.setColor(Color.blue);
                    break;
                case 'd':
                    g.setColor(Color.yellow);
                    break;
                case ' ':
                    g.setColor(Color.black);
                    break;
            }
            g.fillPolygon(lwall);
            
            g.setColor(Color.red);
            g.fillPolygon(roof);
            
            switch (walls.getNorth()) {
                case 'w':
                    g.setColor(Color.blue);
                    break;
                case 'd':
                    g.setColor(Color.yellow);
                    break;
                case ' ':
                    g.setColor(Color.black);
                    break;
            }
            g.fillRect(150, 100, 500, 400);

            g.setColor(Color.black);
            g.drawPolygon(roof);
            g.drawPolygon(lwall);
            g.drawPolygon(rwall);
            g.drawRect(150, 100, 500, 400);

        }
    }

    private class ControlListener implements KeyListener {

        public void keyTyped(KeyEvent e) {
            char keyChar = e.getKeyChar();
            switch (keyChar) {
                case 'w':
                    player.move();
                    break;
                case 's':
                    break;
                case 'd':
                    player.turnRight();
                    break;
                case 'a':
                    player.turnLeft();
                    break;

            }
            gamePane.repaint();
        }

        public void keyReleased(KeyEvent e) {
        }

        public void keyPressed(KeyEvent e) {
            char keyChar = e.getKeyChar();
            switch (keyChar) {
                case 'w':
                    player.move();
                    break;
                case 's':
                    break;
                case 'd':
                    player.turnRight();
                    break;
                case 'a':
                    player.turnLeft();
                    break;

            }
            gamePane.repaint();
        }
    }
}
