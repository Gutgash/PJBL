import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Calendar;
import javax.swing.*;

public class MarketplaceInterface extends JPanel implements ActionListener {
    JLabel picture;

    public MarketplaceInterface() {
        super(new BorderLayout());

        String[] skinsStrings = { "Vandal Prime", "Vandal Sakura", "Phantom Nebula", "Phantom Glitchpop"};

        JComboBox skinList = new JComboBox(skinsStrings);
        skinList.setSelectedIndex(3);
        skinList.addActionListener(this);

        picture = new JLabel();
        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel(skinsStrings[skinList.getSelectedIndex()]);
        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
        picture.setPreferredSize(new Dimension(1000, 700+10));

        add(skinList, BorderLayout.PAGE_START);
        add(picture, BorderLayout.PAGE_END);
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }


    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String skinName = (String)cb.getSelectedItem();
        updateLabel(skinName);
    }

    protected void updateLabel(String name) {
        ImageIcon icon = createImageIcon("/images/" + name + ".png");
        /* cria a variável de texto */

        picture.setIcon(icon);
        picture.setToolTipText("A drawing of a " + name.toLowerCase());
        /* posição do texto */

        if (icon != null) {
            picture.setText(null);
            /* printa o texto */
        } else {
            picture.setText("Image not found");
        }
    }
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = MarketplaceInterface.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    static void createAndShowGUI() {
        JFrame frame = new JFrame("Rifles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent newContentPane = new MarketplaceInterface();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
