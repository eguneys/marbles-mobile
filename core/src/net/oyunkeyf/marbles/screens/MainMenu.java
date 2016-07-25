package net.oyunkeyf.marbles.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;

import net.oyunkeyf.marbles.Marbles;
import net.oyunkeyf.marbles.stages.MainStage;

public class MainMenu extends ScreenAdapter {

	private MainStage stage;

	private Marbles game;

	public MainMenu(Marbles game) {
		this.game = game;
	}

	public void show() {
		stage = new MainStage(game);
	}

	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.draw();
		stage.act(delta);
	}
}
