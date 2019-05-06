import comp124graphics.GraphicsObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//java -Xmx200M MainWindowGUI


public class MainWindowGUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    private JButton avatarButton;
    private FaceBuilder faceBuilder;
    protected JButton quit;


    public MainWindowGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        faceBuilder = new FaceBuilder();
        add(faceBuilder, BorderLayout.CENTER);

//        JToolBar tb = new JToolBar();
//        add(tb, BorderLayout.NORTH);
//
//        quit = new JButton("Quit");
//        quit.setActionCommand("quit");
//        quit.addActionListener(this);
//        tb.add(quit);
//
//        tb.add(new JToolBar.Separator());
//
//
//        avatarButton = new JButton("New Avatar");
//        tb.add(avatarButton);
//        avatarButton.addActionListener(this);


        pack();
        Dimension winDim = new Dimension(500,500);
        setMinimumSize(winDim);
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

//    public void click(AbstractButton button, int millis) throws AWTException
//    {
//        Point p = button.getLocationOnScreen();
//        Robot r = new Robot();
//        r.mouseMove(p.x + button.getWidth() / 2, p.y + button.getHeight() / 2);
//        r.mousePress(InputEvent.BUTTON1_MASK);
//        try { Thread.sleep(millis); } catch (Exception e) {}
//        r.mouseRelease(InputEvent.BUTTON1_MASK);
//    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
