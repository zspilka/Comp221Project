import comp124graphics.CanvasWindow;
import comp124graphics.Image;

public class MainWindow{

    protected static CanvasWindow win;
    protected static Image image;

    public static void main(String[] args) {

        win = new CanvasWindow("Avatar", 1300, 700);


        Feature [] spriteList = {new Eyes(), new Lips(), new Hair(), new Nose(), new Brow()};
        for (int i =0; i< spriteList.length; i++){
            System.out.println(spriteList[i].getSprite());
            win.add(spriteList[i].getSprite(), 100, 100);
        }
//        System.out.println(feature.spriteList.size());
//        feature.printSprite();


    }

}
