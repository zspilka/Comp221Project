import comp124graphics.Image;

public class Nose extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(2,2, "Images/blueEye.png");
        spriteList.add(image);

        Image image2 = new Image (3,3, "Images/greenEye.jpg");
        spriteList.add(image2);

    }
}
