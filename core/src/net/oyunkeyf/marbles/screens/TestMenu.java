package net.oyunkeyf.marbles.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;


import net.oyunkeyf.marbles.utils.AssetLoader;
import net.oyunkeyf.marbles.inputs.MenuInputs;
import net.oyunkeyf.marbles.controllers.MenuController;

public class TestMenu extends ScreenAdapter {
	private SpriteBatch batch;

	private OrthographicCamera camera;

	private Sprite bgImage;

	private MenuController ctrl;

	public TestMenu(MenuController ctrl) {
		this.ctrl = ctrl;

		batch = new SpriteBatch();

		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();

		camera = new OrthographicCamera(100, 100 * (h / w));
		camera.position.set(camera.viewportWidth / 2f, camera.viewportHeight / 2f, 0);
		camera.update();

		bgImage = new Sprite(AssetLoader.getTextureRegion("DIALOG_BG"),
												 0, 0,
												 100, 100);

		Gdx.input.setInputProcessor(MenuInputs.getDetector(ctrl));
	}

	public void render(float delta) {
		batch.setProjectionMatrix(camera.combined);

		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		camera.translate(ctrl.screenX, ctrl.screenY);
		ctrl.screenX = 0;
		ctrl.screenY = 0;
		camera.update();

		batch.begin();
		// Disable transparency
		// this is good for performance when drawing images
		// that do not require transparency
		batch.disableBlending();

		bgImage.draw(batch);

		batch.end();
	}
}
