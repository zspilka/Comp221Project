import comp124graphics.Image;

public class Eyes extends Feature {

    //testing making a subclass in Eyes, none of this is final work
    //making a canvas class to try displaying sprites would be the next
    //best step!

    @Override
    protected void createSpriteList() {
//        spriteList = new ArrayList<>();

//        ImageIcon icon = new ImageIcon("Images/blueEye.png");
//        Image image = icon.getImage();
        Image image = new Image(0,0, "/Users/zazu/IdeaProjects/Comp221Project/Images/greenEye.jpg");

        spriteList.add(image);
//        System.out.println(spriteList);

//        System.out.println(spriteList.get(0).getClass());
    }
}
