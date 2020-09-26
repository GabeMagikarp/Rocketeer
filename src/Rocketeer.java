///*
//  Authors: Gabriel Magidson, Elizabeth Brandwein
// */
//
//import java.awt.*;
//import java.awt.event.*;
//import javax.swing.*;
//import javax.swing.Timer;
//import java.util.*;
//
//
//public class Rocketeer extends JPanel implements ActionListener, KeyListener {
//    private int dx; //The direction the rocket will move (+1 right, -1 left)
//    private int dy; //The direction the rocket will move (-1 up, +1 down)
//    private Image shipSprite;
//    final private int speed = 1;
//    final private int health = 4;
//    private RocketShip player;
//    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//    final double screenWidth = screenSize.getWidth();
//    final double screenHeight = screenSize.getHeight();
//
//    Timer timer = new Timer(5, this);
//
//    public Rocketeer(){
//        /*
//        An instance or a RocketShip is created for the player with a health of 4
//         */
//        RocketShip player = new RocketShip(4);
//
//        timer.start();
//        addKeyListener(this);
//        setFocusable(true);
//        setFocusTraversalKeysEnabled(false);
//    }
//
//    public void loadImage(){
//        ImageIcon rocketShip = new ImageIcon("rocket1.png");
//        shipSprite = rocketShip.getImage();
//    }
//
//    public void paint(Graphics g){
//        super.paint(g);
//
//        timer.start();
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if(player.getX() < 0){
//            dx = 0;
//            player.setX(0);
//        }
//
////        if(player.getX() < screenWidth - shipSprite.getWidth()){
////            dx = 0;
////            player.setX(1720);
////        }
//
//        if(player.getY() < 0){
//            dy = 0;
//            player.setY(0);
//        }
//
////        if(player.getY() > screenHeight - shipSprite.getHeight()){
////            dy = 0;
////            player.setY(0);
////        }
//
//        player.setX(player.getX() + dx);
//        player.setY(player.getY() + dy);
//        repaint();
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        int c = e.getKeyCode();
//
//        if(c == KeyEvent.VK_LEFT) {
//            dx = -speed;
//            dy = 0;
//        }
//
//        if(c == KeyEvent.VK_UP) {
//            dx = 0;
//            dy = -speed;
//        }
//
//        if(c == KeyEvent.VK_DOWN){
//            dx = 0;
//            dy = speed;
//        }
//
//        if(c == KeyEvent.VK_RIGHT){
//            dx = speed;
//            dy = 0;
//        }
//    }
//
//    @Override
//    public void keyReleased(KeyEvent e) {
//        dx = 0;
//        dy = 0;
//    }
//}
