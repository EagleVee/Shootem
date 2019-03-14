import control.ObjectManager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel {

    private BufferedImage backBuffered;

    private Graphics graphics;

    public GameCanvas() {

        this.setSize(1024, 600);

        this.setupBackBuffered();

        this.setVisible(true);
    }

    /**
     * Set up backBuffered to render next frame
     */
    private void setupBackBuffered() {
        this.backBuffered = new BufferedImage(1024, 600, BufferedImage.TYPE_INT_ARGB);
        this.graphics = this.backBuffered.getGraphics();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered, 0, 0, null);
    }

    public void renderAll() {
        ObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

    public void runAll() {
        ObjectManager.instance.runAll();
    }
}
