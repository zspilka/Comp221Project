import comp124graphics.CanvasWindow;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.util.Random;



public class FaceBuilder extends JPanel {

    protected Random random = new Random();   //this object will be used to generate random numbers
    Feature [] featureList = {new Hair(), new Eyes(), new Lips(), new Nose(), new Brow()};
    Weirdifier weird = new Weirdifier();


    public FaceBuilder(int weirdnessLevel) {

        weird.setWeirdnessLevel(weirdnessLevel);

        Head headFeature = new Head();
        for (Feature feature : featureList) {
            weird.setRandomSprite(feature);
            weird.setRandomSize(feature);
        }

        ImageIcon head = getScaledImage(headFeature.getSprite(),
                350,350);

        ImageIcon hair = getScaledImage(featureList[0].getSprite(),
                featureList[0].getWidth(), featureList[0].getHeight());

        ImageIcon eyes = getScaledImage(featureList[1].getSprite(),
                175 + featureList[1].getSize(),  25 + featureList[1].getSize());

        ImageIcon lips = getScaledImage(featureList[2].getSprite(),
                125 + featureList[2].getSize(), 125 + featureList[2].getSize());

        ImageIcon nose = getScaledImage(featureList[3].getSprite(),
                10 + featureList[3].getSize(), 10 + featureList[3].getSize());

        ImageIcon eyebrows = getScaledImage(featureList[4].getSprite(),
                175 + featureList[4].getSize(), 10 + featureList[4].getSize());

        JLabel HEADlabel = new JLabel(head);
        HEADlabel.setBounds(200,100,500,500);

        JLabel HAIRlabel = new JLabel(hair);
        HAIRlabel.setBounds(featureList[0].getX(), featureList[0].getY(),500,500);

        JLabel EYESlabel = new JLabel(eyes);
        EYESlabel.setBounds(200,50,500,500);

        JLabel LIPSlabel = new JLabel(lips);
        LIPSlabel.setBounds(200,200,500,500);

        JLabel NOSElabel = new JLabel(nose);
        NOSElabel.setBounds(200,100,500,500);

        JLabel EYEBROWSlabel = new JLabel(eyebrows);
        EYEBROWSlabel.setBounds(200,0,500,500);

        JLayeredPane layers = new JLayeredPane();


        layers.add(HEADlabel, new Integer (1));
        layers.add(EYEBROWSlabel, new Integer(2));
        layers.add(EYESlabel, new Integer(3));
        layers.add(HAIRlabel, new Integer(4));
        layers.add(LIPSlabel, new Integer(5));
        layers.add(NOSElabel, new Integer(6));


        setLayout(null);
        layers.setBounds(0,0,1000,700);
        add(layers);
        Dimension fDimensions = new Dimension(1000,700);
//        facePanel.setMinimumSize(fDimensions);
//        add(facePanel);
        setMinimumSize(fDimensions);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        pack();
//        setLocationRelativeTo(null);
        setVisible(true);




    }

    public ImageIcon getScaledImage(ImageIcon srcImg, int w, int h){
//        ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image to a imageIcon
        Image image = srcImg.getImage(); // transform it
        Image newimg = image.getScaledInstance(w, h,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon imageIcon = new ImageIcon(newimg);  // transform it back

        return imageIcon;
    }

    public void updateWeirdness(int stanLee){
        weird.setWeirdnessLevel(stanLee);
    }

//
//    public static void main (String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new FaceBuilder();
//            }
//        });
//    }




}


