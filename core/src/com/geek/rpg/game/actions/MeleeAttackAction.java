package com.geek.rpg.game.actions;

import com.badlogic.gdx.graphics.Texture;
import com.geek.rpg.game.*;

public class MeleeAttackAction extends BaseAction {
    public MeleeAttackAction() {
        btnTexture = new Texture("btnAttack.png");
    }

    @Override
    public boolean action(AbstractUnit me) {
        if (me.getTarget() == null) return false;
        if (me.getTarget().getClass().equals(me.getClass())) return false;
        me.setAttackAction(1.0f);
        if (!Calculator.isTargetEvaded(me, me.getTarget())) {
            int dmg = Calculator.getMeleeDamage(me, me.getTarget());
            me.getTarget().changeHp(-dmg);
        } else {
            me.getTarget().evade();
        }
        return true;
    }
}
