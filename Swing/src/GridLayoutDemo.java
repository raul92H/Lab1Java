import javax.swing.*;
import java.awt.*;

// class GridLayout extends JFrame
public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {

        // Creating Object P1 of JPanel class
        JPanel p1 = new JPanel();

        // set the layout
        p1.setLayout(new GridLayout(5, 4));

        // Creating Object of "FlowLayout" class
        FlowLayout layout = new FlowLayout();

        // Creating Object P2 of JPanel class
        JPanel p2 = new JPanel();

        // set the layout
        p2.setLayout(layout);

        // Declaration of objects of JLabel class.
        JLabel one, two, three, four;

        // Declaration of objects of JTextField class.
        JTextField tname;
        JRadioButton tusi2;
        JRadioButton tusi3;
        JRadioButton tusi4;

        JComboBox tverde;
        JComboBox trosu;
        JComboBox talbastru;

        // Declaration of objects of JButton class.
        JButton buttonSave, buttonExit;

        // Initialization of object
        // "one" of JLabel class.
        one = new JLabel("Nume Masina");

        // Initialization of object
        // "tname" of JTextField class.
        tname = new JTextField(20);

        // Initialization of object
        // "two" of JLabel class.
        two = new JLabel("Nr usi:");

        // Initialization of object
        // "tcode" of JTextField class.
        tusi2 = new JRadioButton("2");
        tusi3 = new JRadioButton("3");
        tusi4 = new JRadioButton("4");

        three = new JLabel("Culoare:");

        final DefaultComboBoxModel culoare = new DefaultComboBoxModel();

        culoare.addElement("Verde");
        culoare.addElement("Albastru");
        culoare.addElement("Rosu");

        final JComboBox culoareCombo = new JComboBox(culoare);
        culoareCombo.setSelectedIndex(0);

        JScrollPane fruitListScrollPane = new JScrollPane(culoareCombo);
        JButton showButton = new JButton("Show");



        // Initialization of object
        // "buttonsave" of JButton class.
        buttonSave = new JButton("SAVE");

        // Initialization of object
        // "buttonexit" of JButton class.
        buttonExit = new JButton("EXIT");

        // Adding Jlabel "one" on JFrame.
        p1.add(one);

        // Adding JTextField "tname" on JFrame.
        p1.add(tname);

        // Adding Jlabel "two" on JFrame.
        p1.add(two);

        p1.add(tusi2, 3);
        p1.add(tusi3 , 3);
        p1.add(tusi4 , 3);

        p1.add(three);

        // Adding JButton "buttonsave" on JFrame.
        p2.add(buttonSave);

        // Adding JButton "buttonexit" on JFrame.
        p2.add(buttonExit);

        // add the p1 object which
        // refer to the Jpanel
        add(p1, "North");

        // add the p2 object which
        // refer to the Jpanel
        add(p2, "South");

        // Function to set visible
        // status of JFrame.
        setVisible(true);

        // this Keyword refers to current
        // object. Function to set size of JFrame.
        this.setSize(800, 800);
    }

    // Main Method
    public static void main(String args[])
    {

        // calling the constructor
        new GridLayoutDemo();
    }
}
