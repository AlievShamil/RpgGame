package com.geek.rpg.game.actions;

import com.badlogic.gdx.graphics.Texture;
import com.geek.rpg.game.AbstractUnit;

public abstract class BaseAction {
    Texture btnTexture;

    public Texture getBtnTexture() {
        return btnTexture;
    }

    public abstract boolean action(AbstractUnit me);
}
