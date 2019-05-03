import comp124graphics.Image;

public class Head extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(0,0, "Hair/Head1-1.png");
        spriteList.add(image);

        Image image2 = new Image (0,0, "Hair/Head2-1.png");
        spriteList.add(image2);

        Image image3 = new Image (0,0, "Hair/Head3-1.png");
        spriteList.add(image3);

        Image image4 = new Image (0,0, "Hair/Head4-1.png");
        spriteList.add(image4);

        Image image5 = new Image (0,0, "Hair/Head5-1.png");
        spriteList.add(image5);
    }
}
