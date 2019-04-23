import comp124graphics.CanvasWindow;
import comp124graphics.Image;

public class MainWindow {

    protected static CanvasWindow win;
    protected static Image image;
    protected static Feature feature;

    public static void main(String[] args) {
        image = new Image (0,0, "/Users/zazu/IdeaProjects/Comp221Project/Images/greenEye.jpg");
        win = new CanvasWindow("Avatar", 500, 500);
        win.add(image);


    }
}
