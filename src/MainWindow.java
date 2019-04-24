import comp124graphics.CanvasWindow;
import comp124graphics.Image;

public class MainWindow{

    protected static CanvasWindow win;
    protected static Image image;

    public static void main(String[] args) {

        image = new Image (0,0, "C:\\Users\\Linnea Prehn\\IdeaProjects\\Comp221Project\\Images\\blueEye.png");
        win = new CanvasWindow("Avatar", 500, 500);
        win.add(image);

        Feature [] spriteList = {new Eyes(), new Lips(), new Hair(), new Nose(), new Brow()};
        for (int i =0; i< spriteList.length; i++){
            System.out.println(spriteList[i].getSprite());
            win.add(spriteList[i].getSprite());
        }
//        System.out.println(feature.spriteList.size());
//        feature.printSprite();


    }

}
