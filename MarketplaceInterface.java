import java.awt.*;
import javax.swing.*;

public class MarketplaceInterface extends JFrame
{
    JComboBox comboBox;

    public MarketplaceInterface()
    {
        Object[] items =
                {
                        new ImageIcon("C:\\Users\\NTC\\IdeaProjects\\untitled\\Images\\Lindomar.jpg"),
                        new ImageIcon("C:\\Users\\NTC\\IdeaProjects\\untitled\\Images\\Shia.jpg"),
                        new ImageIcon("C:\\Users\\NTC\\IdeaProjects\\untitled\\Images\\Cage.jpg")
                };
        comboBox = new JComboBox( items );
        getContentPane().add( comboBox, BorderLayout.NORTH );
    }

    public static void main(String[] args)
    {
        JFrame frame = new MarketplaceInterface();
        frame.setDefaultCloseOperation( EXIT_ON_CLOSE );
        frame.pack();
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
}