///*
//  Authors: Gabriel Magidson, Elizabeth Brandwein
//
//  Rocketeer is a time-waster game meant to be ported to iOS/Android systems.
//  The user controls a rocket ship with which they avoid asteroids and
//  collect power-ups, in an attempt to try and get as high a score as possible.
// */
//
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowEvent;
//import javax.swing.*;
//
//public class RocketeerDriver extends Rocketeer{
//    public static void main(String[] args) {
//
//        /*
//        The game will adjust to any monitor's dimensions, and takes the
//        monitor's width and height to determine the size of the JFrame
//         */
//        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
//        final double screenWidth = screenSize.getWidth();
//        final double screenHeight = screenSize.getHeight();
//        /*final Dimension frameDimension = new Dimension((int) screenWidth,
//                (int) screenHeight);
//         */
//
//        /*
//        JFrame for the opening loading screen of the game is created
//         */
//        JFrame openingFrame = new JFrame("Welcome to Rocketeer!");
//        openingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        /*
//        JPanel to store the buttons on the main screen is created
//         */
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
//        buttonPanel.setLayout(new BoxLayout(buttonPanel,
//                BoxLayout.PAGE_AXIS));
//
//        /*
//        JButtons are created
//         */
//        JButton startButton = new JButton("");
//        startButton.setPreferredSize(new Dimension(300, 100));
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                openingFrame.dispatchEvent(new WindowEvent(openingFrame,
//                        WindowEvent.WINDOW_CLOSING));
//                JFrame
//            }
//        });
//        ImageIcon startB = new ImageIcon("startButton.png");
//        startButton.setIcon(resizeIcon(startB,150, 75));
//
//        JButton exitButton = new JButton("");
//        exitButton.setPreferredSize(new Dimension(150, 75));
//        exitButton.addActionListener(e -> System.exit(0));
//
//        /*
//        JButtons are added to the JPanel
//         */
//        buttonPanel.add(startButton);
//        buttonPanel.add(exitButton);
//
//        openingFrame.setLocationRelativeTo(null);
//        openingFrame.setSize((int) screenWidth, (int) screenHeight);
//        openingFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
//        openingFrame.add(buttonPanel);
//        openingFrame.pack();
//        openingFrame.setVisible(true);
//    }
//
//    private static Icon resizeIcon(ImageIcon icon, int resizedWidth,
//                                   int resizedHeight){
//        Image img = icon.getImage();
//        Image resizedImage = img.getScaledInstance(resizedWidth,
//                resizedHeight, java.awt.Image.SCALE_SMOOTH);
//        return new ImageIcon(resizedImage);
//    }
//}
//
