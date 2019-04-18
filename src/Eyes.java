import javax.swing.*;
import java.awt.*;

public class Eyes extends Feature {

    //testing making a subclass in Eyes, none of this is final work
    //making a canvas class to try displaying sprites would be the next
    //best step!

    @Override
    protected void createSpriteList() {
        ImageIcon icon = new ImageIcon("blueEye.png");
        Image image = icon.getImage();
        spriteList.add(image);
        System.out.println(spriteList.get(0).getClass());
    }
}
