package com.geek.rpg.game.actions;

import com.badlogic.gdx.graphics.Texture;
import com.geek.rpg.game.AbstractUnit;
import com.geek.rpg.game.effects.DefenceStanceEffect;

public class DefenceStanceAction extends BaseAction {
    public DefenceStanceAction() {
        btnTexture = new Texture("btnDefence.png");
    }

    @Override
    public boolean action(AbstractUnit me) {
        DefenceStanceEffect dse = new DefenceStanceEffect();
        dse.start(me.getGame().getInfoSystem(), me, 1);
        me.addEffect(dse);
        return true;
    }
}
