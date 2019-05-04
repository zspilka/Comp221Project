import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MainWindowGUI extends JFrame implements MouseListener, MouseListener {

    private JButton avatarButton;
    private FaceBuilder faceBuilder;


    public MainWindowGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());



    }




    public static void main (String[] args) {
        MainWindowGUI frame = new MainWindowGUI();
        frame.setVisible(true);
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new MainWindowGUI();
//            }
//        });


    }
}
