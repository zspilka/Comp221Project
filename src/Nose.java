import javax.swing.*;
import java.awt.*;

public class Nose extends Feature {

//    @Override
//    protected void createSpriteList() {
//        Image image = new Image(4,0, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
//        spriteList.add(image);
//
//        Image image2 = new Image (5,1, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_brown.png");
//        spriteList.add(image2);

    @Override
    protected void createSpriteList() {
        ImageIcon icon = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
//        Image image = icon.getImage();
//        image.getScaledInstance(2,5,50);


        //        java.awt.Image image = new Image(0,0, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
//        java.awt.Image newImage = image;
        spriteList.add(icon);

//        Image image2 = new Image (5,1, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_brown.png");
//        spriteList.add(image2);
    }
}
