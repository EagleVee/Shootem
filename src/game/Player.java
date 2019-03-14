package game;

import control.Object;
import control.Vector2D;

public class Player extends Object {

    private Vector2D velocity;

    public Player() {
        this.velocity = new Vector2D();
        this.velocity.set(2, 0);
        this.position.set(0, 0);
    }

    public void run() {
        this.position.addUp(this.velocity);
    }

    /**
     * Getter & Setter
     */
    public Vector2D getVelocity() {
        return velocity;
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }
}
