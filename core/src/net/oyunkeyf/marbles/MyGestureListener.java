package net.oyunkeyf.marbles;

import com.badlogic.gdx.input.GestureDetector.GestureAdapter;

import com.badlogic.gdx.graphics.OrthographicCamera;

public class MyGestureListener extends GestureAdapter {

    private OrthographicCamera camera;

    public MyGestureListener(OrthographicCamera camera) {
        this.camera = camera;
    }

    public boolean fling(float vX, float vY, int button) {
        camera.translate(vX, vY, 0);
        return true;
    }

}
