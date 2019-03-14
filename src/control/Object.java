package control;

import renderer.Renderer;

import java.awt.*;

public class Object {

    protected Vector2D position;
    protected Renderer renderer;

    public void run() {

    }

    public void render(Graphics graphics) {
        if (this.renderer != null)
        this.renderer.render(graphics, this.position);
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(float x, float y) {
        this.position.set(x, y);
    }
}
