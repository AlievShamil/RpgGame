package com.geek.rpg.game.actions;

import com.badlogic.gdx.graphics.Texture;
import com.geek.rpg.game.AbstractUnit;

public class RestAction extends BaseAction {
    public RestAction() {
        btnTexture = new Texture("btnHeal.png");
    }

    @Override
    public boolean action(AbstractUnit me) {
        me.changeHp((int)(me.getMaxHp() * 0.15f));
        return true;
    }
}
