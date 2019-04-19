import comp124graphics.GraphicsObject;
import comp124graphics.GraphicsObserver;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

//    public static DrawingWindowBuilder winwin;
    public static CanvasWindow win;
//    protected Feature feature;




    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("blueEye.png");
        java.awt.Image image = icon.getImage();

        win = new CanvasWindow("Main Window", 200, 500);
        win.add(image);
    }
}
