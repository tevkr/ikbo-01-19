package pckg;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private int currentImage = 0, totalImages = 12;
    private JLabel animationDisplayLabel = new JLabel();
    private Timer animationTimer;
    protected ImageIcon[] images = new ImageIcon[totalImages];
    public Main() {
        for (int count = 0; count < totalImages; count++){
            int x = count+1;
            images[count] = new ImageIcon(this.getClass().getResource("/" + x + ".png"));
        }

        startAnimation();
    }
    public void startAnimation() {
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentImage = (currentImage + 1) % images.length;
                animationDisplayLabel.setIcon(images[currentImage]);
            }
        };
        animationDisplayLabel.setIcon(images[0]);
        animationTimer = new Timer(110, listener);
        animationTimer.start();
    }
    public JComponent getAnimationComponent() {
        return animationDisplayLabel;
    }
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                Main fp = new Main();
                JFrame f = new JFrame("Animation");
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.add(fp.getAnimationComponent());
                f.pack();
                f.setLocationByPlatform(true);
                f.setVisible(true);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
