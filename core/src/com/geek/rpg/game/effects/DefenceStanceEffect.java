package com.geek.rpg.game.effects;


import com.geek.rpg.game.AbstractUnit;
import com.geek.rpg.game.FlyingText;
import com.geek.rpg.game.InfoSystem;

public class DefenceStanceEffect extends Effect {
    @Override
    public void start(InfoSystem infoSystem, AbstractUnit unit, int rounds) {
        super.start(infoSystem, unit, rounds);
        unit.setDefence(unit.getDefence() + 3);
        infoSystem.addMessage("Shields UP!!! +3", unit, FlyingText.Colors.GREEN);
    }

    @Override
    public void end() {
        unit.setDefence(unit.getDefence() - 3);
        infoSystem.addMessage("Shields DOWN!!! -3", unit, FlyingText.Colors.WHITE);
    }
}
