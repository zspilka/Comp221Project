//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.swing.ImageIcon;

public class Hair extends Feature {
    Hair() {
        this.setStats();
    }

    protected void randomizeSprite() {
        int index = this.random.nextInt(this.spriteList.size());
        this.sprite = (ImageIcon)this.spriteList.get(index);
        this.setStats();
    }

    protected void randomizeSpriteRange(int minLimit, int maxLimit) {
        int index = this.random.nextInt(maxLimit - minLimit) + minLimit;
        this.sprite = (ImageIcon)this.spriteList.get(index);
        this.setStats();
    }

    protected void createSpriteList() {
        ImageIcon icon = new ImageIcon("Hair/Buzzed.png");
        this.spriteList.add(icon);
        ImageIcon icon2 = new ImageIcon("Hair/ChinCurls.png");
        this.spriteList.add(icon2);
        ImageIcon icon3 = new ImageIcon("Hair/Shaved.png");
        this.spriteList.add(icon3);
        ImageIcon icon4 = new ImageIcon("Hair/ChinLength.png");
        this.spriteList.add(icon4);
        ImageIcon icon5 = new ImageIcon("Hair/Clips.png");
        this.spriteList.add(icon5);
        ImageIcon icon6 = new ImageIcon("Hair/Flat.png");
        this.spriteList.add(icon6);
        ImageIcon icon7 = new ImageIcon("Hair/Balding.png");
        this.spriteList.add(icon7);
        ImageIcon icon8 = new ImageIcon("Hair/Goatee.png");
        this.spriteList.add(icon8);
        ImageIcon icon9 = new ImageIcon("Hair/UglyDo.png");
        this.spriteList.add(icon9);
        ImageIcon icon10 = new ImageIcon("Hair/Mohawk.png");
        this.spriteList.add(icon10);
        ImageIcon icon11 = new ImageIcon("Hair/WeirdToupee.png");
        this.spriteList.add(icon11);
        ImageIcon icon12 = new ImageIcon("Hair/BabySprig.png");
        this.spriteList.add(icon12);
    }

    protected void setStats() {
        if (this.sprite.toString().equals("Hair/Buzzed.png")) {
            this.y = 20;
            this.x = 195;
            this.width = 370;
            this.height = 200;
        } else if (this.sprite.toString().equals("Hair/ChinCurls.png")) {
            this.y = 75;
            this.x = 200;
            this.width = 410;
            this.height = 400;
        } else if (this.sprite.toString().equals("Hair/Shaved.png")) {
            this.y = 15;
            this.x = 200;
            this.width = 345;
            this.height = 150;
        } else if (this.sprite.toString().equals("Hair/ChinLength.png")) {
            this.y = 75;
            this.x = 200;
            this.width = 410;
            this.height = 400;
        } else if (this.sprite.toString().equals("Hair/Clips.png")) {
            this.y = 75;
            this.x = 200;
            this.width = 410;
            this.height = 400;
        } else if (this.sprite.toString().equals("Hair/Flat.png")) {
            this.y = -50;
            this.x = 200;
            this.width = 305;
            this.height = 200;
        } else if (this.sprite.toString().equals("Hair/Balding.png")) {
            this.y = 20;
            this.x = 200;
            this.width = 315;
            this.height = 100;
        } else if (this.sprite.toString().equals("Hair/Goatee.png")) {
            this.y = 275;
            this.x = 200;
            this.width = 50;
            this.height = 50;
        } else if (this.sprite.toString().equals("Hair/UglyDo.png")) {
            this.y = -20;
            this.x = 200;
            this.width = 345;
            this.height = 225;
        } else if (this.sprite.toString().equals("Hair/Mohawk.png")) {
            this.y = -100;
            this.x = 200;
            this.width = 100;
            this.height = 125;
        } else if (this.sprite.toString().equals("Hair/WeirdToupee.png")) {
            this.y = -60;
            this.x = 200;
            this.width = 100;
            this.height = 50;
        } else if (this.sprite.toString().equals("Hair/BabySprig.png")) {
            this.y = -50;
            this.x = 200;
            this.width = 50;
            this.height = 50;
        }

    }
}
