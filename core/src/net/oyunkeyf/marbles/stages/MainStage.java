package net.oyunkeyf.marbles.stages;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.ScalingViewport;

import net.oyunkeyf.marbles.Marbles;
import net.oyunkeyf.marbles.inputs.MenuInputs;
import net.oyunkeyf.marbles.controllers.MenuController;
import net.oyunkeyf.marbles.actors.MenuDialog;
import net.oyunkeyf.marbles.utils.PimpedActor;
import net.oyunkeyf.marbles.utils.Constants;

public class MainStage extends Stage {

	private static final int VIEWPORT_WIDTH = Constants.APP_WIDTH;
	private static final int VIEWPORT_HEIGHT = Constants.APP_HEIGHT; 

	private Marbles game;

	public MainStage(Marbles game) {
		super(new ScalingViewport(Scaling.stretch, VIEWPORT_WIDTH, VIEWPORT_HEIGHT, new OrthographicCamera(VIEWPORT_WIDTH, VIEWPORT_HEIGHT)));

		this.game = game;

		OrthographicCamera camera = (OrthographicCamera) getCamera();
		float vWidth = camera.viewportWidth;
		float vHeight = camera.viewportHeight;

		addActor(PimpedActor.create(new Image(game.findAtlasRegion("DIALOG_BG")), 0, 0, vWidth, vHeight));

		addActor(new MenuDialog(game,
														new Rectangle(vWidth * 0.15f,
																					vHeight * 0.12f,
																					vWidth * 0.72f,
																					vHeight * 0.8f)));

		// Gdx.input.setInputProcessor(MenuInputs.getDetector(ctrl));
	}

	// public void draw() {
	// 	OrthographicCamera camera = (OrthographicCamera) getCamera();
	// 	camera.translate(ctrl.screenX, ctrl.screenY);
	// 	ctrl.screenX = 0;
	// 	ctrl.screenY = 0;
	// 	camera.update();
	// 	super.draw();
	// }
	
}
