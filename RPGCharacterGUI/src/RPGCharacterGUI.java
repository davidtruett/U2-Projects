import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {

    JFrame frame;
    JPanel panel;
    Color background = new Color(0,0,0);
    int strength = Integer.parseInt(JOptionPane.showInputDialog("What is the strength? (Out of 10)"));
    int speed = Integer.parseInt(JOptionPane.showInputDialog("What is the speed? (Out of 10)"));
    int spirit = Integer.parseInt(JOptionPane.showInputDialog("What is the spirit? (Out of 10)"));
    int iq = Integer.parseInt(JOptionPane.showInputDialog("What is the IQ? (Out of 10)"));

    int dmgAttack = strength * 10;
    int strikeSpd = speed * 10;
    int spellStrength = spirit * 10;
    int charIq = iq * 10;

    public RPGCharacterGUI(){
        frame = new JFrame("RPG");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        JButton button = new JButton("give stats");

        JPanel panel = new RPGCharacterGUI.RPGCharacter();
        button.addActionListener(new ButtonListener());

        //input boxes 

        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
    private class RPGCharacter extends JPanel{
        public RPGCharacter(){
            //Set the background color
            setBackground(background);
        }
    }
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent) {
            JOptionPane.showMessageDialog(null, "\nyour attack damage is: "+ dmgAttack+
                    "\nyour strike speed is: "+ strikeSpd+
                    "\nyour spell strength is: "+ spellStrength+
                    "\nyour IQ is: "+ charIq);

        }
    }

}
