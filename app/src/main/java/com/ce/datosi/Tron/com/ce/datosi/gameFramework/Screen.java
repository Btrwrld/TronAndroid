package com.ce.datosi.Tron.com.ce.datosi.gameFramework;

import com.ce.datosi.Tron.com.ce.datosi.gameFramework.Game;

/**
 * Created by erick on 9/28/2016.
 */

public abstract class Screen {
    protected final Game game;

    public Screen(Game game) {
        this.game = game;
    }

    public abstract void update(float deltaTime);

    public abstract void paint(float deltaTime);

    public abstract void pause();

    public abstract void resume();

    public abstract void dispose();

    public abstract void backButton();
}
