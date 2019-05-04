import comp124graphics.CanvasWindow;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.util.Random;



public class MainWindow{

    protected Random random = new Random();   //this object will be used to generate random numbers


    public MainWindow() {
        JFrame frame = new JFrame("Avatar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel)frame.getContentPane();

        JLabel label = new JLabel();

        Feature [] spriteList = {new Eyes(), new Lips(), new Hair(), new Nose(), new Brow(), new Head()};

//        int index = random.nextInt(spriteList.length);  //a random integer less than or equal to the size of
//        System.out.println(spriteList[index].getSprite());
//
////        ImageIcon image = getScaledImage(spriteList[index].getSprite(),500,500);
//        ImageIcon image = spriteList[index].getSprite();
//
//        label.setIcon(image);
//
//        label.setLocation(0, 0);
//        panel.add(label);
//
//        frame.setLocationRelativeTo(null);
//        frame.pack();
//        frame.setVisible(true);

        for (int i =0; i< 4; i++){


            int index = random.nextInt(spriteList.length);  //a random integer less than or equal to the size of
            System.out.println(spriteList[i].getSprite());

            ImageIcon image = getScaledImage(spriteList[i].getSprite(),500,500);
            label.setIcon(image);

            label.setLocation(0, 0);
            panel.add(label);

            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);
//
////            win.addIm(spriteList[i].getSprite());
        }
////        label.setIcon(new ImageIcon("src/img/school.png"));


    }

    public ImageIcon getScaledImage(ImageIcon srcImg, int w, int h){
//        ImageIcon imageIcon = new ImageIcon("./img/imageName.png"); // load the image to a imageIcon
        Image image = srcImg.getImage(); // transform it
        Image newimg = image.getScaledInstance(w, h,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        ImageIcon imageIcon = new ImageIcon(newimg);  // transform it back

        return imageIcon;
    }


    public static void main (String args[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MainWindow();
            }
        });
        
//        win = new CanvasWindow("Avatar", 500, 500);



//        System.out.println(feature.spriteList.size());
//        feature.printSprite();


    }




}
