import comp124graphics.Image;

public class Eyes extends Feature {

    //testing making a subclass in Eyes, none of this is final work
    //making a canvas class to try displaying sprites would be the next
    //best step!

    @Override
    protected void createSpriteList() {
        Image image = new Image(0,0, "/Users/zazu/IdeaProjects/Comp221Project/Images/greenEye.jpg");
        spriteList.add(image);
        image = new Image (1,1, "/Users/zazu/IdeaProjects/Comp221Project/Images/blueEye.png");
        spriteList.add(image);

    }
}
