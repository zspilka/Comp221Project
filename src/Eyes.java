import comp124graphics.Image;

public class Eyes extends Feature {

    //testing making a subclass in Eyes, none of this is final work
    //making a canvas class to try displaying sprites would be the next
    //best step!

    @Override
    protected void createSpriteList() {
        Image image = new Image(4,0, "Images/blueEye.png");
        spriteList.add(image);

        Image image2 = new Image (5,1, "Images/greenEye.jpg");
        spriteList.add(image2);

    }
}
