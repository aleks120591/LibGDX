package com.test.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyTestGame implements ApplicationListener {

	private Texture texture;
	private SpriteBatch batch;
	private TextureRegion region;

	@Override
	public void create () {
		texture = new Texture("data/texture011.png");
		batch = new SpriteBatch();
		region = new TextureRegion(texture, 0, 0, 50, 50);
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void render () {
		batch.begin();
		batch.draw(texture, 100, 100);
		batch.end();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {

	}
}
