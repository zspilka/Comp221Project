import comp124graphics.GraphicsObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//java -Xmx200M MainWindowGUI


public class MainWindowGUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    private JButton avatarButton;
    private FaceBuilder faceBuilder;
    private JButton quit;
    protected int userWeirdness;
    protected JComboBox<Integer> cb;



    public MainWindowGUI(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        faceBuilder = new FaceBuilder();
        add(faceBuilder, BorderLayout.CENTER);

        JToolBar tb = new JToolBar();
        add(tb, BorderLayout.NORTH);

        quit = new JButton("Quit");
        quit.setActionCommand("Quit");
        quit.addActionListener(this);
        tb.add(quit);

        tb.add(new JToolBar.Separator());


        avatarButton = new JButton("New Avatar");
        avatarButton.setActionCommand("New Avatar");
        avatarButton.addActionListener(this);
        tb.add(avatarButton);

        tb.add(new JToolBar.Separator());

//        JLabel lbl = new JLabel("Select one of the possible choices and click 'New Avatar' ");
//        lbl.setVisible(true);
//        tb.add(lbl);
//        "Select your desired level of weirdness, then hit 'New Avatar'","1","2", "3","4","5","6", "7","8","9","10"
        Integer[] choices = {1,2,3,4,5,6,7,8,9,10};

//        final JComboBox<Integer> cb = new JComboBox<>(choices);
        cb = new JComboBox<>(choices);


        cb.setVisible(true);
//        cb.setSelectedIndex(10);
        cb.addActionListener(this);
        tb.add(cb);



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

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if(cmd.equals("New Avatar")){
            e.getSource();

            Integer value = (int) cb.getSelectedItem();

            userWeirdness = value;
//            System.out.println(userWeirdness);
            faceBuilder.updateWeirdness(userWeirdness);
            createNewAvatar();
        }
        else if (cmd.equals("Quit")){
            System.exit(0);
        }


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



    public void createNewAvatar() {
        faceBuilder.removeAll();
        faceBuilder.updateUI();
//        faceBuilder.repaint();
        faceBuilder = new FaceBuilder();
        add(faceBuilder, BorderLayout.CENTER);
//        faceBuilder.repaint();

    }
}
