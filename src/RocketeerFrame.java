/*
Author: Gabriel Magidson, Elizabeth Brandwein
 */

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class RocketeerFrame extends JFrame{
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public final double screenWidth = screenSize.getWidth();
    public final double screenHeight = screenSize.getHeight();

    RocketeerGraphics rocketeerGraphics = new RocketeerGraphics();

    public RocketeerFrame() throws IOException{

    }
}
