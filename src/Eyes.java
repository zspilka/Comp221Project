import javax.swing.*;

//import comp124graphics.Image;
public class Eyes extends Feature {

    //testing making a subclass in Eyes, none of this is final work
    //making a canvas class to try displaying sprites would be the next
    //best step!

    //        Image image = icon.getImage();
//        image.getScaledInstance(2,5,50);


    //        java.awt.Image image = new Image(0,0, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
//        java.awt.Image newImage = image;


    @Override
    protected void createSpriteList() {
        ////Path
        ImageIcon icon = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_blue.png");
        spriteList.add(icon);
        ImageIcon icon2 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_brown.png");
        spriteList.add(icon2);
        ImageIcon icon3 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_green.png");
        spriteList.add(icon3);
        ImageIcon icon4 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_yellow.png");
        spriteList.add(icon4);
        ImageIcon icon5 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair3_blue.png");
        spriteList.add(icon5);
        ImageIcon icon6 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair3_brown.png");
        spriteList.add(icon6);
        ImageIcon icon7 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair3_green.png");
        spriteList.add(icon7);
        ImageIcon icon8 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair3_yellow.png");
        spriteList.add(icon8);
        ImageIcon icon9 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair4_blue.png");
        spriteList.add(icon9);
        ImageIcon icon10 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair4_brown.png");
        spriteList.add(icon10);
        ImageIcon icon11 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair4_green.png");
        spriteList.add(icon11);
        ImageIcon icon12 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair4_yellow.png");
        spriteList.add(icon12);
        ImageIcon icon13 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair5_blue.png");
        spriteList.add(icon13);
        ImageIcon icon14 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair5_brown.png");
        spriteList.add(icon14);
        ImageIcon icon15 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair5_green.png");
        spriteList.add(icon15);
        ImageIcon icon16 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair5_yellow.png");
        spriteList.add(icon16);
        ImageIcon icon17 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair6_blue.png");
        spriteList.add(icon17);
        ImageIcon icon18 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair6_brown.png");
        spriteList.add(icon18);
        ImageIcon icon19 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair6_green.png");
        spriteList.add(icon19);
        ImageIcon icon20 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair6_yellow.png");
        spriteList.add(icon20);
        ImageIcon icon21 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair11_blue.png");
        spriteList.add(icon21);
        ImageIcon icon22 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair11_brown.png");
        spriteList.add(icon22);
        ImageIcon icon23 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair11_green.png");
        spriteList.add(icon23);
        ImageIcon icon24 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair11_yellow.png");
        spriteList.add(icon24);
        ImageIcon icon25 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair13_blue.png");
        spriteList.add(icon25);
        ImageIcon icon26 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair13_brown.png");
        spriteList.add(icon26);
        ImageIcon icon27 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair13_green.png");
        spriteList.add(icon27);
        ImageIcon icon28 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair13_yellow.png");
        spriteList.add(icon28);
        ImageIcon icon29 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair14_blue.png");
        spriteList.add(icon29);
        ImageIcon icon30 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair14_brown.png");
        spriteList.add(icon30);
        ImageIcon icon31 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair14_green.png");
        spriteList.add(icon31);
        ImageIcon icon32 = new ImageIcon("/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyesPair14_yellow.png");
        spriteList.add(icon32);

//        //Realitive Path verison:
//        ImageIcon icon = new ImageIcon("Eyes/EyePair2_blue.png");
//        spriteList.add(icon);
//        ImageIcon icon2 = new ImageIcon("Eyes/EyePair2_brown.png");
//        spriteList.add(icon2);
//        ImageIcon icon3 = new ImageIcon("Eyes/EyePair2_green.png");
//        spriteList.add(icon3);
//        ImageIcon icon4 = new ImageIcon("Eyes/EyePair2_yellow.png");
//        spriteList.add(icon4);
//        ImageIcon icon5 = new ImageIcon("Eyes/EyePair3_blue.png");
//        spriteList.add(icon5);
//        ImageIcon icon6 = new ImageIcon("Eyes/EyePair3_brown.png");
//        spriteList.add(icon6);
//        ImageIcon icon7 = new ImageIcon("Eyes/EyesPair3_green.png");
//        spriteList.add(icon7);
//        ImageIcon icon8 = new ImageIcon("Eyes/EyesPair3_yellow.png");
//        spriteList.add(icon8);
//        ImageIcon icon9 = new ImageIcon("Eyes/EyesPair4_blue.png");
//        spriteList.add(icon9);
//        ImageIcon icon10 = new ImageIcon("Eyes/EyesPair4_brown.png");
//        spriteList.add(icon10);
//        ImageIcon icon11 = new ImageIcon("Eyes/EyesPair4_green.png");
//        spriteList.add(icon11);
//        ImageIcon icon12 = new ImageIcon("Eyes/EyesPair4_yellow.png");
//        spriteList.add(icon12);
//        ImageIcon icon13 = new ImageIcon("Eyes/EyesPair5_blue.png");
//        spriteList.add(icon13);
//        ImageIcon icon14 = new ImageIcon("Eyes/EyesPair5_brown.png");
//        spriteList.add(icon14);
//        ImageIcon icon15 = new ImageIcon("Eyes/EyesPair5_green.png");
//        spriteList.add(icon15);
//        ImageIcon icon16 = new ImageIcon("Eyes/EyesPair5_yellow.png");
//        spriteList.add(icon16);
//        ImageIcon icon17 = new ImageIcon("Eyes/EyesPair6_blue.png");
//        spriteList.add(icon17);
//        ImageIcon icon18 = new ImageIcon("Eyes/EyesPair6_brown.png");
//        spriteList.add(icon18);
//        ImageIcon icon19 = new ImageIcon("Eyes/EyesPair6_green.png");
//        spriteList.add(icon19);
//        ImageIcon icon20 = new ImageIcon("Eyes/EyesPair6_yellow.png");
//        spriteList.add(icon20);
//        ImageIcon icon21 = new ImageIcon("Eyes/EyesPair11_blue.png");
//        spriteList.add(icon21);
//        ImageIcon icon22 = new ImageIcon("Eyes/EyesPair11_brown.png");
//        spriteList.add(icon22);
//        ImageIcon icon23 = new ImageIcon("Eyes/EyesPair11_green.png");
//        spriteList.add(icon23);
//        ImageIcon icon24 = new ImageIcon("Eyes/EyesPair11_yellow.png");
//        spriteList.add(icon24);
//        ImageIcon icon25 = new ImageIcon("Eyes/EyesPair13_blue.png");
//        spriteList.add(icon25);
//        ImageIcon icon26 = new ImageIcon("Eyes/EyesPair13_brown.png");
//        spriteList.add(icon26);
//        ImageIcon icon27 = new ImageIcon("Eyes/EyesPair13_green.png");
//        spriteList.add(icon27);
//        ImageIcon icon28 = new ImageIcon("Eyes/EyesPair13_yellow.png");
//        spriteList.add(icon28);
//        ImageIcon icon29 = new ImageIcon("Eyes/EyesPair14_blue.png");
//        spriteList.add(icon29);
//        ImageIcon icon30 = new ImageIcon("Eyes/EyesPair14_brown.png");
//        spriteList.add(icon30);
//        ImageIcon icon31 = new ImageIcon("Eyes/EyesPair14_green.png");
//        spriteList.add(icon31);
//        ImageIcon icon32 = new ImageIcon("Eyes/EyesPair14_yellow.png");
//        spriteList.add(icon32);


//        Image image2 = new Image (5,1, "/Users/zazu/IdeaProjects/Comp221Project/Eyes/EyePair2_brown.png");
//        spriteList.add(image2);

    }
}
