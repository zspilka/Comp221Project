import comp124graphics.Image;

public class Nose extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(2,2, "/Users/zazu/IdeaProjects/Comp221Project/Images/greenEye.jpg");
        spriteList.add(image);

        Image image2 = new Image (3,3, "/Users/zazu/IdeaProjects/Comp221Project/Images/blueEye.png");
        spriteList.add(image2);

    }
}
