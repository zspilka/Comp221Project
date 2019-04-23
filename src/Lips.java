import comp124graphics.Image;

public class Lips extends Feature {

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
