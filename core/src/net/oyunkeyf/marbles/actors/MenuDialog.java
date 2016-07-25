package net.oyunkeyf.marbles.actors;

import com.badlogic.gdx.Gdx;


import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.ui.VerticalGroup;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Interpolation;


import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;

import net.oyunkeyf.marbles.Marbles;
import net.oyunkeyf.marbles.utils.AssetLoader;
import net.oyunkeyf.marbles.utils.Constants;
import net.oyunkeyf.marbles.utils.PimpedActor;


// fix this
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton.ImageButtonStyle;

public class MenuDialog extends Group {

	public MenuDialog(Marbles game, Rectangle bounds) {
		this.setBounds(bounds.x, bounds.y, bounds.width, bounds.height);
		this.setScale(0);

		float width = getWidth();
		float height = getHeight();

		addActor(PimpedActor.create(new Image(game.findAtlasRegion("DIALOG_MENU_BG")), 0, 0, getWidth(), getHeight()));

		float rowPadX = width * 0.1f;
		float rowPadY = height * 0.1f;
		float rowHeight = height * 0.15f;
		float rowWidth = width * 0.8f;

		Skin skin = new Skin(game.getAtlas());

		ImageButtonStyle buttonStyle = new ImageButtonStyle();
		buttonStyle.up = skin.getDrawable("DIALOG_MENU_PLAY_OFF");
		buttonStyle.down = skin.getDrawable("DIALOG_MENU_PLAY_ON");
		addActor(PimpedActor.create(new ImageButton(buttonStyle),
																rowPadX,
																rowPadY,
																rowWidth / 2,
																rowHeight));

		ImageButtonStyle buttonStyle2 = new ImageButtonStyle();
		buttonStyle2.up = skin.getDrawable("DIALOG_MENU_QUIT_OFF");
		buttonStyle2.down = skin.getDrawable("DIALOG_MENU_QUIT_ON");
		addActor(PimpedActor.create(new ImageButton(buttonStyle2),
																rowPadX + rowWidth / 2,
																rowPadY,
																rowWidth / 2,
																rowHeight));

		addAction(Actions.sequence(Actions.delay(1f),
															 Actions.scaleTo(1, 1, 0.6f, Interpolation.bounceOut)));
	}

	// @Override
	// public void draw(Batch batch, float parentAlpha) {
	// 	batch.draw(background, getX(), getY(), 
	// 						 getWidth() / 2, getHeight() / 2,
	// 						 getWidth(), getHeight(), getScaleX(), getScaleY(), 0);
	// }
	
}
