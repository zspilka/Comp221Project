import comp124graphics.CanvasWindow;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;


public class MainWindow{

    protected static CanvasWindow win;


    public MainWindow() {
        JFrame frame = new JFrame("Avatar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = (JPanel)frame.getContentPane();

        JLabel label = new JLabel();

        Feature [] spriteList = {new Eyes(), new Lips(), new Hair(), new Nose(), new Brow()};
        for (int i =0; i< spriteList.length; i++){
            System.out.println(spriteList[i].getSprite());


            ImageIcon image = getScaledImage(spriteList[i].getSprite(),10,13);
            label.setIcon(image);

            label.setLocation(100, 100);
            panel.add(label);

            frame.setLocationRelativeTo(null);
            frame.pack();
            frame.setVisible(true);

//            win.addIm(spriteList[i].getSprite());
        }
//        label.setIcon(new ImageIcon("src/img/school.png"));


    }

    private ImageIcon getScaledImage(ImageIcon srcImg, int w, int h){
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
