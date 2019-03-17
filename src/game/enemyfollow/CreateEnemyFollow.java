package game.enemyfollow;

import action.ActionAdapter;
import action.LimitAction;
import action.SequenceAction;
import action.WaitAction;
import base.FrameCounter;
import base.GameObject;
import base.GameObjectManager;

import java.util.Random;

public class CreateEnemyFollow extends GameObject {

    private Random random = new Random();

    public CreateEnemyFollow() {
        this.configAction();
    }

    public void configAction() {
        this.addAction(
                new LimitAction(
                        30,
                        new SequenceAction(
                                new WaitAction(100),
                                new ActionAdapter() {
                                    @Override
                                    public boolean run(GameObject owner) {
                                        EnemyFollow enemyFollow = GameObjectManager.instance.recycle(EnemyFollow.class);
                                        enemyFollow.position.set(random.nextInt(1024), random.nextInt(600));
                                        return true;
                                    }
                                }
                        )
                )
        );
    }


}
