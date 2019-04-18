import javafx.scene.canvas.Canvas;

public class DrawingWindowBuilder extends Canvas {

    protected Canvas win;
    protected Eyes aye = new Eyes();

    public void createWindow() {
        win = new Canvas();
        win.setHeight(100);
        win.setWidth(200);

    }


}
