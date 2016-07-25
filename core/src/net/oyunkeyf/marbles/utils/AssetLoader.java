package net.oyunkeyf.marbles.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
  private static TextureAtlas textures;

	public static void load() {
		textures = new TextureAtlas(Gdx.files.internal("sprites.atlas"));
	}

	public static TextureRegion getTextureRegion(String name) {
		return textures.findRegion(name);
	}
}
