package net.oyunkeyf.marbles.inputs;

import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.input.GestureDetector.GestureAdapter;

import net.oyunkeyf.marbles.controllers.MenuController;

public class MenuInputs extends GestureAdapter {

	private MenuController ctrl;

	private MenuInputs(MenuController ctrl) {
		this.ctrl = ctrl;
	}

	public static GestureDetector getDetector(MenuController ctrl) {
		return new GestureDetector(new MenuInputs(ctrl));
	}

	@Override
	public boolean fling(float vX, float vY, int button) {
		System.out.println("fling: (" + vX + "," + vY + ")");
		ctrl.screenX = (int) vX / 50 * -1;
		ctrl.screenY = (int) vY / 50;
		return true;
	}
	
}
