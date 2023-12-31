package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class Pacman {
    private final Vector2 position = new Vector2();


    public Vector2 getOrigin() {
        return origin;
    }

    private final Vector2 origin = new Vector2();
    private final Texture texture;
    private final TextureRegion textureRegion;


    public Pacman(float x, float y, String textureName) {
        texture = new Texture(textureName);
        textureRegion = new TextureRegion(texture);
        position.set(x, y);
    }

    public Pacman(float x, float y) {
        this(x, y, "pacman_open.png");
    }

    public void render(Batch batch) {
        batch.draw(texture, position.x, position.y);
    }

    public void dispose() {
        texture.dispose();
    }


    public void moveTo(float x, float y) {
        position.set(x, y);
    }
}
