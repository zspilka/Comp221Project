import comp124graphics.Image;

public class Hair extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(6,0, "/Users/zazu/IdeaProjects/Comp221Project/Images/greenEye.jpg");
        spriteList.add(image);

        Image image2 = new Image (7,1, "/Users/zazu/IdeaProjects/Comp221Project/Images/blueEye.png");
        spriteList.add(image2);

    }
}
