package pckg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private int milan = 0;
    private int madrid = 0;

    private JButton but1 = new JButton("AC Milan");
    private JButton but2 = new JButton("Real Madrid");
    private JLabel lb1 = new JLabel("Result: " + milan + "X" + madrid);
    private JLabel lb2 = new JLabel("Last scorer: N/A");
    private Label lb3 = new Label("Winner: DRAW");
    Main()
    {
        super("pr_work_4");
        setLayout(new GridLayout());
        setSize(600,200);
        add(but1);
        but1.addActionListener(new ButtonAction());
        add(but2);
        but2.addActionListener(new ButtonAction());
        add(lb1);
        add(lb2);
        add(lb3);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }

    private class ButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            if(actionEvent.getSource() == but1)
            {
                milan++;
                lb2.setText("AC Milan");
            }
            else
            {
                madrid++;
                lb2.setText("Real Madrid");
            }
            lb1.setText("Result: " + milan + "X" + madrid);
            if(milan>madrid)
                lb3.setText("AC Milan");
            else if (milan<madrid)
                lb3.setText("Real Madrid");
            else
                lb3.setText("DRAW");
        }
    }
}
