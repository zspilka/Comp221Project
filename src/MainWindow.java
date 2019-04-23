import comp124graphics.CanvasWindow;
import comp124graphics.GraphicsObject;
import comp124graphics.GraphicsObserver;
import comp124graphics.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class MainWindow {

//    public static DrawingWindowBuilder winwin;
    protected static CanvasWindow win;
    protected static Canvas iWin;
    protected static Graphics2D g2d;
    protected static Image image;
//    protected Feature feature;




    public static void main(String[] args) {
//        ImageIcon icon = new ImageIcon("greenEye.png");
//        java.awt.Image image = icon.getImage();

        image = new Image (0,0, "/Users/zazu/IdeaProjects/Comp221Project/src/greenEye.jpg");



        win = new CanvasWindow("Main Window", 200, 500);
        win.setBackground(Color.BLACK);

        win.add(image);

//
//        iWin = new Canvas();
//
//        iWin.setBounds(0,0,500,500);
//        iWin.setBackground(Color.BLACK);
//        iWin.setVisible(true);
//



//        p.paint(image.getGraphics());
//        win.add(icon,0,0);
//        win.add(image);

    }
}
