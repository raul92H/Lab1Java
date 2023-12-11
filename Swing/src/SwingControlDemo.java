import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingControlDemo {
    private JFrame mainFrame;
    private JLabel headerLabel;
    private JLabel statusLabel;
    private JPanel controlPanel;

    public SwingControlDemo(){
        prepareGUI();
    }
    public static void main(String[] args){
        SwingControlDemo  swingControlDemo = new SwingControlDemo();
        swingControlDemo.showLabelDemo();
    }
    private void prepareGUI(){
        mainFrame = new JFrame("Tipuri de masini");
        mainFrame.setSize(400,400);
        mainFrame.setLayout(new GridLayout(5, 2));

        mainFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        headerLabel = new JLabel("", JLabel.CENTER);
        statusLabel = new JLabel("",JLabel.CENTER);
        statusLabel.setSize(350,100);
        controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        mainFrame.add(headerLabel);
        mainFrame.add(controlPanel);
        mainFrame.add(statusLabel);
        mainFrame.setVisible(true);
    }
    private void showLabelDemo(){
        headerLabel.setText("Masini");
        JLabel label  = new JLabel("Nume masina:", JLabel.RIGHT);
        JTextField textField = new JTextField("Introdu numele masinii");
        final JTextField userText = new JTextField(6);
        label.setOpaque(true);
        label.setBackground(Color.GRAY);
        label.setForeground(Color.WHITE);
        JButton submitButton = new JButton("Submit");
        JButton cancelButton = new JButton("Cancel");
        controlPanel.add(label);
        controlPanel.add(submitButton);
        controlPanel.add(cancelButton);

        mainFrame.setVisible(true);
    }
}