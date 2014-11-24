package at.monkeybrain.gameframework;

/**
 * Created by captain on 12.11.14.
 */
public interface Audio {
    public Music createMusic(String file);

    public Sound createSound(String file);
}
