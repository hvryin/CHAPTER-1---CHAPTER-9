/**
 *
 * @author hvryn
 */
import java.awt.*;
import javax.swing.*;

public class Labeltest extends JFrame {
    private JLabel label1, label2;
    
    public Labeltest(){
       super("testing JLabel");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       
       label1 = new JLabel("Label with text");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(275,200);
       setVisible(true);
       Icon dino = new ImageIcon("/Users/hvryn/Desktop/55cbbf78204c608aedcc4ff220c39c57.jpg");
       label2 = new JLabel("Label with text and icon", dino,SwingConstants.LEFT);
       label2.setToolTipText("This is an animated dino");
       container.add(label2);

    }
    public static void main(String[] args) {
        Labeltest application = new Labeltest();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


    

