package net.oyunkeyf.marbles.utils;

import com.badlogic.gdx.scenes.scene2d.Actor;

public class PimpedActor {

	public static Actor create(Actor actor, float x, float y, float width, float height) {
		actor.setBounds(x, y, width, height);
		return actor;
	}
	
}
