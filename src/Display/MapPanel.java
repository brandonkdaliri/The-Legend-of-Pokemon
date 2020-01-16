package Display;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.KeyStroke;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Display.DisplayFrame;
import static Display.DisplayFrame.hBar;
import static Display.DisplayFrame.potionsM;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author 070029319
 */
public class MapPanel extends javax.swing.JPanel implements MouseListener {

    Timer timer;

    public MapPanel() {
        Timer time = new Timer(10, new TimerListener());
        time.start();

        initComponents();
        //KEY MAPPING
        //Right arrow key
        this.getInputMap().put(KeyStroke.getKeyStroke("D"), "right");
        this.getActionMap().put("right", new moveRight());
        //Left arrow key
        this.getInputMap().put(KeyStroke.getKeyStroke("A"), "left");
        this.getActionMap().put("left", new moveLeft());
        //Up arrow key
        this.getInputMap().put(KeyStroke.getKeyStroke("W"), "up");
        this.getActionMap().put("up", new moveUp());
        //Down arrow key
        this.getInputMap().put(KeyStroke.getKeyStroke("S"), "down");
        this.getActionMap().put("down", new moveDown());
        //Health pot key (c key)
        this.getInputMap().put(KeyStroke.getKeyStroke("C"), "healthBtn");
        this.getActionMap().put("healthBtn", new healthBtn());
        //Mana pot key (v key)
        this.getInputMap().put(KeyStroke.getKeyStroke("V"), "manaBtn");
        this.getActionMap().put("manaBtn", new manaBtn());

    }

    //IMPORTANT VARIABLES//
    static int playerX = 5;//players xy coordinates
    static int playerY = 160;
    //constants for player width and height
    static int playerW = 48;//actual dimensions Width = 49px
    static int playerH = 51;//Height = 52px
    //movement speed
    int speed = 5;
    //player direction
    int direction = 1; //1 = UP/DOWN, 2 = RIGHT, 3 = LEFT

    public void paintComponent(Graphics g) {
        super.paintComponent(g);//clears the screen

        //SPRITE SHEET//
        Image playerUpDown = new ImageIcon(this.getClass().getResource("linkUp.gif")).getImage();
        Image playerLeft = new ImageIcon(this.getClass().getResource("linkLeft.gif")).getImage();
        Image playerRight = new ImageIcon(this.getClass().getResource("linkRight.gif")).getImage();
        //MAPS
        /*IMPORTANT:
         Backgrounds need a black bar of 46px for the health bar and mana bar
         */
        Image map1 = new ImageIcon(this.getClass().getResource("map1.png")).getImage();

        g.drawImage(map1, 0, 0, this);
        if (direction == 1) {
            g.drawImage(playerUpDown, playerX, playerY, this);
        } else if (direction == 2) {
            g.drawImage(playerRight, playerX, playerY, this);
        } else if (direction == 3) {
            g.drawImage(playerLeft, playerX, playerY, this);
        }

    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    void anim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //Vasily's contribution
    private class TimerListener implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            DisplayFrame.Locations();

            repaint();
        }
    }

    private class moveRight extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            //This makes sure the play can't go off the screen
            //We add playerW to account for the width of the sprite
            //Right boundary
            direction = 2;
            if (playerX + playerW >= 800) {
                playerX = 800 - playerW;
            } else {
                playerX += speed;
            }

        }

    }

    private class moveLeft extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            //This makes sure the play can't go off the screen
            //Left boundary
            direction = 3;
            if (playerX <= 0) {
                playerX = 0;
            } else {
                playerX -= speed;
            }

        }
    }

    private class moveUp extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            //This makes sure the play can't go off the screen
            //Top boundary
            direction = 1;
            if (playerY <= 45) {
                playerY = 45;
            } else {
                playerY -= speed;
            }

        }
    }

    private class moveDown extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            //This makes sure the player can't go off the screen
            //we add playerH to account for the height of the sprite
            //Bottom boundary
            direction = 1;
            if (playerY + playerH >= 600) {
                playerY = 600 - playerH;
            } else {
                playerY += speed;
            }

        }
    }

    //Health pot use
    private class healthBtn extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            if (DisplayFrame.potionsHP > 0) {
                DisplayFrame.hBar.setValue(DisplayFrame.hBar.getValue() + 20);
                DisplayFrame.potionsHP--;
                DisplayFrame.HPLabel.setText("x" + DisplayFrame.potionsHP);
                if (hBar.getValue() <= 100 && hBar.getValue() > 50) {
                    hBar.setForeground(Color.green);
                } else if (hBar.getValue() <= 50 && hBar.getValue() > 30) {
                    hBar.setForeground(Color.yellow);
                } else if (hBar.getValue() <= 30) {
                    hBar.setForeground(Color.red);
                }
            }
        }

    }
    
    private class manaBtn extends AbstractAction {

        public void actionPerformed(ActionEvent ae) {
            if (DisplayFrame.potionsM > 0) {
                DisplayFrame.mBar.setValue(DisplayFrame.mBar.getValue() + 20);
                DisplayFrame.potionsM--;
                DisplayFrame.MLabel.setText("x" + DisplayFrame.potionsM);
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
