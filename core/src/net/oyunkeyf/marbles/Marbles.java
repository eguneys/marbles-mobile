package net.oyunkeyf.marbles;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import net.oyunkeyf.marbles.screens.MainMenu;
import net.oyunkeyf.marbles.controllers.MenuController;

public class Marbles extends Game {

	public AssetManager manager = new AssetManager();

  private TextureAtlas textures;

	public TextureAtlas getAtlas() {
		return textures;
	}

	public TextureRegion findAtlasRegion(String name) {
		return textures.findRegion(name);
	}

	@Override
	public void create () {
		manager.load("sprites.atlas", TextureAtlas.class);
		// sync loading
		manager.finishLoading();

		textures = manager.get("sprites.atlas", TextureAtlas.class);
		setScreen(new MainMenu(this));
	}

	@Override
	public void dispose () {
		super.dispose();
	}
}
