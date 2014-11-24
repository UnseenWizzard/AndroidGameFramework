package at.monkeybrain.gameframework.implementation;

import java.util.List;

import android.view.View.OnTouchListener;

import at.monkeybrain.gameframework.Input.TouchEvent;

/**
 * Created by captain on 13.11.14.
 */
public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<TouchEvent> getTouchEvents();
}
