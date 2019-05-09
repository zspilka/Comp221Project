import javax.swing.*;

public class Hair extends Feature {

    Hair() {
        super();
        setStats();
    }

    @Override
    protected void randomizeSprite() {
        int index = random.nextInt(spriteList.size());
        sprite = spriteList.get(index);
        setStats();
    }

    @Override
    protected void randomizeSpriteRange(int minLimit, int maxLimit) {
        int index = random.nextInt(maxLimit - minLimit) + minLimit;
        sprite = spriteList.get(index);
        setStats();
    }

    @Override
    protected void createSpriteList() {

        //path

//        ImageIcon icon = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Buzzed.png");
//        spriteList.add(icon);
//        ImageIcon icon2 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/ChinCurls.png");
//        spriteList.add(icon2);
//        ImageIcon icon3 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Shaved.png");
//        spriteList.add(icon3);
//        ImageIcon icon4 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/ChinLength.png");
//        spriteList.add(icon4);
//        ImageIcon icon5 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Clips.png");
//        spriteList.add(icon5);
//        ImageIcon icon6 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Flat.png");
//        spriteList.add(icon6);
//        ImageIcon icon7 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Balding.png");
//        spriteList.add(icon7);
//        ImageIcon icon8 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Goatee.png");
//        spriteList.add(icon8);
//        ImageIcon icon9 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/UglyDo.png");
//        spriteList.add(icon9);
//        ImageIcon icon10 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/Mohawk.png");
//        spriteList.add(icon10);
//        ImageIcon icon11 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/WeirdToupee.png");
//        spriteList.add(icon11);
//        ImageIcon icon12 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Hair/BabySprig.png");
//        spriteList.add(icon12);


////        //realitive path:
        ImageIcon icon = new ImageIcon("Hair/Buzzed.png");
        spriteList.add(icon);
        ImageIcon icon2 = new ImageIcon("Hair/ChinCurls.png");
        spriteList.add(icon2);
        ImageIcon icon3 = new ImageIcon("Hair/Shaved.png");
        spriteList.add(icon3);
        ImageIcon icon4 = new ImageIcon("Hair/ChinLength.png");
        spriteList.add(icon4);
        ImageIcon icon5 = new ImageIcon("Hair/Clips.png");
        spriteList.add(icon5);
        ImageIcon icon6 = new ImageIcon("Hair/Flat.png");
        spriteList.add(icon6);
        ImageIcon icon7 = new ImageIcon("Hair/Balding.png");
        spriteList.add(icon7);
        ImageIcon icon8 = new ImageIcon("Hair/Goatee.png");
        spriteList.add(icon8);
        ImageIcon icon9 = new ImageIcon("Hair/UglyDo.png");
        spriteList.add(icon9);
        ImageIcon icon10 = new ImageIcon("Hair/Mohawk.png");
        spriteList.add(icon10);
        ImageIcon icon11 = new ImageIcon("Hair/WeirdToupee.png");
        spriteList.add(icon11);
        ImageIcon icon12 = new ImageIcon("Hair/BabySprig.png");
        spriteList.add(icon12);

    }

    @Override
    protected void setStats() {
        if (sprite.toString().equals("Hair/Buzzed.png")) {
            y = 20;
            x = 195;
            width = 370;
            height = 200;
        } else if (sprite.toString().equals("Hair/ChinCurls.png")){
            y = 75;
            x = 200;
            width = 410;
            height = 400;
        } else if (sprite.toString().equals("Hair/Shaved.png")){
            y = 15;
            x = 200;
            width = 345;
            height = 150;
        } else if (sprite.toString().equals("Hair/ChinLength.png")){
            y = 75;
            x = 200;
            width = 410;
            height = 400;
        } else if (sprite.toString().equals("Hair/Clips.png")){
            y = 75;
            x = 200;
            width = 410;
            height = 400;
        } else if (sprite.toString().equals("Hair/Flat.png")){
            y = -50;
            x = 200;
            width = 305;
            height = 200;
        } else if (sprite.toString().equals("Hair/Balding.png")){
            y = 20;
            x = 200;
            width = 315;
            height = 100;
        } else if (sprite.toString().equals("Hair/Goatee.png")){
            y = 275;
            x = 200;
            width = 50;
            height = 50;
        } else if (sprite.toString().equals("Hair/UglyDo.png")){
            y = -20;
            x = 200;
            width = 345;
            height = 225;
        } else if (sprite.toString().equals("Hair/Mohawk.png")){
            y = -100;
            x = 200;
            width = 100;
            height = 125;
        } else if (sprite.toString().equals("Hair/WeirdToupee.png")){
            y = -60;
            x = 200;
            width = 100;
            height = 50;
        } else if (sprite.toString().equals("Hair/BabySprig.png")){
            y = -50;
            x = 200;
            width = 50;
            height = 50;
        }
    }
}