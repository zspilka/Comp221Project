import comp124graphics.Image;

public class Hair extends Feature {

    @Override
    protected void createSpriteList() {
        Image image = new Image(0,0, "Hair/BabySprig-1.png");
        spriteList.add(image);

        Image image2 = new Image (0,0, "Hair/Balding-1.png");
        spriteList.add(image2);

        Image image3 = new Image (0,0, "Hair/Buzzed-1.png");
        spriteList.add(image3);

        Image image4 = new Image (0,0, "Hair/ChinCurls-1.png");
        spriteList.add(image4);

        Image image5 = new Image (0,0, "Hair/ChinLength-1.png");
        spriteList.add(image5);

        Image image6 = new Image (0,0, "Hair/Clips-1.png");
        spriteList.add(image6);

        Image image7 = new Image (0,0, "Hair/Flat-1.png");
        spriteList.add(image7);

        Image image8 = new Image (0,0, "Hair/Goatee-1.png");
        spriteList.add(image8);

        Image image9 = new Image (0,0, "Hair/Mohawk-1.png");
        spriteList.add(image9);

        Image image10 = new Image (0,0, "Hair/Shaved-1.png");
        spriteList.add(image10);

        Image image11 = new Image (0,0, "Hair/UglyDo-1.png");
        spriteList.add(image11);

        Image image12 = new Image (0,0, "Hair/WeirdToupee-1.png");
        spriteList.add(image12);

    }
}
