import javax.swing.*;

public class Head extends Feature {

    @Override
    protected void createSpriteList() {
//        Image image = new Image(0,0, "Heads/Head1-1.png");
//        spriteList.add(image);
//
//        Image image2 = new Image (0,0, "Heads/Head2-1.png");
//        spriteList.add(image2);
//
//        Image image3 = new Image (0,0, "Heads/Head3-1.png");
//        spriteList.add(image3);
//
//        Image image4 = new Image (0,0, "Heads/Head4-1.png");
//        spriteList.add(image4);
//
//        Image image5 = new Image (0,0, "Heads/Head5-1.png");
//        spriteList.add(image5);

        ImageIcon icon = new ImageIcon("Heads/Head1.png");
//        Image image = icon.getImage();
//        image.getScaledInstance(2,5,50);


        //        java.awt.Image image = new Image(0,0, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
//        java.awt.Image newImage = image;
        spriteList.add(icon);
        ImageIcon icon2 = new ImageIcon("Heads/Head2.png");
        spriteList.add(icon2);
        ImageIcon icon3 = new ImageIcon("Heads/Head3.png");
        spriteList.add(icon3);
        ImageIcon icon4 = new ImageIcon("Heads/Head4.png");
        spriteList.add(icon4);
        ImageIcon icon5 = new ImageIcon("Heads/Head5.png");
        spriteList.add(icon5);
    }
}
