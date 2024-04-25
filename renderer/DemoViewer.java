import javax.swing.*;
import java.awt.*;

public class DemoViewer {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Container pane = f.getContentPane();
        pane.setLayout(new BorderLayout());

        // slider to control horizontal rotation
        JSlider horizontalSlider = new JSlider(0, 360, 180);
        pane.add(horizontalSlider, BorderLayout.SOUTH);

        // slider to control vertical rotation
        JSlider verticalSlider = new JSlider(SwingConstants.VERTICAL, -90, 90, 0);
        pane.add(verticalSlider, BorderLayout.EAST);

        // panel to show render resuults
        JPanel renderPanel = new JPanel() {
            public void paintComponents(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.BLACK);
                g2.fillRect(0, 0, getWidth(), getHeight());

                // rendering magic
            }
        };
        pane.add(renderPanel, BorderLayout.CENTER);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}