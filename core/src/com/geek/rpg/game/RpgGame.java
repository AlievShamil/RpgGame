package com.geek.rpg.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RpgGame extends Game {
    /* WISH LIST
    - + GameScreen -> BattleScreen
    - добавить поведение ботам(хоть какие-то мозги) в зависимости от ХП
    - сбрасывать выбор персонажа
    - Effect factory
    - Actions list для персонажей
    - Подсчитывать раунды
    - Rpg arena with waves(or select battle)
    - Пока не наш ход кнопки не скрывать, а делать полупрозрачными
    - Крит урон
    - Ещё чуть-чуть заботит, что после хода юнита до завершения его анимации
    вызывается getTurn() следующего юнита, где отрабатывают уже
    эффекты этого следующего юнита
     */
    private SpriteBatch batch;
    private BattleScreen battleScreen;

    @Override
    public void create() {
        batch = new SpriteBatch();
        battleScreen = new BattleScreen(batch);
        setScreen(battleScreen);
    }

    @Override
    public void render() {
        float dt = Gdx.graphics.getDeltaTime();
        this.getScreen().render(dt);
    }

    @Override
    public void dispose() {
        batch.dispose();
        battleScreen.dispose();
    }
}