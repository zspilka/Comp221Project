import comp124graphics.Image;

public class Brow extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(8,0, "Images/blueEye.png");
        spriteList.add(image);

        Image image2 = new Image (9,1, "Images/greenEye.jpg");
        spriteList.add(image2);

    }
}
