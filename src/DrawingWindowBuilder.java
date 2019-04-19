import comp124graphics.CanvasWindow;
import comp124graphics.GraphicsObject;
import comp124graphics.GraphicsObserver;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * For now, abadoning this because its a little too convaluted/Complicated, will work on this more once I figure out how to add a png file to the canvas.
 */

public class DrawingWindowBuilder extends CanvasWindow {

    protected Canvas win;



    public void createWindow(String title, int winWidth, int winHeight) {
        ImageIcon icon = new ImageIcon("blueEye.png");
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
