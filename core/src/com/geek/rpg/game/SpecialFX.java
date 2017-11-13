package com.geek.rpg.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class SpecialFX {
    private Vector2 position;
    private float time;
    private float speed;
    private float maxTime;
    private int maxFrames;
    private Texture texture;
    private TextureRegion[] regions;

    public boolean isActive() {
        return time > 0.0f;
    }

    public SpecialFX() {
        position = new Vector2(0, 0);
        maxFrames = 64;
        speed = 0.01f;
        time = -1.0f;
        maxTime = maxFrames * speed;
        texture = new Texture("explosion64.png");
        TextureRegion[][] tr = new TextureRegion(texture).split(64, 64);
        regions = new TextureRegion[maxFrames];
        int counter = 0;
        for (int i = 0; i < tr.length; i++) {
            for (int j = 0; j < tr[0].length; j++) {
                regions[counter] = tr[i][j];
                counter++;
            }
        }
    }

    public void setup(float x, float y) {
        position.set(x, y);
        time = 0.01f;
    }

    public void render(SpriteBatch batch) {
        if (isActive()) {
            batch.draw(regions[(int) (time / speed)], position.x - 32, position.y - 32, 32, 32, 64, 64, 5, 5, 0);
        }
    }

    public void update(float dt) {
        if (isActive()) {
            time += dt;
            if (time > maxTime) {
                time = -1.0f;
            }
        }
    }
}
