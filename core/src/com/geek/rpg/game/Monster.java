package com.geek.rpg.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.geek.rpg.game.actions.BaseAction;

public class Monster extends AbstractUnit {
    BaseAction attack;
    BaseAction randomAbility;

    public Monster(BattleScreen game, Vector2 position, AbstractUnit target, BaseAction attack, BaseAction randomAbility) {
        super(game, position, new Texture("skeleton.png"));
        this.target = target;
        this.name = "Skelet";
        this.maxHp = 50;
        this.hp = this.maxHp;
        this.level = 1;
        this.strength = 12;
        this.dexterity = 5;
        this.endurance = 5;
        this.spellpower = 0;
        this.defence = 1;
        this.flip = true;
        this.attack = attack;
        this.randomAbility = randomAbility;
    }

    public boolean ai(float dt) {
        if (!game.canIMakeTurn()) return false;
        int r = (int) (Math.random() * 2);
        if (r == 0) return attack.action(this);
        if (r == 1) return randomAbility.action(this);
        return false;
    }
}
