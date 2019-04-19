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


public class DrawingWindowBuilder extends JPanel implements GraphicsObserver {

    protected Canvas win;
    protected Eyes aye = new Eyes();
    protected JFrame winFrame;

    private ConcurrentLinkedDeque<Image> gObjects;


    public void createWindow(String title, int winWidth, int winHeight) {
//        GraphicsContext gc = win.getGraphicsContext2D();
        win = new Canvas();
        win.setHeight(winHeight);
        win.setWidth(winWidth);
        setPreferredSize(new Dimension(winWidth, winHeight));
        setBackground (Color.white);
        winFrame = new JFrame (title);
        winFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        winFrame.getContentPane().add(this);
        winFrame.pack();
        winFrame.setVisible(true);
        



//        win.add(aye);
    }

    /**
     * Adds the graphical object to the list of objects drawn on the canvas
     * @param image
     */
    public void add(Image image){
//        image.addObserver(this);
        gObjects.add(image);
        repaint();
    }

    /**
     * Adds the graphical object to the list of objects drawn on the canvas
     * at the position x, y.
     *
     * @param image  the graphical object to be drawn
     * @param x        the x position of graphical object
     * @param y        the y position of graphical object
     */
    public void add(Image image, double x, double y){
//        image.ad(x, y);
        this.add(image);
//        gObject.addObserver(this);
//        gObjects.add(gObject);
//        repaint();
    }

    /**
     * Removes the object from being drawn
     * @param gObject
     * @throws NoSuchElementException if gObject has not been added to the canvas
     */
    public void removeZ(GraphicsObject gObject){
        gObject.removeObserver(this);
        boolean success = gObjects.remove(gObject);
        if (!success){
            throw new NoSuchElementException("The object you want to remove has not been added to the canvaswindow. Perhaps it was already removed or was added to a GraphicsGroup instead of the canvas.");
        }
        repaint();
    }

    /**
     * Removes all of the objects currently drawn on the canvas
     */
    public void removeAllZ(){
        Iterator<Image> it = gObjects.iterator();
        while(it.hasNext()){
            Image obj = it.next();
//            obj.removeObserver(this);
            it.remove();
        }
        repaint();
    }


    public DrawingWindowBuilder(String title, int width, int height){
        createWindow(title, width,height);
//        System.out.println(win.getHeight());
//        System.out.println(win.getWidth());

    }


    public JFrame getWindowFrame(){
        return winFrame;
    }

    /**
     * Closes the canvas window.
     */
    public void closeWindow() {
        winFrame.dispatchEvent(new WindowEvent(winFrame, WindowEvent.WINDOW_CLOSED));
    }


    @Override
    public void graphicChanged(GraphicsObject changedObject) {

    }
}
