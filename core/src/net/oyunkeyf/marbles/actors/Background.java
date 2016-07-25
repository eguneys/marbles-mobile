package net.oyunkeyf.marbles.actors;

import com.badlogic.gdx.scenes.scene2d.Actor;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import net.oyunkeyf.marbles.utils.AssetLoader;
import net.oyunkeyf.marbles.utils.Constants;

public class Background extends Actor {

	private TextureRegion background;

	public Background() {
		background = AssetLoader.getTextureRegion("DIALOG_BG");
		this.setSize(Constants.APP_WIDTH, Constants.APP_HEIGHT);
	}

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(background, 0, 0, getWidth(), getHeight());
	}
}
