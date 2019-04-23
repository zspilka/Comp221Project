import comp124graphics.CanvasWindow;
import javafx.scene.canvas.Canvas;

import javax.swing.*;

/**
 * For now, abadoning this file in favor of CanvasWindow.java because this is becoming a little too
 * complicated and slightly convoluted.
 * will work on this more once I figure out how to add a png file to the canvas.
 *
 */

public class DrawingWindowBuilder extends CanvasWindow {

    protected Canvas win;



    public void createWindow(String title, int winWidth, int winHeight) {
        ImageIcon icon = new ImageIcon("Images/blueEye.png");
        java.awt.Image image = icon.getImage();

//        GraphicsContext gc = win.getGraphicsContext2D();
        win = new Canvas();
        win.setHeight(winHeight);
        win.setWidth(winWidth);


    }


    public DrawingWindowBuilder(String title, int width, int height) {
        super(title, width, height);
        createWindow(title, width, height);
//        System.out.println(win.getHeight());
//        System.out.println(win.getWidth());

    }


}
