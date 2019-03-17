package action;

import base.GameObject;

/**
 * Create action modified by user
 */
public abstract class ActionAdapter implements Action {
    @Override
    public boolean run(GameObject owner) {
        return false;
    }

    @Override
    public void reset() {

    }
}
