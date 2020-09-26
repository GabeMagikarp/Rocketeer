/*
Authors: Gabriel Magidson, Elizabeth Brandwein
 */

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class RocketeerGraphics extends JPanel implements ActionListener,
        KeyListener{
    final int delay = 5;
    Timer timer = new Timer(delay, this);
    int x = 0;
    int y = 0;
    int seconds = 0;
    Image background;
    BufferedImage logo;
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public final double screenWidth = screenSize.getWidth();
    public final double screenHeight = screenSize.getHeight();
    int bgWidth, bgLength;
    JLabel rocketLabel;

    public RocketeerGraphics() throws IOException {
        this.addKeyListener(this);
        background = ImageIO.read(new File("Sprites/background.png"));
        logo = ImageIO.read(new File("Sprites/logo1.png"));


        rocketLabel = new JLabel();
        rocketLabel.setSize(300,125);
        rocketLabel.setLocation((int)screenWidth/2, (int)screenHeight/2);
        ImageIcon rRocket =
                new ImageIcon(new ImageIcon("Sprites/rocket1.png").getImage().getScaledInstance(rocketLabel.getWidth(), rocketLabel.getHeight(), Image.SCALE_SMOOTH));
        rocketLabel.setIcon(rRocket);

        this.setLayout(null);
        this.add(rocketLabel);

        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(background, 0, 0, (int)screenWidth, (int)screenHeight,null);
        g.drawImage(logo, 250, 0, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
